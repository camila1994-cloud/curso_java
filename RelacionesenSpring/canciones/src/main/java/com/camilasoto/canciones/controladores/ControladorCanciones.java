package com.camilasoto.canciones.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.camilasoto.canciones.modelos.Cancion;
import com.camilasoto.canciones.servicios.ServicioCanciones;
import com.camilasoto.canciones.servicios.ServicioArtistas;

import jakarta.validation.Valid;

@Controller
public class ControladorCanciones {

    @Autowired
    private ServicioCanciones servicioCanciones;

    @Autowired
    private ServicioArtistas servicioArtistas;

    // Lista
    @GetMapping("/canciones")
    public String desplegarCanciones(Model model) {
        model.addAttribute("listaCanciones", servicioCanciones.obtenerTodasLasCanciones());
        return "canciones";
    }

    // Detalle
    @GetMapping("/canciones/detalle/{idCancion}")
    public String desplegarDetalleCancion(@PathVariable Long idCancion, Model model) {
        model.addAttribute("cancion", servicioCanciones.obtenerCancionPorId(idCancion));
        return "detalleCancion";
    }

    // Formulario agregar
    @GetMapping("/canciones/formulario/agregar")
    public String formularioAgregarCancion(Model model) {
        model.addAttribute("cancion", new Cancion());
        model.addAttribute("listaArtistas", servicioArtistas.obtenerTodosLosArtistas());
        return "agregarCancion";
    }

    // procesar agregar
    @PostMapping("/canciones/procesa/agregar")
    public String procesarAgregarCancion(
            @Valid @ModelAttribute("cancion") Cancion cancion,
            BindingResult result,
            Model model) {

        if (result.hasErrors()) {
            model.addAttribute("listaArtistas", servicioArtistas.obtenerTodosLosArtistas());
            return "agregarCancion";
        }

        Long idArtista = cancion.getArtista().getId();
        if (idArtista == null) {
            result.rejectValue("artista.id", "error.artista", "Debes seleccionar un artista");
            model.addAttribute("listaArtistas", servicioArtistas.obtenerTodosLosArtistas());
            return "agregarCancion";
        }

        cancion.setArtista(servicioArtistas.obtenerArtistaPorId(idArtista));
        servicioCanciones.agregarCancion(cancion);

        return "redirect:/canciones";
    }

    // Formulario ediatr
    @GetMapping("/canciones/formulario/editar/{idCancion}")
    public String formularioEditarCancion(@PathVariable Long idCancion, Model model) {

        Cancion cancion = servicioCanciones.obtenerCancionPorId(idCancion);
        if (cancion == null) {
            return "redirect:/canciones";
        }

        model.addAttribute("cancion", cancion);
        model.addAttribute("listaArtistas", servicioArtistas.obtenerTodosLosArtistas());
        return "editarCancion";
    }

    // Procesar editar
    @PutMapping("/canciones/procesa/editar/{idCancion}")
    public String procesarEditarCancion(
            @Valid @ModelAttribute("cancion") Cancion cancion,
            BindingResult result,
            @PathVariable Long idCancion,
            Model model) {

        if (result.hasErrors()) {
            model.addAttribute("listaArtistas", servicioArtistas.obtenerTodosLosArtistas());
            return "editarCancion";
        }

        Long idArtista = cancion.getArtista().getId();
        cancion.setArtista(servicioArtistas.obtenerArtistaPorId(idArtista));

        cancion.setId(idCancion);
        servicioCanciones.actualizaCancion(cancion);

        return "redirect:/canciones";
    }

    // Eliminar
    @DeleteMapping("/canciones/eliminar/{idCancion}")
    public String procesarEliminarCancion(@PathVariable Long idCancion) {
        servicioCanciones.eliminaCancion(idCancion);
        return "redirect:/canciones";
    }
}

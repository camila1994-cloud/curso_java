package com.camilasoto.canciones.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.camilasoto.canciones.modelos.Cancion;
import com.camilasoto.canciones.servicios.ServicioCanciones;

import jakarta.validation.Valid;

@Controller
public class ControladorCanciones {
    @Autowired
    private ServicioCanciones servicioCanciones;

    //Mostrar todas las canciones 
    @GetMapping("/canciones")
    public String desplegarCanciones(Model model) {
        model.addAttribute("listaCanciones", servicioCanciones.obtenerTodasLasCanciones());
        return "canciones";
    }

    //Ver detalle de cancion 
    @GetMapping("/canciones/detalle/{idCancion}")
    public String desplegarDetalleCancion(@PathVariable("idCancion") Long idCancion, Model model) {
        model.addAttribute("cancion", servicioCanciones.obtenerCancionPorId(idCancion));
        return "detalleCancion";
    }

    //Ver formulario para agregar cancion
    @GetMapping("/canciones/formulario/agregar")
    public String formularioAgregarCancion(Model model) {
        model.addAttribute("cancion", new Cancion());
        return "agregarCancion"; 
    }

    //Procesar el formulario de agregar cancion
    @PostMapping("/canciones/procesa/agregar")
    public String procesarAgregarCancion(@Valid @ModelAttribute("cancion") Cancion cancion,
        BindingResult result,
        Model model) {
            if (result.hasErrors()) {
                return "agregarCancion";
    }

    //Guarda la cancion
    servicioCanciones.agregarCancion(cancion);

    //Redirigir a la lista de canciones
    return "redirect:/canciones";
    }

    @GetMapping("/canciones/formulario/editar/{idCancion}")
public String formularioEditarCancion(@PathVariable("idCancion") Long idCancion, Model model) {
    Cancion cancion = servicioCanciones.obtenerCancionPorId(idCancion);
    if (cancion == null) {
        return "redirect:/canciones";
    }
    // El atributo debe llamarse "cancion" para que Spring lo encuentre
    model.addAttribute("cancion", cancion);
    return "editarCancion";
}

    // Procesar la edición de una canción existente
    @PutMapping("/canciones/procesa/editar/{idCancion}")
    public String procesarEditarCancion(@Valid @ModelAttribute("cancion") Cancion cancion,
    BindingResult result,
    @PathVariable("idCancion") Long idCancion, Model model) {
        if(result.hasErrors()) {
            Cancion cancionActual = servicioCanciones.obtenerCancionPorId(idCancion);
            model.addAttribute("cancionActual", cancionActual);
            return "editarCancion";
        }

    //Asignar el ID recibido al objeto Cancion para actualizar el registro correcto
    cancion.setId(idCancion);
    //Actualizar la canción usando el servicio
    servicioCanciones.actualizaCancion(cancion);
    //Redirigir a la lista de canciones
    return "redirect:/canciones";
}



}

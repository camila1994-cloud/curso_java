package com.camilasoto.canciones.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.camilasoto.canciones.modelos.Artista;
import com.camilasoto.canciones.servicios.ServicioArtistas;

import jakarta.validation.Valid;

@Controller
public class ControladorArtistas {

    @Autowired
    private ServicioArtistas servicioArtistas;

    // Mostrar lista de artistas
    @GetMapping("/artistas")
    public String desplegarArtistas(Model model) {
        model.addAttribute("listaArtistas", servicioArtistas.obtenerTodosLosArtistas());
        return "artistas";
    }

    // Mostrar detalle de un artista
    @GetMapping("/artistas/detalle/{idArtista}")
    public String desplegarDetalleArtista(@PathVariable("idArtista") Long idArtista, Model model) {
        Artista artista = servicioArtistas.obtenerArtistaPorId(idArtista);

        if (artista == null) {
            return "redirect:/artistas";
        }

        model.addAttribute("artista", artista);
        return "detalleArtista";
    }

    // Formulario para agregar un artista
    @GetMapping("/artistas/formulario/agregar")
    public String formularioAgregarArtista(Model model) {

        model.addAttribute("artista", new Artista());
        return "agregarArtista";
    }

    // Procesar formulario para agregar un artista
    @PostMapping("/artistas/procesa/agregar")
    public String procesarAgregarArtista(
            @Valid Artista artista,
            BindingResult resultado,
            Model model) {

        if (resultado.hasErrors()) {
            return "agregarArtista";
        }

        servicioArtistas.agregarArtista(artista);
        return "redirect:/artistas";
    }
}

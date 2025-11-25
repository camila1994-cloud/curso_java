package com.camilasoto.libros_y_autores.controladores;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;


@Controller
public class ControladorLibros {
    private static HashMap<String, String> listaLibros = new HashMap<>();

    public ControladorLibros() {
        listaLibros.put("Odisea", "Homero");	
        listaLibros.put("Don Quijote de la Mancha", "Miguel de Cervantes");
        listaLibros.put("El Código Da Vinci", "Dan Brown");		
        listaLibros.put("Alicia en el país de las maravillas", "Lewis Carroll");
        listaLibros.put("El Hobbit", "J.R.R. Tolkien");	
        listaLibros.put("El alquimista", "Paulo Coelho");
    }

    @GetMapping("/libros")
    public String obtenerTodosLosLibros(Model modelo) {
        modelo.addAttribute("listaLibros", listaLibros);
        return "libros";
    }

    @GetMapping("/libros/{nombre}")
	public String obtenerInformacionDeLibro(@PathVariable String nombre, Model modelo) {
		if (listaLibros.containsKey(nombre)) {
			modelo.addAttribute("nombreLibro", nombre);
			modelo.addAttribute("nombreAutor", listaLibros.get(nombre));
		} else {
			modelo.addAttribute("mensaje", "El libro no se encuentra en nuestra lista.");
		}

		return "detalleLibro";
	}

	@GetMapping("/libro/formulario")
	public String formularioLibro() {
		return "formularioLibros";
	}

	@PostMapping("/procesa/libros")
	public String procesaLibro(@RequestParam String nombreLibro,
			@RequestParam String nombreAutor) {
		listaLibros.put(nombreLibro, nombreAutor);
		return "redirect:/libros";
	}
}

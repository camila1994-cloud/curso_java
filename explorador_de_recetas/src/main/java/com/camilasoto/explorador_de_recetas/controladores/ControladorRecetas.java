package com.camilasoto.explorador_de_recetas.controladores;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ControladorRecetas {

    private static String[] listaRecetas = {"Pizza", "Espagueti", "Lasaña"};
    private static HashMap<String, String[]> recetasConIngredientes = new HashMap<>();

    public ControladorRecetas() {
        String[] pizza = {"Pan", "Salsa de tomate", "Queso", "Pepperoni"};
        recetasConIngredientes.put("Pizza", pizza);

        String[] espagueti = {"Pasta", "Salsa de tomate", "Carne molida", "Queso parmesano"};
        recetasConIngredientes.put("Espagueti", espagueti);

        String[] lasagna = {"Pasta", "Salsa de tomate", "Queso", "Albahaca", "Espinaca", "Champiñones"};
        recetasConIngredientes.put("Lasaña", lasagna);
    }
    //listar recetas
    @GetMapping("/recetas")
    public String obtenerTodasLasRecetas(Model model) {
        model.addAttribute("listaRecetas", listaRecetas);
        return "recetas"; 
    }

    //Obtener recetas por nombre
    @GetMapping("/recetas/{nombre}")
    public String obtenerRecetaPorNombre(@PathVariable("nombre") String nombre, Model model) {

        if (recetasConIngredientes.containsKey(nombre)) {
            model.addAttribute("nombreReceta", nombre);
            model.addAttribute("ingredientes", recetasConIngredientes.get(nombre));
        } else {
            model.addAttribute("error", "La receta no se encuentra en nuestra lista.");
        }
        return "detalleReceta"; 
    }
}

package com.camilasoto.canciones.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.camilasoto.canciones.modelos.Cancion;
import com.camilasoto.canciones.repositorios.RepositorioCanciones;

@Service
public class ServicioCanciones {

    @Autowired
    private RepositorioCanciones repositorio;

    //Todas las canciones 
    public List<Cancion> obtenerTodasLasCanciones() {
        return repositorio.findAll();
    }

    //obtener cansion po ID
    public Cancion obtenerCancionPorId(Long id) {
        Optional<Cancion> optionalCancion = repositorio.findById(id);
        return optionalCancion.orElse(null);
    }

    //Agregar cancion
    public Cancion agregarCancion(Cancion cancion) {
        return repositorio.save(cancion);
    }

    //Actualizar una cancion
    public Cancion actualizaCancion(Cancion cancion) {
    return repositorio.save(cancion);
    }

    //Eliminar una cancion por ID
    public void eliminaCancion(Long id) {
        repositorio.deleteById(id);
    }

}

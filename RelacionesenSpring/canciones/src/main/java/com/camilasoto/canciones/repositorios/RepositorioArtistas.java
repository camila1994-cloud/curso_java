package com.camilasoto.canciones.repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.camilasoto.canciones.modelos.Artista;

@Repository
public interface RepositorioArtistas extends CrudRepository<Artista, Long> {

    
    // Metodo para obtener todos los artistas como una lista
    List<Artista> findAll();
}

package com.camilasoto.canciones.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.camilasoto.canciones.modelos.Artista;
import com.camilasoto.canciones.repositorios.RepositorioArtistas;

@Service
public class ServicioArtistas {

    @Autowired
    private RepositorioArtistas repoArtistas;

    // Devuelve una lista de objetos Artista de la tabla artistas de nuestra base de
    // datos.
    public List<Artista> obtenerTodosLosArtistas() {
        return repoArtistas.findAll();
    }

    // Devuelve un solo objeto de tipo Artista dado el id enviado como parametro. Si
    // el Artista no existe devuelve null.
    public Artista obtenerArtistaPorId(Long id) {
        return repoArtistas.findById(id).orElse(null);
    }

    // Agrega el artista a la base de datos dado el Objeto Artista enviado como
    // parámetro. Devuelve un objeto Artista con el artista creado.
    public Artista agregarArtista(Artista artista) {
        return repoArtistas.save(artista);
    }
}

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="/css/styles.css">
    <title>Detalle de Canción</title>
</head>
<body>

    <h1>Detalle de la Canción</h1>

    <div class="detalle-container">
        <p><strong>ID:</strong> ${cancion.id}</p>
        <p><strong>Título:</strong> ${cancion.titulo}</p>
        <p><strong>Artista:</strong> ${cancion.artista}</p>
        <p><strong>Álbum:</strong> ${cancion.album}</p>
        <p><strong>Género:</strong> ${cancion.genero}</p>
        <p><strong>Idioma:</strong> ${cancion.idioma}</p>
        <p><strong>Fecha de Creación:</strong> ${cancion.fechaCreacion}</p>
        <p><strong>Fecha de Actualización:</strong> ${cancion.fechaActualizacion}</p>

        <a class="volver" href="/canciones">← Volver a lista de canciones</a>
    </div>

</body>

</html>

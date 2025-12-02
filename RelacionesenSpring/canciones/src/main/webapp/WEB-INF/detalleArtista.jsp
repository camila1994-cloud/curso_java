<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Detalle del Artista</title>
    <link rel="stylesheet" href="/css/styles.css">
</head>
<body>

    <h1>Detalle del Artista</h1>

    <p><strong>Nombre:</strong> ${artista.nombre}</p>
    <p><strong>Apellido:</strong> ${artista.apellido}</p>
    <p><strong>Biografía:</strong> ${artista.biografia}</p>
    <p><strong>Fecha creación:</strong> ${artista.fechaCreacion}</p>
    <p><strong>Fecha actualización:</strong> ${artista.fechaActualizacion}</p>

    <h2>Canciones del artista</h2>

    <ul>
        <c:forEach var="c" items="${artista.canciones}">
            <li>${c.titulo}</li>
        </c:forEach>
    </ul>

    <br>

    <a href="/artistas">Volver a lista de artistas</a>

</body>
</html>

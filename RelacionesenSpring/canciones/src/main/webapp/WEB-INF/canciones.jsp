<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="UTF-8">
            <link rel="stylesheet" href="/css/styles.css">
            <title>Lista de Canciones</title>
        </head>

        <body>
            <h1>Lista de Canciones</h1>

            <table border="1" cellpadding="10">
                <thead>
                    <tr>
                        <th>Título</th>
                        <th>Artista</th>
                        <th>Detalle</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="cancion" items="${listaCanciones}">
                        <tr>
                            <td>${cancion.titulo}</td>
                            <td>${cancion.artista.nombre} ${cancion.artista.apellido}</td>
                            <td>
                                <a href="/canciones/detalle/${cancion.id}">Detalle</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>

            </table>

            <br />
            <form action="/canciones/formulario/agregar" method="get">
                <button type="submit" class="agregar-cancion">Agregar Canción +</button>
            </form>

            <br />

            <!--Enlace  -->
            <a href="/artistas" class="volver">Ir a artistas</a>

        </body>

        </html>
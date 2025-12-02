<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="UTF-8">
            <title>Lista de Artistas</title>
            <link rel="stylesheet" href="/css/styles.css">

            <style>
                table {
                    border-collapse: collapse;
                    width: 60%;
                    margin-top: 20px;
                }

                th,
                td {
                    padding: 10px;
                    text-align: left;
                }

                th {
                    background-color: #000000;
                    color: #ffffff;
                }

                a.volver {
                    display: inline-block;
                    margin-top: 20px;
                }
            </style>
        </head>

        <body>

            <h1>Lista de Artistas</h1>

            <table border="1">
                <thead>
                    <tr>
                        <th>Nombre</th>
                        <th>Apellido</th>
                        <th>Detalle</th>
                    </tr>
                </thead>

                <tbody>
                    <c:forEach var="artista" items="${listaArtistas}">
                        <tr>
                            <td>${artista.nombre}</td>
                            <td>${artista.apellido}</td>
                            <td>
                                <a href="/artistas/detalle/${artista.id}">Ver Detalle</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>

            <a href="/canciones" class="volver">Ir a canciones</a>

        </body>

        </html>
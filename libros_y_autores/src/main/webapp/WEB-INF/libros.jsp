<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Lista de libros</title>
</head>

<body>

<h1>Lista de libros</h1>

<ul>
    <c:forEach var="nombre" items="${listaLibros.keySet()}">
        <li>
            <a href="/libros/${nombre}">
                <c:out value="${nombre}" />
            </a>
        </li>
    </c:forEach>
</ul>

<a href="/libro/formulario">Agregar nuevo libro</a>

</body>
</html>

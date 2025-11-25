<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Detalle libro</title>
</head>

<body>

<h1>Detalle libro</h1>

<c:if test="${not empty mensaje}">
    <p>
        <c:out value="${mensaje}" />
    </p>
</c:if>

<c:if test="${empty mensaje}">
    <p>
        Nombre libro:
        <strong><c:out value="${nombreLibro}" /></strong>
    </p>

    <p>
        Autor:
        <strong><c:out value="${nombreAutor}" /></strong>
    </p>
</c:if>

<a href="/libros">Volver a la lista de libros</a>

</body>
</html>

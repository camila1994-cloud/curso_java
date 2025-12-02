<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Editar Canción</title>
    <link rel="stylesheet" href="/css/styles.css">
</head>
<body>

<h1>Editar Canción</h1>

<form:form action="/canciones/procesa/editar/${cancion.id}" method="POST" modelAttribute="cancion">
    
    <input type="hidden" name="_method" value="PUT"/>

    <div class="form-field">
        <form:label path="titulo">Título:</form:label>
        <form:input path="titulo"/>
        <form:errors path="titulo" cssClass="error"/>
    </div>

    <!-- select para artistas-->
    <div class="form-field">
        <form:label path="artista.id">Artista:</form:label>

        <form:select path="artista.id">
            <form:option value="" label="-- Selecciona un artista --" />
            <form:options items="${listaArtistas}" itemValue="id" itemLabel="nombre"/>
        </form:select>

        <form:errors path="artista.id" cssClass="error"/>
    </div>

    <div class="form-field">
        <form:label path="album">Álbum:</form:label>
        <form:input path="album"/>
        <form:errors path="album" cssClass="error"/>
    </div>

    <div class="form-field">
        <form:label path="genero">Género:</form:label>
        <form:input path="genero"/>
        <form:errors path="genero" cssClass="error"/>
    </div>

    <div class="form-field">
        <form:label path="idioma">Idioma:</form:label>
        <form:input path="idioma"/>
        <form:errors path="idioma" cssClass="error"/>
    </div>

    <button type="submit" class="actualizar-cancion">Actualizar Canción</button>
</form:form>

<br>
<a href="/canciones">Volver a lista de canciones</a>

</body>
</html>

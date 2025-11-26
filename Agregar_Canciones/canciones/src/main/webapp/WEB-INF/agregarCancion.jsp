<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="/css/styles.css">
    <title>Agregar Canción</title>
</head>
<body>
    <h1>Agregar Nueva Canción</h1>

    <!-- Formulario enlazado a modelAttribute "cancion" -->
    <form:form method="post" action="/canciones/procesa/agregar" modelAttribute="cancion">
        
        <div class="form-field">
            <form:label path="titulo">Titulo:</form:label>
            <form:input path="titulo" />
            <form:errors path="titulo" cssClass="error" />
        </div>

        <div class="form-field">
            <form:label path="artista">Artista:</form:label>
            <form:input path="artista" />
            <form:errors path="artista" cssClass="error" />
        </div>

        <div class="form-field">
            <form:label path="album">Álbum:</form:label>
            <form:input path="album" />
            <form:errors path="album" cssClass="error" />
        </div>

        <div class="form-field">
            <form:label path="genero">Género:</form:label>
            <form:input path="genero" />
            <form:errors path="genero" cssClass="error" />
        </div>

        <div class="form-field">
            <form:label path="idioma">Idioma:</form:label>
            <form:input path="idioma" />
            <form:errors path="idioma" cssClass="error" />
        </div>

        <div>
            <button type="submit" class="agregar-cancion">Agregar Canción +</button>
        </div>
        
    </form:form>

    <br/>
    <a href="/canciones">Volver a lista de canciones</a>
</body>
</html>

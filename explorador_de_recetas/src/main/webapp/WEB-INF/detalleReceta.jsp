<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Detalle de Receta</title>
    <link rel="stylesheet" href="/css/estilos.css">
</head>
<body>

    <h1>Detalle de la Receta</h1>
    
    <!--la receta NO existe-->
    <c:if test="${not empty error}">
        <p style="color:red;">${error}</p>
    </c:if>

    <!--Si la receta existe -->
    <c:if test="${empty error}">
        <h2>${nombreReceta}</h2>
        <h3>Ingredientes:</h3>
        <ul>
            <c:forEach var="ing" items="${ingredientes}">
                <li>${ing}</li>
            </c:forEach>
        </ul>
    </c:if>

    <br>
    <a href="/recetas">Volver al listado</a>

</body>
</html>

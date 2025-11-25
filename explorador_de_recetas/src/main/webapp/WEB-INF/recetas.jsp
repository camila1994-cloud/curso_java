<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Lista de Recetas</title>
    <link rel="stylesheet" href="/css/estilos.css">
</head>
<body>
    <h1>Listado de Recetas</h1>

    <ul>
        <c:forEach var="receta" items="${listaRecetas}">
            <li>
                <a href="/recetas/${receta}">
                    ${receta}
                </a>
            </li>
        </c:forEach>
    </ul>

</body>
</html>

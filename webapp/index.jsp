<%--

--%>

<%--This is a page directive, that will apply to the entire page--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
"

<%--Lets take a look at an instance variable, and like servlet vars, this will continue between page loads--%>
<%! int counter = 0; %>


<%-- lets increment page counter --%>
<% counter += 1; %>

<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="BurgerVille" />
    </jsp:include>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>BurgerVille</title>
</head>
<body>
<div class="container">
    <h1>Welcome to BurgerVille</h1>
    <p>Currently <%= counter %> million burgers sold</p>
</div>

<jsp:include page="partials/scripts.jsp"/>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
</body>
</html>
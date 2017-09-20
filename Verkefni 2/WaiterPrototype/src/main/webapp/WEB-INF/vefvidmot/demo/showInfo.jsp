<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<head>
    <title>Information </title>
</head>
<body>


<h2>Information</h2>
<p>${info}</p>

<!-- Biðjum notanda um fjölda sæta sem hann vill bóka -->
<form method="POST" action="/demo/confirmation">
    Book table for: <input name="number" type="text" placeholder="Number of seats" </input>

    <input type="submit" value="Submit"/>

    <br><br>
    <!-- Notandi getur hafið nýja leit í gegnum þennan hlekk -->
    <a href="http://localhost:8080/demo/search">New search</a>

</body>

</html>
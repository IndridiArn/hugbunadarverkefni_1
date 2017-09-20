<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<head>
    <title>Results </title>
</head>
<body>

<!-- Rosalega hrá og einföld leið til að birta niðurstöður,
     verður mun skárri í næstu útgáfum...
 -->
<h1>Results: </h1>
<h2>To book a table, select the restaurant you would like to see further information about</h2>
<h3>${nafn0}<br>${nafn1}<br>${nafn2}<br>${nafn3}<br>${nafn4}<br>${nafn5}<br>${nafn6}<br>
${nafn7}<br>${nafn8}<br>${nafn9}</h3>

<!-- Hér getur notandi slegið inn hvaða veitingastað hann hefur áhuga á  -->
<form method="POST" action="/demo/info">
    I would like further information about: <input name="restaurant" type="text" placeholder="Restaurant name" </input>

    <input type="submit" value="Submit"/>

    <br><br>
    <!-- Notandi getur hafið nýja leit í gegnum þennan hlekk -->
    <a href="http://localhost:8080/demo/search">New search</a>


</body>

</html>
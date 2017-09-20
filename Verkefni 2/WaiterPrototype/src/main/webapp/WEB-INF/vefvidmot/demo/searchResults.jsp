<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<head>
    <title>Leitarstrengurinn</title>
</head>
<body>

<h2>Please enter your search information below</h2>

<!-- Bi�jum notanda h�r um tegund veitingasta�ar til a� leita a�  -->
<form method="POST" action="/demo/results">
    Type of restaurant: <input name="type" type="text" placeholder="Type" </input >

    <input type="submit" value="Submit"/>

    <!-- �ar sem vi�m�ti� er mj�g frumst�tt er gott a� hafa h�r nokkrar till�gur -->
<h3>Suggestions:</h3>
    <p>Seafood</p>
    <p>Italian</p>
    <p>Tapas</p>
    <p>Chinese</p>
    <p>Vegetarian</p>

</form>
</body>

</html>
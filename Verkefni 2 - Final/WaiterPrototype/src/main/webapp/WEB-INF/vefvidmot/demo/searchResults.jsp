<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<head>
    <title>Leitarstrengurinn</title>
</head>
<body>

<h2>Please enter your search information below</h2>

<!-- Biðjum notanda hér um tegund veitingastaðar til að leita að  -->
<form method="POST" action="/demo/results">
    Type of restaurant: <input name="type" type="text" placeholder="Type" </input >

    <input type="submit" value="Submit"/>

    <!-- Þar sem viðmótið er mjög frumstætt er gott að hafa hér nokkrar tillögur -->
<h3>Suggestions:</h3>
    <p>Seafood</p>
    <p>Italian</p>
    <p>Tapas</p>
    <p>Chinese</p>
    <p>Vegetarian</p>

</form>
</body>

</html>
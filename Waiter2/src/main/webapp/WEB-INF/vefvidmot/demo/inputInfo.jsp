<!DOCTYPE html>

<!-- Skilgreiningar á tögum sem hægt er að nota í HTML kóða --> 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<html lang="en">

<head>
    <title>Search</title>
</head>
<body>

<h2>Please enter your search information below</h2>

<!-- Biðjum notanda hér um tegund veitingastaðar til að leita að  -->
<form method="POST" commandName="restaurant" action="/demo/typeResults">
    Type of restaurant: <input name="type" type="text" placeholder="Nafn" </input >

    <input type="submit" value="Submit"/>

    <!-- Þar sem viðmótið er mjög frumstætt er gott að hafa hér nokkrar tillögur -->
    <h3>Suggestions:</h3>
    <p>Seafood</p>
    <p>Italian</p>
    <p>Tapas</p>
    <p>Fine dining</p>
    <p>Steakhouse</p>
    <p>Sushi</p>
    <p>Buffet</p>
    <p>Casual dining</p>
    <p>Diner</p>
    <p>Vietnamese</p>

</form>

<br><br>

<h1>Add a new restaurant: </h1>

<form method="POST" commandName="restaurant" action="/demo/newRes">
    <table>
        <tr>
        <td>Name:</td><td> <input name="name" type="text" placeholder="Name" /> </td>
         </tr>
        <tr>
            <td>Type:</td><td> <input name="type" type="text"
                                      placeholder="Type" /> </td>
        </tr>
        <tr>
            <td>Info:</td><td> <input name="info" type="text" placeholder="Information" /> </td>
        </tr>
    </table>
    <br>
    <input type="submit" value="Submit"/>

</form>
</body>
</html>
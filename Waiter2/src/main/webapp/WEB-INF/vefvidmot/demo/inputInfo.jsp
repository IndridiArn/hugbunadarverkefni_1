<!DOCTYPE html>

<!-- Skilgreiningar � t�gum sem h�gt er a� nota � HTML k��a --> 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<html lang="en">

<head>
    <title>Search</title>
</head>
<body>

<h2>Please enter your search information below</h2>

<!-- Bi�jum notanda h�r um tegund veitingasta�ar til a� leita a�  -->
<form method="POST" commandName="restaurant" action="/demo/typeResults">
    Type of restaurant: <input name="type" type="text" placeholder="Nafn" </input >

    <input type="submit" value="Submit"/>

    <!-- �ar sem vi�m�ti� er mj�g frumst�tt er gott a� hafa h�r nokkrar till�gur -->
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
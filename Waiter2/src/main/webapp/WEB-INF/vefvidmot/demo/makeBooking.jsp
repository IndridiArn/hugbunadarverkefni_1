<!DOCTYPE html>

<!-- Skilgreiningar á tögum sem hægt er ağ nota í HTML kóğa --> 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<html lang="en">

<head>
    <title>Hver er notandinn</title>
</head>
<body>

<h1></h1>

<form method="POST" commandName="booking" action="/demo/book">
    <seats><tr>
            <td>Restaurant:</td><td> <input name="restaurant" type="text" placeholder="restaurant name" /> </td>
            </tr> 
            <tr>
            <td>Seats:</td><td> <input name="seats" type="text" placeholder="number of seats" /> </td>
            </tr>
             <tr>
            <td>Date:</td><td> <input name="date" type="text" placeholder="date of booking" /> </td>
             </tr>
             <tr>
            <td>Time:</td><td> <input name="time" type="text" placeholder="time of booking" /> </td>
             </tr>
    </seats>
            <input type="submit" value="Submit"/>

</form>

</body>
</html>
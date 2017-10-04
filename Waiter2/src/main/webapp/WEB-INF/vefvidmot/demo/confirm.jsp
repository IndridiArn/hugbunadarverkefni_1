<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<head>
    <title>Confirmation </title>
</head>
<body>

<h1>You have successfully booked a table at ${booking.getRestaurant()}!</h1>

<h2>Your booking number is: ${booking.getId()}</h2>
<h2>Booking information: <h3> ${booking} </h3> </h2>

<form method="get" action="/demo/spyrjaNotanda">
    <input type="submit" value="New search"/>
</form>

</body>
<!-- method="POST" action="/demo/listiKennara" -->
</html>
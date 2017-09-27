<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<head>
    <title>Confirm booking</title>
</head>
<body>

<!-- Hér vantar að setja time & date ásamt kannski meldingu ef það er ekki laust borð - næsta útgáfa  -->

<!-- Hér fær notandi síðan meldingu um að hann hafi bókað borð á veitingahúsinu -->
<h2>Booking confirmed</h2>
<p>${confirmation}</p>
<p>They look forward to seeing you!</p>
<br>
<!-- Notandi getur hafið nýja leit í gegnum þennan hlekk -->
<a href="http://localhost:8080/demo/search">New search</a>


</body>

</html>
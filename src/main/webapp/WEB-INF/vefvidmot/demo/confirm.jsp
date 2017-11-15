<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<!-- .jsp skrá sem sýnir staðfestingu þegar notandi hefur bókað borð á veitingahúsi -->

<head>
    <title>Confirmation </title>
    <link href="https://fonts.googleapis.com/css?family=Prociono|Fascinate+Inline" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/confirm.css"/>"/>

</head>

<body>
<section class="big">
    <h1 class="head">Waiter</h1>

    <section>

        <h2>You have successfully booked a table at ${booking.getRestaurant()}!</h2>

        <h2>Your booking number is: ${booking.getId()}</h2>
        <div>

            <h3> Booking information: ${booking} </h3>

        </div>

        <form method="get" action="/demo/spyrjaNotanda">
            <input type="submit" value="New search" class="button newSearch" />
        </form>

    </section>
</section>
</body>

</html>

<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<!-- .jsp skrá til að sýna reviews - aðallega notuð í prófunartilgangi. -->

<head>
    <title>All reviews</title>
    <link href="https://fonts.googleapis.com/css?family=Prociono|Fascinate+Inline" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/allRev.css"/>"/>

</head>

<body>
<section class="big">
    <h1 class="head">Waiter</h1>
    <section class="tall">
        <h2>All reviews</h2>
        <div class="results">
            <c:choose>
            <c:when test="${not empty reviews}">
            <table class="reviews">
                <thead>
                <tr>
                    <th>Restaurant</th>
                    <th>Rating</th>
                    <th>Review</th>
                </tr>
                </thead>
                <c:forEach var="reviews" items="${reviews}">
                    <tr>
                        <td>${reviews.restaurant} </td>
                        <td>${reviews.rating}</td>
                        <td>${reviews.text}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>


        </c:when>
        <c:otherwise>
            <h2> No reviews were found </h2>
        </c:otherwise>
        </c:choose>
        <br>

        <!-- Notandi getur hafið nýja leit í gegnum þennan hlekk -->
        <a href="/demo/spyrjaNotanda" class="button newSearch">New search</a>
    </section>

</section>
</body>

</html>

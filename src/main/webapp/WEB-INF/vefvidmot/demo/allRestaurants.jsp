<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<!-- .jsp skrá fyrir leitarniðurstöður sem birtast eftir að notandi hefur slegið inn leitarskilyrði og leitað. -->

<head>
    <title>Search Results </title>
    <link href="https://fonts.googleapis.com/css?family=Prociono|Fascinate+Inline" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/allRes.css"/>"/>
</head>

<body>
<section class="big">
    <h1 class="head">Waiter</h1>
    <section class="tall">
        <h2>Search results</h2>
        <div class="results">
            <c:choose>
            <c:when test="${not empty restaurants}">
            <table class="restaurants">
                <thead>
                <tr>
                    <th>Name</th>
                    <th>Type</th>
                    <th>Price</th>
                </tr>
                </thead>
                <c:forEach var="restaurant" items="${restaurants}">
                    <tr>
                        <td>${restaurant.name} </td>
                        <td>${restaurant.type}</td>
                        <td>${restaurant.price}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>

        <h2>I would like further information about </h2>
        <div class="info">
            <form method="POST" action="/demo/resInfo">
                <select name="restaurant" type="text">
                    <c:forEach var="restaurant" items="${restaurants}">
                        <option value=${restaurant.getId()}>${restaurant.name}</option>


                    </c:forEach>
                </select>
                <input type="submit" value="Get information" class="button info" />
            </form>
        </div>

        </c:when>
        <c:otherwise>
            <h2> No restaurants were found </h2>
        </c:otherwise>
        </c:choose>
        <br>

        <!-- Notandi getur hafið nýja leit í gegnum þennan hlekk -->
        <a href="/demo/spyrjaNotanda" class="button newSearch">Back</a>
    </section>




    <!-- Hér getur notandi slegið inn hvaða veitingastað hann hefur áhuga á  -->

    <section>
        <h2>I would like to book a table</h2>
        <div class="newRes">
            <form method="POST" action="/demo/book">
                <table>

                    <tr>
                        <td>At</td>
                        <td>

                            <select name="res" type="text">
                                <c:forEach var="restaurant" items="${restaurants}">
                                    <option value=${restaurant.name}>${restaurant.name}</option>


                                </c:forEach>
                            </select>

                        </td>
                    </tr>
                    <tr>
                        <td>For</td>
                        <td>
                            <input name="seats" type="range" id="ageInputId" value="1" min="1" max="12" oninput="ageOutputId.value = ageInputId.value">
                            <output name="ageOutputName" id="ageOutputId">1</output>
                        </td>
                    </tr>
                    <tr>
                        <td>On</td>
                        <td>
                            <input name="time" type="date" placeholder="Date of booking" /> </td>
                    </tr>
                    <tr>
                        <td>At</td>
                        <td>
                            <input name="date" type="time" placeholder="Time of your booking" /> </td>
                    </tr>

                </table>
                <br>


                <input type="submit" value="Submit" class="button small" />
            </form>
        </div>

    </section>
</section>
</body>

</html>

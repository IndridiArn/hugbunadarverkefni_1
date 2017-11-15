<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<!-- .jsp skrá sem sýnir notanda niðurstöður úr slembitillögu af veitingahúsi. -->

<head>
    <title>Random Result </title>
    <link href="https://fonts.googleapis.com/css?family=Prociono|Fascinate+Inline" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/randRes.css"/>"/>

</head>

<body>
<section class="big">
    <h1 class="head">Waiter</h1>
    <section class="tall">
        <h2>Search results</h2>
        <div class="results">
            <c:choose>
            <c:when test="${not empty restaurant}">
            <table class="restaurant">
                <thead>
                <tr>
                    <th>Name</th>
                    <th>Type</th>
                    <th>Price</th>
                </tr>
                </thead>
                <c:forEach var="restaurant" items="${restaurant}">
                    <tr>
                        <td>${restaurant.name} </td>
                        <td>${restaurant.type}</td>
                        <td>${restaurant.price}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>
        <div class="info">
            <!-- Hér getur notandi slegið inn hvaða veitingastað hann hefur áhuga á  -->
            <form method="POST" action="/demo/resInfo">

                <input type="hidden" name="restaurant" value="${restaurant.get(0).getId()}">

                <input type="submit" value="Further information" class="button info" />

            </form>

            <!-- Ný leit í gegnum þennan hlekk-->
            <a href="/demo/randRes" class="button tryAgain">Try again</a>
        </div>

        <a href="/demo/spyrjaNotanda" class="button newSearch">Back</a>
        </c:when>
        <c:otherwise>
            <h3> No restaurant was found </h3>
        </c:otherwise>
        </c:choose>
        <br>


    </section>

    <section>
        <h2>I would like to book a table</h2>
        <div class="newRes">
            <form method="POST" action="/demo/book">
                <table>
                    <tr>
                        <td>At</td>
                        <td>
                            <input type="hidden" name="res" value="${restaurant.get(0).getName()}"> ${restaurant.get(0).getName()} </td>
                    </tr>
                    <tr>
                        <td>For</td>
                        <td>
                            <input type="range" name="seats" id="ageInputId" value="1" min="1" max="12" oninput="ageOutputId.value = ageInputId.value">
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

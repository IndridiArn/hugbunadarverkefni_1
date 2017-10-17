<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<head>
    <title>Random Restaurant</title>
    <style>

        table.restaurants {
            border: 1px black solid;
        }

        .restaurants td {
            padding: 15px;
            text-align: left;
        }

        table.restaurants tr:nth-child(even) {
            background-color: antiquewhite;
        }

        table.restaurants tr:nth-child(odd) {
            background-color: azure;
        }

    </style>
</head>
<body>
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
                <c:forEach var ="restaurant" items="${restaurants}">
                    <tr>
                        <td>${restaurant.name} </td>
                        <td>${restaurant.type}</td>
                        <td>${restaurant.price}</td>
                    </tr>
                </c:forEach>
            </table>
        </c:when>
        <c:otherwise>
            <h3> No restaurants were found </h3>
        </c:otherwise>
    </c:choose>
    <br>

    <!-- Hér getur notandi slegið inn hvaða veitingastað hann hefur áhuga á  -->
    <form method="POST" action="/demo/resInfo">

        I would like further information about: <input name="restaurant" type="text" placeholder="Restaurant name" </input>

        <input type="submit" value="Submit"/>

        <br>
        <br>
        <br>


    </form>

    <form method="POST" action="/demo/book">
        <table>
            I would like to book a table  bla
            <tr>
                <td>At</td><td> <input name="res" type="text" placeholder="Restaurant name" /> </td>
            </tr>
            <tr>
                <td>For</td><td> <input name="seats" type="text" placeholder="Number of seats" /> </td>
            </tr>
            <tr>
                <td>On</td><td> <input name="time" type="text" placeholder="Date of booking" /> </td>
            </tr>
            <tr>
                <td>At</td><td> <input name="date" type="text" placeholder="Time of your booking" /> </td>
            </tr>

        </table>
        <br>


        <input type="submit" value="Submit"/>

        <br><br>

        <!-- Notandi getur hafið nýja leit í gegnum þennan hlekk -->
        <a href="http://localhost:8080/demo/spyrjaNotanda">New search</a>

    </form>
</body>
</html>
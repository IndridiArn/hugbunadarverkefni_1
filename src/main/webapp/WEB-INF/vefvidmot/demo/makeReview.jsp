<!DOCTYPE html>

<!-- Skilgreiningar á tögum sem hægt er að nota í HTML kóða -->
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<html lang="en">

<!-- .jsp skrá fyrir síðu þar sem notandi getur sett inn nýtt review. -->

<head>
    <title>Write review</title>
    <link href="https://fonts.googleapis.com/css?family=Prociono|Fascinate+Inline" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/makeRev.css"/>"/>

</head>
<body>

<section class="big">
    <h1 class="head">Waiter</h1>

<section>
    <h2>I would like to make a review</h2>
    <div>
        <form method="POST" action="/demo/newRev" modelAttribute = "reviewForm">
            <table>

                <tr>
                    <td>For: </td>
                    <td>

                        <select name="restaurant" type="text">
                            <c:forEach var="restaurants" items="${restaurants}">
                                <option value=${restaurants.name}>${restaurants.name}</option>


                            </c:forEach>
                        </select>

                    </td>
                </tr>
                <tr>
                    <td>Rating: </td>
                    <td>
                        <input name="rating" type="range" id="ageInputId" value="1" min="1" max="5" oninput="ageOutputId.value = ageInputId.value">
                        <output name="ageOutputName" id="ageOutputId">1</output>
                    </td>
                </tr>
                <tr>
                    <td>Review: </td>
                    <td>
                        <input name="txt" type="text" placeholder="Review text" /> </td>
                </tr>


            </table>
            <br>


            <input type="submit" value="Submit" class="button submit" />
        </form>
    </div>

    <form method="get" action="/demo/spyrjaNotanda">
        <input type="submit" value="Back" class = "button small"/>
    </form>

</section>

</section>

</body>
</html>
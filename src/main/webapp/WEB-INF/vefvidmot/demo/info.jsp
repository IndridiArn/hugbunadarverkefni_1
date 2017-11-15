<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<!-- .jsp skrá sem sýnir upplýsingar um veitingahús. Sýnir líka töflu með einkunnum og umsögnum. -->

<head>
    <title>Information </title>
    <link href="https://fonts.googleapis.com/css?family=Prociono|Fascinate+Inline" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/info.css"/>"/>


    <script>
        function goBack() {
            window.history.back();
        }

    </script>

</head>

<body>
<section class="big">
    <h1 class="head">Waiter</h1>
    <section>

        <h2>${restaurants}</h2>


        <div>

            <form method="get" action="/demo/spyrjaNotanda">
                <input type="submit" value="New search" class="button info" />
            </form>
            <button onclick="goBack()" class="button tryAgain">Back to results</button>

        </div>


    </section>
    <section class="long">

        <h2>Reviews:</h2>

        <c:choose>
            <c:when test="${not empty reviews}">
                <table class="reviews">
                <thead>
                <tr>
                <th>Rating</th>
                <th>Review</th>
                </tr>
                </thead>
                <c:forEach var="reviews" items="${reviews}">
                    <tr>
                        <td>${reviews.rating}</td>
                        <td>${reviews.text}</td>
                    </tr>
                </c:forEach>
                </table>

        </c:when>
        <c:otherwise>
            <h2> No reviews were found </h2>
        </c:otherwise>
        </c:choose>
        <br>

    </section>
</section>
</section>
</body>

</html>

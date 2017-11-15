<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- .jsp skrá sem sýnir fyrstu síðuna, þ.e. forsíðuna. -->

<html lang="en">

<head>
    <title>Front Page</title>
    <link href="https://fonts.googleapis.com/css?family=Fascinate+Inline|Satisfy" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/frontPage.css"/>"/>

</head>

<body>

<section>
    <div>
        <h1>Waiter</h1>

        <h2>Your perfect table is waiting for you</h2>

        <a href="/demo/spyrjaNotanda" class="button">Start search</a>


    </div>

</section>



</body>

</html>

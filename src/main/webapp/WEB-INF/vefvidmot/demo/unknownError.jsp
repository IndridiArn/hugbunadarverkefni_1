<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<!-- .jsp skrá sem lætur notanda vita þegar óþekkt villa hefur komið upp. -->

<head>
    <title>Unknown error </title>
    <link href="https://fonts.googleapis.com/css?family=Prociono|Fascinate+Inline" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/ukError.css"/>"/>
</head>

<body>
<section class="big">
    <h1 class="head">Waiter</h1>
    <section class="tall">
        <h2>Unknown error - please contact an admin</h2>
        <div class="info">
            <p> ${undantekning} </p>
            <p> ${url} </p>
        </div>

        <!-- Notandi getur hafið nýja leit í gegnum þennan hlekk -->
        <a href="/demo/spyrjaNotanda" class="button newSearch">New search</a>
    </section>

</section>
</body>

</html>

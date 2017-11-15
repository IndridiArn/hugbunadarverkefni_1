<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<!-- .jsp skrá sem sýnir notanda þegar hann hefur slegið inn vitlausa slóð - virkar ekki eins og er -->

<head>
    <title>Search results </title>
    <link href="https://fonts.googleapis.com/css?family=Prociono|Fascinate+Inline" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/errorPage.css"/>"/>
</head>

<script>
    function goBack() {
        window.history.back();
    }

</script>

<body>
<section class="big">
    <h1 class="head">Waiter</h1>
    <section class="tall">


            <h2> Invalid input. Please make sure all fields are filled. </h2>


        <!-- Notandi getur hafið nýja leit í gegnum þennan hlekk -->
        <button onclick="goBack()" class="button newSearch">Back to results</button>
    </section>

</section>
</body>

</html>
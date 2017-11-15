<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<!-- .jsp skr� sem s�nir notanda �egar hann hefur slegi� inn vitlausa sl�� - virkar ekki eins og er -->

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


        <!-- Notandi getur hafi� n�ja leit � gegnum �ennan hlekk -->
        <button onclick="goBack()" class="button newSearch">Back to results</button>
    </section>

</section>
</body>

</html>
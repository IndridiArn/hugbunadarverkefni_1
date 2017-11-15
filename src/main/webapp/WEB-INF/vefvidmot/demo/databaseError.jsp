<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<!-- .jsp skr� sem s�nir notanda �egar gagnagrunnsvilla hefur �tt s�r sta� -->

<head>
    <link href="https://fonts.googleapis.com/css?family=Prociono|Fascinate+Inline" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/ukError.css"/>"/>
    <title>Villa � gagnagrunnstengingu </title>
</head>

<body>
<h1 class="head">Waiter</h1>
<section class="tall">

    <div class="info">
        <h1>System cannot establish a connection with the database - please contact an admin</h1>
    </div>

    <!-- Notandi getur hafi� n�ja leit � gegnum �ennan hlekk -->
    <a href="/demo/spyrjaNotanda" class="button newSearch">New search</a>
</section>

</body>

</html>
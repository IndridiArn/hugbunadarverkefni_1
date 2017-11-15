<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<!-- .jsp skr� sem l�tur notanda vita af POSTGRES gagnagrunnsvillu. -->

<head>
    <link href="https://fonts.googleapis.com/css?family=Prociono|Fascinate+Inline" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/ukError.css"/>"/>

    <title>Database error </title>
</head>
<body>
<section class="big">
    <h1 class="head">Waiter</h1>
    <section class="tall">
        <h1>System cannot establish a connection with the POSTGRES database - please contact an admin</h1>

        <!-- Notandi getur hafi� n�ja leit � gegnum �ennan hlekk -->
        <a href="/demo/spyrjaNotanda" class="button newSearch">New search</a>
    </section>

</section>

</body>

</html>
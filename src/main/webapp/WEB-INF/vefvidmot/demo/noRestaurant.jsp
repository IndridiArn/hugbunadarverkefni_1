<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<!-- .jsp skrá sem segir notanda ağ engir veitingastağir meğ hans leitarskilyrğum hafi fundist. -->

<head>
    <title>Search results </title>
    <link href="https://fonts.googleapis.com/css?family=Prociono|Fascinate+Inline" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/noRes.css"/>"/>
</head>

<body>
<section class="big">
    <h1 class="head">Waiter</h1>
    <section class="tall">

        <div class="info">
            <h2> No restaurants were found </h2>
        </div>

        <!-- Notandi getur hafiğ nıja leit í gegnum şennan hlekk -->
        <a href="/demo/spyrjaNotanda" class="button newSearch">New search</a>
    </section>

</section>
</body>

</html>

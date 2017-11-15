<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<!-- .jsp skrá sem sýnir notanda reviews fyrir tiltekinn veitingastað. Er ekki notuð núna þar sem reviews
      birtast með öðrum upplýsingum í info.jsp síðunni. -->

<head>
    <title>Information </title>
    <link href="https://fonts.googleapis.com/css?family=Prociono|Fascinate+Inline" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/showRevs.css"/>"/>


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
</section>
</body>

</html>

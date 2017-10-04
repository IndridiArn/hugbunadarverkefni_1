<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<head>
    <title>Information </title>
    <style>

        table.restaurants {
            border: 1px black solid;
        }

        .restaurants td {
            padding: 15px;
            text-align: left;
        }

        table.restaurants tr:nth-child(even) {
            background-color: antiquewhite;
        }

        table.restaurants tr:nth-child(odd) {
            background-color: azure;
        }

    </style>
</head>
<body>

<h2>${restaurants}</h2>

<button onclick="goBack()">Back to results</button>
<script>
    function goBack() {
        window.history.back();
    }
</script>

<br><br>

<form method="get" action="/demo/spyrjaNotanda">
    <input type="submit" value="New search"/>
</form>

</body>
<!-- method="POST" action="/demo/listiKennara" -->
</html>
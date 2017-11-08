<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<head>
    <title>Confirmation </title>
    <link href="https://fonts.googleapis.com/css?family=Prociono|Fascinate+Inline" rel="stylesheet">
    <style>
        h1 {
            font-family: "Prociono", helvetica, arial, sans-serif;
            text-align: center;
            font-size: 5rem;
            margin-top: 0;
            margin-bottom: 0;
        }

        h1.head {
            font-family: "Fascinate Inline", helvetica, arial, sans-serif;
            text-align: center;
            font-size: 5rem;
            margin-top: 0;
            margin-bottom: 0;
        }

        h2 {
            padding-top: 1em;
            margin-bottom: 0;
            font-family: "Prociono", helvetica, arial, sans-serif;
            text-align: center;
            font-size: 1.5rem;
            height: 2em;
        }

        h2.div {
            padding-top: 0;
            margin-bottom: 0;
            font-family: "Prociono", helvetica, arial, sans-serif;
            text-align: center;
            font-size: 1.5rem;
            height: 1em;
        }

        h3 {
            padding-top: 0em;
            margin-top: 0;
            line-height: 1.8em;
            font-family: "Prociono", helvetica, arial, sans-serif;
            text-align: center;
            font-size: 2rem;
            height: 2em;
        }

        section {
            width: 500px;
            height: 11em;
            margin-bottom: 2em;
            margin-left: 2.5em;
            border: solid;
            background-color: crimson;
        }

        section.big {
            width: 37em;
            height: 20em;
            margin-left: 26em;
            padding: 0em 0em 0em 0em;
            margin-bottom: 2em;
            border: solid;
            background-color: darkcyan;
        }

        div {
            background-color: darkcyan;
            border: solid;
            height: 22em;
            width: 22em;
            display: flex;
            justify-content: center;
            padding-top: 0.75em;
            margin-top: 2em;
            margin-right: 0em;
            margin-left: 4.5em;
            margin-bottom: 2em;
            border-color: black;
        }

        .button {
            display: inline-block;
            width: 100%;
            max-width: 10em;
            padding: 14px 5px;
            overflow: hidden;
            margin-bottom: 10px;
            font-family: "Open Sans", helvetica, arial, sans-serif;
            font-size: 1.2rem;
            color: white;
            text-align: center;
            text-decoration: none;
            text-overflow: ellipsis;
            white-space: nowrap;
            cursor: pointer;
            background-color: black;
            border: solid;
            border-radius: 2em;
            border-color: white;
            transition: background-color 500ms ease;
        }

        .button:hover {
            color: #eee;
            background-color: #333;
        }

        .small {
            width: 100%;
            max-width: 4em;
            padding: 7px 2px;
            overflow: hidden;
            margin: -0.5em 0 0 4.5em;
            font-size: 1rem;
            border-radius: 0.5em;
            transition: background-color 500ms ease;
        }

        .button.newSearch {
            width: 100%;
            max-width: 7em;
            padding: 7px 2px;
            overflow: hidden;
            margin: 0.5em 0 0 12em;
            font-size: 1rem;
            border-radius: 0.5em;
            transition: background-color 500ms ease;
        }

        a.button {
            -moz-appearance: button;
            appearance: button;
            text-decoration: none;
        }

        form {
            height: 2em;
        }

    </style>

</head>

<body>
<section class="big">
    <h1 class="head">Waiter</h1>

    <section>

        <h2>You have successfully posted your review!</h2>

        <form method="get" action="/demo/spyrjaNotanda">
            <input type="submit" value="New search" class="button newSearch" />
        </form>

    </section>
</section>
</body>
<!-- method="POST" action="/demo/listiKennara" -->

</html>

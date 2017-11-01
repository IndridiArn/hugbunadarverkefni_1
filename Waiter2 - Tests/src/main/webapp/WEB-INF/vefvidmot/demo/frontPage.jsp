<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<head>
    <title>Upphafssíða</title>
    <link href="https://fonts.googleapis.com/css?family=Fascinate+Inline|Satisfy" rel="stylesheet">

    <style>
        h1 {
            font-family: "Fascinate Inline", helvetica, arial, sans-serif;
            text-align: center;
            font-size: 5rem;
            margin-top: 0;
            margin-bottom: 0;
        }

        section {
            display: flex;
            align-content: center;
            width: 500px;
            height: 500px;
            margin-left: 31em;
        }

        div {
            background-color: crimson;
            border: solid;
        }

        h2 {
            font-family: "Satisfy", helvetica, arial, sans-serif;
            text-align: center;
            font-size: 3rem;
            margin-top: 0;
        }

        .button {
            display: inline-block;
            width: 100%;
            max-width: 128px;
            padding: 10px 5px;
            margin: 1em 0px 0 9em;
            overflow: hidden;
            font-family: "Open Sans", helvetica, arial, sans-serif;
            font-size: 1.2rem;
            color: white;
            text-align: center;
            text-decoration: none;
            text-overflow: ellipsis;
            white-space: nowrap;
            cursor: pointer;
            background-color: black;
            border: 1px solid #666;
            border-radius: 3px;
            border-color: white;
            transition: background-color 500ms ease;
        }

        .button:hover {
            color: #eee;
            background-color: #333;
        }

        a.button {
            -moz-appearance: button;
            appearance: button;
            text-decoration: none;
        }

    </style>
</head>

<body>

<section>
    <div>
        <h1>Waiter</h1>

        <h2>Your perfect table is waiting for you</h2>

        <a href="http://localhost:8080/demo/spyrjaNotanda" class="button">Start search</a>


    </div>

</section>



</body>

</html>

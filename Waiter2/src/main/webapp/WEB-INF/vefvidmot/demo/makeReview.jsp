<!DOCTYPE html>

<!-- Skilgreiningar á tögum sem hægt er að nota í HTML kóða -->
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<html lang="en">

<head>
    <title>Write review</title>
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
            padding-top: 0em;
            margin-bottom: 0;
            font-family: "Prociono", helvetica, arial, sans-serif;
            text-align: center;
            font-size: 1.5rem;
            height: 1.5em;
        }

        section {
            width: 500px;
            height: 19.7em;
            margin-bottom: 2em;
            margin-left: 2.5em;
            border: solid;
            background-color: crimson;
        }

        section.big {
            width: 37em;
            height: 28em;
            margin-left: 26em;
            padding: 0em 0em 0em 0em;
            margin-bottom: 2em;
            border: solid;
            background-color: darkcyan;
        }

        section.long {
            width: 35.6em;
            height: 50em;
            margin-bottom: 2em;
            margin-left: 0.5em;
            border: solid;
            background-color: crimson;
        }

        div {
            background-color: darkcyan;
            border: solid;
            height: 11em;
            width: 26em;
            display: flex;
            justify-content: center;
            padding-top: 1.75em;
            margin-top: 1em;
            margin-right: 0em;
            margin-left: 2.45em;
            margin-bottom: 9em;
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

        .button.submit {
            width: 100%;
            max-width: 7em;
            padding: 7px 6px;
            overflow: hidden;
            margin: 1.5em 0 0 5em;
            font-size: 0.9rem;
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

        script {
            margin-left: 10em;
        }

        table.reviews {
            border: 3px black solid;
            border-collapse: collapse;
            table-layout: fixed;
            width: 35em;
            margin-left: 0.3em;
        }

        .reviews td {
            padding: 15px;
            text-align: left;
            border:solid 3px black;
            width:100px;
            word-wrap:break-word;
        }

        .reviews td+td+td {
            width: 300px;
        }

        table.reviews tr:nth-child(even) {
            background-color: antiquewhite;
        }

        table.reviews tr:nth-child(odd) {
            background-color: azure;
        }

    </style>
</head>
<body>

<section class="big">
    <h1 class="head">Waiter</h1>

<section>
    <h2>I would like to make a review</h2>
    <div>
        <form method="POST" action="/demo/newRev" modelAttribute = "reviewForm">
            <table>

                <tr>
                    <td>For: </td>
                    <td>

                        <select name="restaurant" type="text">
                            <c:forEach var="restaurants" items="${restaurants}">
                                <option value=${restaurants.name}>${restaurants.name}</option>


                            </c:forEach>
                        </select>

                    </td>
                </tr>
                <tr>
                    <td>Rating: </td>
                    <td>
                        <input name="rating" type="range" id="ageInputId" value="1" min="1" max="5" oninput="ageOutputId.value = ageInputId.value">
                        <output name="ageOutputName" id="ageOutputId">1</output>
                    </td>
                </tr>
                <tr>
                    <td>Review: </td>
                    <td>
                        <input name="txt" type="text" placeholder="Review text" /> </td>
                </tr>


            </table>
            <br>


            <input type="submit" value="Submit" class="button small" />
        </form>
    </div>

</section>

</section>

</body>
</html>
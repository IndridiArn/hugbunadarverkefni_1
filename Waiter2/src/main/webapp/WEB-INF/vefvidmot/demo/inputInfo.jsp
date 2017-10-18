<!DOCTYPE html>

<!-- Skilgreiningar á tögum sem hægt er að nota í HTML kóða -->
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<html lang="en">

<head>
    <title>Search</title>
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

        section {
            width: 500px;
            height: 300px;
            margin-bottom: 2em;
            margin-left: 2.5em;
            border: solid;
            background-color: crimson;
        }

        section.big {
            width: 37em;
            height: 70em;
            margin-left: 26em;
            padding: 0em 0em 0em 0em;
            margin-bottom: 2em;
            border: solid;
            background-color: darkcyan;
        }

        div {
            background-color: darkcyan;
            border: solid;
            height: 2em;
            width: 15em;
            display: flex;
            justify-content: center;
            padding-top: 0.75em;
            margin-top: 2em;
            margin-right: 0em;
            margin-left: 8em;
            margin-bottom: 9em;
            border-color: black;
        }

        div.randRes {
            background-color: darkcyan;
            border: solid;
            height: 4em;
            width: 15em;
            display: flex;
            justify-content: center;
            padding-top: 0.75em;
            margin-top: 2em;
            margin-right: 0em;
            margin-left: 8em;
            margin-bottom: 9em;
            border-color: black;
        }

        div.newRes {
            background-color: darkcyan;
            border: solid;
            height: 9em;
            width: 20em;
            display: flex;
            justify-content: center;
            margin-left: 6em;
            margin-top: 0.5em;
            padding-top: 1.5em;
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

        a.button {
            -moz-appearance: button;
            appearance: button;
            text-decoration: none;
        }

    </style>
</head>
<section class="big">
    <h1 class="head">Waiter</h1>
    <section>
        <h2>Please enter your search information below</h2>

        <!-- Biðjum notanda hér um tegund veitingastaðar til að leita að  -->
        <div>
            <form method="POST" commandName="restaurant" action="/demo/typeResults">

                <select name="type">
                    <option value="Any" selected>Any</option>
                    <option value="Seafood">Seafood</option>
                    <option value="Italian">Italian</option>
                    <option value="Tapas">Tapas</option>
                    <option value="Fine dining">Fine dining</option>
                    <option value="Steakhouse">Steakhouse</option>
                    <option value="Sushi">Sushi</option>
                    <option value="Buffet">Buffet</option>
                    <option value="Casual dining">Casual dining</option>
                    <option value="Diner">Diner</option>
                </select>

                <input type="submit" value="Submit" />

        </div>


        </form>

    </section>

    <section>

        <h2>Get a random suggestion</h2>
        <div class="randRes">

            <a href="http://localhost:8080/demo/randRes" class="button">Random search!</a>

        </div>

    </section>

    <section>

        <h2>Add a new restaurant</h2>

        <div class="newRes">

            <form method="POST" commandName="restaurant" action="/demo/newRes">
                <table>
                    <tr>
                        <td>Name:</td>
                        <td>
                            <input name="name" type="text" placeholder="Name" /> </td>
                    </tr>
                    <tr>
                        <td>Type:</td>
                        <td>
                            <input name="type" type="text" placeholder="Type" /> </td>
                    </tr>
                    <tr>
                        <td>Info:</td>
                        <td>
                            <input name="info" type="text" placeholder="Information" /> </td>
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

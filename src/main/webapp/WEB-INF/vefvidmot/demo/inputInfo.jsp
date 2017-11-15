<!DOCTYPE html>

<!-- Skilgreiningar á tögum sem hægt er að nota í HTML kóða -->
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<!-- jsp skrá fyrir síðuna þar sem notandi slær inn leitarupplýsingar o.fl. -->

<html lang="en">

<head>
    <title>Search</title>
    <link href="https://fonts.googleapis.com/css?family=Prociono|Fascinate+Inline" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/inputInfo.css"/>"/>

</head>
<section class="big">
    <h1 class="head">Waiter</h1>
    <section>
        <h2>Please enter your search information below</h2>

        <!-- Biðjum notanda hér um tegund veitingastaðar til að leita að  -->
        <div>
            <form method="POST" commandName="restaurant" action="/demo/typeResults">

                <select name="type">
                    <option value="Icelandic"selected>Icelandic</option>
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

            <a href="/demo/randRes" class="button">Random search!</a>

        </div>

    </section>

    <section>

        <h2>Write a review</h2>
        <div class="randRes">

            <a href="/demo/mkRev" class="button">Add review</a>

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
                    <td>Price range:</td>
                        <td>
                        <input name="price" type="range" id="ageInputId" value="1" min="1" max="5" oninput="ageOutputId.value = ageInputId.value">
                        <output name="ageOutputName" id="ageOutputId">1</output>
                        </td>
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

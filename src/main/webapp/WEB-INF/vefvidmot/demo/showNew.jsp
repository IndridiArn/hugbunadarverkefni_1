<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<!-- .jsp skrá sem birtist þegar notandi hefur bætt nýju veitingahúsi við gagnagrunninn. -->

<head>
    <title>Restaurant added </title>
</head>

<body>

<h1>${restaurant.getName()} has been added to the database</h1>
<h2>Information ${restaurant} </h2>
<form method="get" action="/demo/allRes">
    <input type="submit" value="All restaurants" />
</form>

<form method="get" action="/demo/spyrjaNotanda">
    <input type="submit" value="Back" />
</form>

</body>

</html>

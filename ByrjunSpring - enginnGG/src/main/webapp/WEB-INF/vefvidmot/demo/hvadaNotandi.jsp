<!DOCTYPE html>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">


<!--hvadaNotandi.jsp spyr notandan um nafn og DemoController tekur við því inntaki-->

<head>
	<meta charset ="utf-8"/>
    <title>Hver er notandinn</title>
</head>
<body>

<h1></h1>

<form method = "POST" action = "/demo/hver">
	Hvað heitirðu? <input name = "nafn" type ="text" placeholder ="Nafn" </input>
	<input type ="submit" value="í lagi"/>
</form>
</body>

</html>
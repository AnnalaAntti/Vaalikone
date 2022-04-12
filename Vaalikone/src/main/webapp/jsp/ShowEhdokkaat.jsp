<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.util.ArrayList"%>
<%@ page import="data.Ehdokas"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ehdokkaat</title>
<link rel="stylesheet" href="css/header.css">
<link rel="stylesheet" href="css/ehdokkaat.css">
<link rel="stylesheet" type="text/css" href="mycssfilesomewhere.css">
<script src="myscriptfile.js"></script>

</head>
<body>
	<header>
		<nav>
			<ul class="nav">
				<li><a href="index.html">KOTISIVU</a></li>
				<li><a href="Kysymykset.html">VASTAA KYSYMYKSIIN</a></li>
				<li><a href='/naytaehdokas' class="active">SELAA EHDOKKAITA</a></li>
				<li><a href="Kirjaudu.html">KIRJAUDU</a></li>
			</ul>
		</nav>
	</header>
	<div class="container">
		<h2>Ehdokkaat ja äänestysnumero</h2>
		<ol>
			<c:forEach var="ehdokkaat" items="${requestScope.Ehdokaslist}">
				<li>${Ehdokas.numero}:${Ehdokas.etunimi}:${Ehdokas.sukunimi}
			</c:forEach>
		</ol>
	</div>

	<%
		ArrayList<Ehdokas> EhdokasList = (ArrayList<Ehdokas>) request.getAttribute("ehdokkaat");

	for (int i = 0; EhdokasList != null && i < EhdokasList.size(); i++) {
		Ehdokas ehdokas = EhdokasList.get(i);
		out.println(ehdokas.getNumero() + ": " + ehdokas.getetunimi() + " " + ehdokas.getsukunimi() + "<br>");

	}
	%>

</body>
</html>
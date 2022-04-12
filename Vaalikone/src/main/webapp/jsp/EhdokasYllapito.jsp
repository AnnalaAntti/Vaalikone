<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.util.ArrayList"%>
<%@ page import="data.Ehdokas"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/header.css">
<link rel="stylesheet" href="css/ylläpito.css">
<title>Ylläpito</title>

<link rel="stylesheet" type="text/css" href="mycssfilesomewhere.css">
<script src="myscriptfile.js"></script>

</head>
<body>
  <header>
    <nav>
      <ul class="nav">
        <li><a href="index.html">KOTISIVU</a></li>
        <li><a href='/naytakysymykset'>VASTAA KYSYMYKSIIN</a></li>
        <li><a href='/naytaehdokas'>SELAA EHDOKKAITA</a></li>
        <li><a href="Kirjaudu.html">KIRJAUDU</a></li> 
      </ul>
    </nav>
  </header>
  <div class="container">
	<h3>Ylläpidä ehdokkaita</h3>
	<ol>
		<c:forEach var="ehdokkaat" items="${requestScope.Ehdokaslist}">
			<li>${Ehdokas.id}:${Ehdokas.etunimi}: ${Ehdokas.sukunimi} 
				<a href='/delete?id=${Ehdokas.id}'>delete</a>
				<a href='/readtoupdate?id=${Ehdokas.id}'>update</a><br>
		</c:forEach>
	</ol>
	<div class="lista">
	<%
		ArrayList<Ehdokas> EhdokasList = (ArrayList<Ehdokas>) request.getAttribute("ehdokkaat");

	for (int i = 0; EhdokasList != null && i < EhdokasList.size(); i++) {
		Ehdokas ehdokas = EhdokasList.get(i);
		out.println(ehdokas.getetunimi() + " " + ehdokas.getsukunimi() + " "
		+ "<a href='/delete?id=" + ehdokas.getId() + "'>poista</a> <a href='/readtoupdate?id=" + ehdokas.getId()
		+ "'>muokkaa</a>" + "<br>");
	}
	%>
	</div>
	<br>
	<a class="linkki" href='/readluoehdokas'>Luo uusi ehdokas</a>
	<br>
</div>
</body>
</html>
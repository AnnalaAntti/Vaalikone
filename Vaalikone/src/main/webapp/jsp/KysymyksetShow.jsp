<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.util.ArrayList"%>
<%@ page import="data.Kysymykset"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Kysymykset</title>

<link rel="stylesheet" type="text/css" href="kysymykset.css">
<script src="myscriptfile.js"></script>

</head>
<body>
  <header>
    <nav>
      <ul class="nav">
        <li><a href="index.html">KOTISIVU</a></li>
        <li><a href='/naytakysymykset'>VASTAA KYSYMYKSIIN</a></li>
        <li><a href='/naytaehdokas' class="active">SELAA EHDOKKAITA</a></li>
        <li><a href="Kirjaudu.html">KIRJAUDU</a></li>
      </ul>
    </nav>
  </header>
	<h2>Kysymykset</h2>
	<ol>
		<c:forEach var="kysymykset" items="${requestScope.Kysymyksetlist}">
			<li>${Kysymykset.KYSYMYS_ID}:${Kysymykset.KYSYMYS})</li>
		</c:forEach>
	</ol>

	<%
		ArrayList<Kysymykset> KysymyksetList = (ArrayList<Kysymykset>)request.getAttribute("kysymykset");

	for (int i = 0; KysymyksetList != null && i < KysymyksetList.size(); i++) {
		Kysymykset Kysymykset = KysymyksetList.get(i);
		out.println(Kysymykset.getKysymyksetId() + ": " + Kysymykset.getKysymykset());
	}
	%>

</body>
</html>
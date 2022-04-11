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
<link rel="stylesheet" type="text/css" href="css/header.css">
<link rel="stylesheet" type="text/css" href="css/kysymykset.css">
<script src="myscriptfile.js"></script>

</head>
<body>
  <header>
    <nav>
      <ul class="nav">
        <li><a href="index.html">KOTISIVU</a></li>
        <li><a href='/naytakysymykset' class="active">VASTAA KYSYMYKSIIN</a></li>
        <li><a href='/naytaehdokas'>SELAA EHDOKKAITA</a></li>
        <li><a href="Kirjaudu.html">KIRJAUDU</a></li>
      </ul>
    </nav>
  </header>
       <div class="container">
        <h1>KYSYMYKSET</h1>
        <div class="kysymys">
        <h2>koulukysymys tähän</h2>
            <ul class="vastaus">
              <li id="1" class="a">Täysin eri mieltä</li>

              <li id="2" class="a">Jokseenkin eri mieltä</li>

              <li id="3" class="a">Ei samaa eikä eri mieltä</li>

              <li id="4" class="a">Jokseenkin samaa mieltä</li>

              <li id="5" class="a">Täysin samaa mieltä</li>

              <div class="napit">
                <input class="nappi" type="radio" id="1" name="1">
                <input class="nappi" type="radio" id="2" name="1">
                <input class="nappi" type="radio" id="3" name="1">
                <input class="nappi" type="radio" id="4" name="1">
                <input class="nappi" type="radio" id="5" name="1">
              </div>
            </ul>
        </div>
       
	<h2>Kysymykset</h2> 
	<ol>
		<c:forEach var="kysymykset" items="${requestScope.Kysymyksetlist}">
			<li>${Kysymykset.KYSYMYS_ID}:${Kysymykset.KYSYMYS})</li>
		</c:forEach>
	</ol>

	<%
		ArrayList<Kysymykset> KysymyksetList = (ArrayList<Kysymykset>)request.getAttribute("Kysymykset");

	for (int i = 0; KysymyksetList != null && i < KysymyksetList.size(); i++) {
		Kysymykset Kysymykset = KysymyksetList.get(i);
		out.println(Kysymykset.getKysymyksetId() + ": " + Kysymykset.getKysymykset());
	}
	%>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
 <%@ page import="java.util.ArrayList" %>   
 <%@ page import="data.Ehdokas" %>   
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ehdokkaat</title>

<link rel="stylesheet" type="text/css" href="mycssfilesomewhere.css">
<script src="myscriptfile.js"></script>

</head>
<body>
<h2>Ylläpidä ehdokkaita</h2>
<ol>
<c:forEach var="ehdokkaat" items="${requestScope.Ehdokaslist}" >
<li>${Ehdokas.id}: ${Ehdokas.etunimi}: ${Ehdokas.sukunimi} <a href='/delete?id=${Ehdokas.id}'>delete</a> <a href='/readtoupdate?id=${Ehdokas.id}'>update</a>
</c:forEach>
</ol>

<%
ArrayList<Ehdokas> EhdokasList=(ArrayList<Ehdokas>)request.getAttribute("ehdokkaat");

for (int i=0;EhdokasList!=null && i<EhdokasList.size();i++){
	Ehdokas ehdokas=EhdokasList.get(i);
	out.println(ehdokas.getId()+": "+ehdokas.getetunimi()+" "+ehdokas.getsukunimi()+"<a href='/delete?id="+ehdokas.getId()+"'>delete</a> <a href='/readtoupdate?id="+ehdokas.getId()+"'>update</a>");
}
%>

</body>
</html>
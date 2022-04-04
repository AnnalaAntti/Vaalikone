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
<h2>Ehdokkaat</h2>
<ol>
<c:forEach var="ehdokkaat" items="${requestScope.Ehdokaslist}" >
<li>${Ehdokas.id}: ${Ehdokas.etunimi}: ${Ehdokas.sukunimi}
</c:forEach>
</ol>

<%
ArrayList<Ehdokas> EhdokasList=(ArrayList<Ehdokas>)request.getAttribute("ehdokkaat");

for (int i=0;EhdokasList!=null && i<EhdokasList.size();i++){
	Ehdokas f=EhdokasList.get(i);
	out.println(f.getId()+": "+f.getetunimi()+" "+f.getsukunimi());
}
%>

<%@ include file="../html/somehtml.html" %>



</body>
</html>
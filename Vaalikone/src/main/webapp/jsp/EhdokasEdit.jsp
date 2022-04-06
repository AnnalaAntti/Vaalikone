<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${requestScope.ehdokas.etunimi} ${requestScope.ehdokas.sukunimi}</title>
</head>
<body>
<h2>${requestScope.ehdokas.etunimi} ${requestScope.ehdokas.sukunimi}</h2>
<form action='update' method='post'>
Ehdokas id: <input type='text' name='id' value='${requestScope.ehdokas.id}' readonly><br> 
Ehdokas etunimi: <input type='text' name='etunimi' value='${requestScope.ehdokas.etunimi}'><br>
Ehdokas sukunimi: <input type='text' name='sukunimi' value='${requestScope.ehdokas.sukunimi}'><br>
Kysymys 1 vastaus: <input type='text' name='k1' value='${requestScope.ehdokas.k1}'><br>
Kysymys 2 vastaus: <input type='text' name='k2' value='${requestScope.ehdokas.k2}'><br>
Kysymys 3 vastaus: <input type='text' name='k3' value='${requestScope.ehdokas.k3}'><br>
Kysymys 4 vastaus: <input type='text' name='k4' value='${requestScope.ehdokas.k4}'><br>
Kysymys 5 vastaus: <input type='text' name='k5' value='${requestScope.ehdokas.k5}'><br>
Kysymys 6 vastaus: <input type='text' name='k6' value='${requestScope.ehdokas.k6}'><br>
Kysymys 7 vastaus: <input type='text' name='k7' value='${requestScope.ehdokas.k7}'><br>
Kysymys 8 vastaus: <input type='text' name='k8' value='${requestScope.ehdokas.k8}'><br>
Kysymys 9 vastaus: <input type='text' name='k9' value='${requestScope.ehdokas.k9}'><br>
Kysymys 10 vastaus: <input type='text' name='k10' value='${requestScope.ehdokas.k10}'><br>
<input type='submit' name='ok' value='Send'> 
</form>
</body>
</html>     
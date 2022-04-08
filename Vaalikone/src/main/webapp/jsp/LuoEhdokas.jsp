<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Uusi ehdokas</title>
</head>
<body>
<h2>Uusi ehdokas</h2>
<form action='luoehdokas' method='post'>
Ehdokas etunimi: <input type='text' name='etunimi' value=''><br>
Ehdokas sukunimi: <input type='text' name='sukunimi' value=''><br>
Kysymys 1 vastaus: <input type='text' name='k1' value=''><br>
Kysymys 2 vastaus: <input type='text' name='k2' value=''><br>
Kysymys 3 vastaus: <input type='text' name='k3' value=''><br>
Kysymys 4 vastaus: <input type='text' name='k4' value=''><br>
Kysymys 5 vastaus: <input type='text' name='k5' value=''><br>
Kysymys 6 vastaus: <input type='text' name='k6' value=''><br>
Kysymys 7 vastaus: <input type='text' name='k7' value=''><br>
Kysymys 8 vastaus: <input type='text' name='k8' value=''><br>
Kysymys 9 vastaus: <input type='text' name='k9' value=''><br>
Kysymys 10 vastaus: <input type='text' name='k10' value=''><br>
<input type='submit' name='ok' value='Send'> 
</form>
</body>
</html>     
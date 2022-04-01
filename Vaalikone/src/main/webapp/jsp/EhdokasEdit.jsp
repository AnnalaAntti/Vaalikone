<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ehdokkaat</title>
</head>
<body>
<h2>Ehdokkaat</h2>
<form action='update' method='post'>
Ehdokas id: <input type='text' name='id' value='${requestScope.ehdokas.id}' readonly><br> 
Ehdokas etunimi: <input type='text' name='etunimi' value='${requestScope.ehdokas.etunimi}'><br>
<input type='submit' name='ok' value='Send'> 
</form>
</body>
</html> 
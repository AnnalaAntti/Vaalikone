<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ehdokas</title>
</head>
<body>
<h2>Edit fish</h2>
<form action='update' method='post'>
Ehdokas id: <input type='text' name='id' value='${requestScope.ehdokkaat.id}' readonly><br> 
Ehdokas etunimi: <input type='text' name='breed' value='${requestScope.ehdokkaat.etunimi}'><br>
<input type='submit' name='ok' value='Send'> 
</form>
</body>
</html>
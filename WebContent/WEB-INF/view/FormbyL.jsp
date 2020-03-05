<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
                    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<style type="text/css"><%@ include file="bootstrap.min.css"%></style>
<title>Home page</title>
</head>
<body>
<h2>Menu</h2>
<ul class="nav">
  <li class="nav-item">
    <a class="nav-link active" href="/TpHibernate/add">Ajout Formation</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="/TpHibernate/Liste">Liste Formation</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="/TpHibernate/addL">Ajout lieu</a>
  </li>
    <li class="nav-item">
    <a class="nav-link" href="/TpHibernate/GetF">Formation par lieu</a>
  </li>
</ul>
<h1>Afficher formation par lieu</h1>
<form action="/TpHibernate/GetF" method="post">
<div>
<label>Sélectionner lieu</label>
<select name="idlieu">
<c:forEach items="${liste}" var="list">
<option value="${list.idlieu}">${list.ville }</option>
</c:forEach>
</select>
</div>
<div>
<input type="submit" value="Afficher formations">
</div>
</form> 
</body>
</html>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
                <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<style type="text/css"><%@ include file="bootstrap.min.css"%></style>
<title>Nouvelle formation</title>
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
<form action="/TpHibernate/add" method="post">
<div>
<label>Id Formation</label>
<input type="number" name="id" placeholder="Saisir Id">
</div>
<div>
<label>Thème formation</label>
<input type="text" name="theme" placeholder="Saisir thème">
</div>


<div>
<label>Lieu à associer</label>
<select name="idlieu">
<c:forEach items="${liste}" var="liste">
<option value="${liste.idlieu}">${liste.ville }</option>
</c:forEach>
</select>
</div>
<div>
<input type="submit" value="Ajouter formation">
</div>
</form>

</body>
</html>
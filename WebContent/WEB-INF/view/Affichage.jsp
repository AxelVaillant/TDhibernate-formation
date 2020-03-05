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
<h1>Formations par lieu</h1>
<div class="container">
<div class ="row">
<div class="col-sm">


<p>Id Formation </p>
</div>
<div class="col-sm">


<p>Thème</p>
</div>
<div class="col-sm">


<p>Lieu</p>
</div>
</div>
<c:forEach items="${liste}" var="listef">
<div class ="row">
<div class="col-sm">


<p>${listef.idformation}</p>
</div>
<div class="col-sm">


<p>${listef.theme}</p>
</div>
<div class="col-sm">


<p>${listef.lieu.ville}</p>
</div>
</div>
</c:forEach>

</div>

</body>
</html>
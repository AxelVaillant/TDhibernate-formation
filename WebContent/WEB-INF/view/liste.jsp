<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<style type="text/css"><%@ include file="bootstrap.min.css"%></style>
<title>Liste</title>
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

</ul>
<h1>Formation existantes</h1>

<c:forEach items="${liste }" var="liste">
<div class="container-fluid">
<div class="row">
<div class ="col-lg-2">
<p>ID Formation = ${liste.id}</p> 
</div>
<div class ="col-lg-2">
<p>Theme = ${liste.theme}</p> 
</div>
</div>
</div>
</c:forEach>

</body>
</html>
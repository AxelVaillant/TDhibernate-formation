<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
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
<form action="/TpHibernate/addL" method="post">
<div>
<label>Ville</label>
<input type="text" name="ville" placeholder="Saisir ville">
</div>
<div>
<label>Adresse</label>
<input type="text" name="adresse" placeholder="Saisir adresse">
</div>
<div>
<input type="submit" value="Ajouter Lieu">
</div>
</form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Matiere</title>
</head>
<body>
Je suis une matière

<form action="ajout" method="post">

<table>

<tr>

<td><input type="text" name="idMatiere"></td>
<td><input type="text" name="nomMatiere"></td>

<td><input type="submit" value="ajoutMatiere" name="action"/></td>


</tr>
</table>


</form>

<form action="suppression" method="post">

<table>

<tr>
<td><input type="text" name="idMatiere"></td>
<td><input type="text" name="nomMatiere"></td>


<td><input type="submit" value="supprMatiere" name="action"></td>

</tr>
</table>


</form>

<form action="getid" method="post">

<table>

<tr>
<td><input type="text" name="idMatiere"></td>



<td><input type="submit" value="getidmatiere" name="action"></td>

</tr>
</table>

<table class="table table-striped">

<tr>

<th>Id Matiere</th>
<th>Nom Matiere</th>


</tr>



<tr>

<th>${lamatiere.idMatiere}</th>
<th>${lamatiere.nomMatiere}</th>

</tr>



</table>


</form>




<table class="table table-striped">

<tr>

<th>Id Matiere</th>
<th>Nom Matiere</th>


</tr>

<c:forEach items="${listematiere}" var="cl">

<tr>

<th>${cl.idMatiere}</th>
<th>${cl.nomMatiere}</th>

</tr>

</c:forEach>

</table>
<form action="affichage" method="get">
<input type="submit" value="getAllMatiere" name="action"></td>
</form>


<form action="accueil" method="get">
<input type="submit" value="oui" name="action"></td>
</form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Date"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ceci n'est pas du tout une arnaque</title>
</head>
<body>
	Bonjour, nous sommes
	<font color="red"><%=new Date()%></font> et vous etes forme pour la
	goire de Sparte!!!!

	<form method="post" action="MaServlet">
		<label for="nom">Nom : </label> <input type="text" name="nom" id="nom" /><br>
		<label for="prenom">Prenom : </label> <input type="text" name="prenom" id="prenom" /><br>
		<label for="email">E-mail : </label> <input type="text" name="email" id="email" /><br>
		<label for="login">Login : </label> <input type="text" name="login" id="login" /><br>
		<label for="cb">Carte Bleue : </label> <input type="text" name="cb" id="cb" />
		<label for="cb2">Carte Bancaire : </label> <input type="text" name="cb2" id="cb2" />

		<input type="submit" value="Envoyer" />

	</form>
</body>
</html>
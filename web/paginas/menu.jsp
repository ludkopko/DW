<%-- 
    Document   : menu
    Created on : 28/05/2018, 16:19:38
    Author     : Ludmila
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Menu</title>
        <link href="../Estilos/csswonder.css" rel="stylesheet" type="text/css"/>
</head>
<body>
	<div class="vertical-menu">
		<a href="#" class="active">Início</a>
                <a href="${pageContext.request.contextPath}/idioma" target="princ">Idioma</a>
		<a href="#" target="princ">Nível</a>
		<a href="#" target="princ">Professor</a>
		<a href="#" target="princ">Aluno</a>
		<a href="#" target="princ">Turma</a>
		<a href="#" target="princ">Matrícula</a>
		<a href="#" target="princ">Horários</a>
		<a href="#" target="princ">Relatórios</a>
	</div>

</body>
</html>

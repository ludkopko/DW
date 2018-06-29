<%-- 
    Document   : pag_juncao
    Created on : 28/05/2018, 16:20:50
    Author     : Ludmila
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>janela principal</title>
    </head>

    <frameset rows="150,*"  frameborder="0" >
        <frame src="header.jsp" />
        <frameset cols="200,*"  frameborder="0" >
            <frame src="menu.jsp" />
            <frame src="pag_inicial.jsp" name="princ"/>
        </frameset>
    </frameset>

</html>

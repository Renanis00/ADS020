<%-- 
    Document   : pagina
    Created on : 25/03/2020, 20:58:49
    Author     : dayor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="bean.UsuarioBean" %>
<%@page import="java.util.Date" %> // import java.util.Date;
<%@page errorPage="erro.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <% String mensagem = "Ola Mundo!";%>
        <h2><%= mensagem%></h2>
        <h3>${ 2/0 }</h3>
        <h4><%= new Date() %></h4>
        <h5><%= 10/2 %></h5>
        <%
            UsuarioBean usuario = new UsuarioBean(); 
            usuario.setNome("Agaraga");
            usuario.setEmail("agaraga@gmail.com");
        %>
        
        <jsp:useBean id="usuario2" class="bean.UsuarioBean" />
        <jsp:setProperty name="usuario2" property="nome" value="Maria"/>
        <jsp:setProperty name="usuario2" property="email" value="maria@iesb.br"/>
        
        <p>Usuario</p>
        <label>Nome:</label>
        <span><%=usuario.getNome()%></span><br>
        <label>Email:</label>
        <span><%=usuario.getEmail()%></span>
        
        <p>Usuario2</p>
        <label>Nome:</label>
        <span><jsp:getProperty name="usuario2" property="nome" /></span>
        <label>Email:</label><br>
        <span><jsp:getProperty name="usuario2" property="email" /></span>
        
        
        
    </body>
</html>

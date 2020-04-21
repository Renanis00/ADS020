<%-- 
    Document   : index
    Created on : 25/03/2020, 21:47:00
    Author     : dayor
--%>

<%@page import="java.util.Date;" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%> %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agaragã</title>
    </head>
    <body>
        <%String mensagem="Olá mundo!";%>
        
        <h1><%=mensagem%></h1>
        <p><%= new Date() %></p>
    </body>
</html>

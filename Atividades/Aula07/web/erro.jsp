<%-- 
    Document   : erro
    Created on : 25/03/2020, 21:09:43
    Author     : dayor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %>
<!DOCTYPE html>
<%@include  file ="cabecalho.jsp" %>
    <body>
        <h1>Deu ruim!</h1>
        <p><%=exception.getMessage()%></p>
    </body>
    <%@include file="rodape.jsp" %>    
</html>

<%-- 
    Document   : index
    Created on : 12/03/2024, 08:30:11
    Author     : 348996
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta content="width=device width, initial-scale=1, maximum-scale=1, user-scaleble=no" name="viewport" >
        <link rel="stylesheet" href="./static/bootstrap/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="./static/bootstrap/css/bootstrap-theme.min.css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Página Inicial</h1>
        <div class="container">
            <%@include file="banner.jsp" %>
            <%@include file="menu.jsp" %>
        </div>
    </body>
</html>

<%-- 
    Document   : listar_agendamento
    Created on : 23/03/2024, 19:53:32
    Author     : felip
--%>

<%@page import="model.ServicoDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Servico"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
       <link rel="stylesheet" href="./static/bulma/bulma.min.css">
        <link rel="stylesheet" href="./static/bulma/dataTables.bulma.css">
        <link rel="stylesheet" href="./static/bulma/font-awesome.min.css">
        <link rel="stylesheet" href="./static/bulma/css/bulma.css">
        <link rel="stylesheet" href="./static/css/menu.css">
        
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Quicksand:wght@300..700&display=swap" rel="stylesheet">
        
        <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
     
        
        
        <script src="static/js/bulmadatatable.js"></script>
       
      
        
    
        <title>JSP Page</title>
    </head>
    
    
 
    <body>
       
        <div class="grid-container">
            <%@include file="sidebar.jsp" %>
        
            
        
        <div id="principal" class="container-principal">
      

            <table  class="table is-hoverable is-striped" id="listarServico">    
            <thead>
               <tr>
                <th style="text-align:left;">ID</th>
                <th style="text-align:left;">Duração</th>
                <th style="text-align:left;">Status</th>
                <th style="text-align:left;">Nome</th>
                <th style="text-align:left;">Descrição</th>
                <th style="text-align:left;">Valor</th>
                <th style="text-align:left;">Ações</th>
            </tr>
            </thead>
 
            
            <jsp:useBean class="model.ServicoDAO" id="a"/>
            <tbody>
            <c:forEach var="a" items="${a.lista}">
                   
            <tr>
                <td>${a.idservico}</td>
                <td>${a.duracao}</td>
                <td>${a.status}</td>
                <td>${a.nome}</td>
                <td>${a.descricao}</td>
                <td>R$${a.valor}</td>
                <td class="acoes-td"><button class="botao-acoes"><i class="material-symbols-outlined">delete</i></button>
                <button class="botao-acoes"><i class="material-symbols-outlined">edit</i></button>
                </td>
            </tr>
            </c:forEach>
            </tbody>
        </table> 
            
           
        </div>
        </div>
            
 
        <script src="./static/bulma/jquery-3.7.1.js"></script>
        <script src="./static/bulma/dataTables.js"></script>
        <script src="./static/bulma/dataTables.bulma.js"></script>
        <script src="./static/js/bulmadatatable.js"></script>
        <script type="text/javascript" src="static/js/traducao.js"></script>
        <script type="text/javascript" src="static/js/modoescuro.js"></script>
     
        
    </body>
</html>

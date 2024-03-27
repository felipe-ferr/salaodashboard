<%-- 
    Document   : listar_agendamento
    Created on : 23/03/2024, 19:53:32
    Author     : felip
--%>

<%@page import="model.AgendamentoDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Agendamento"%>
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
        <link rel="stylesheet" href="./static/bulma/css/bulma.min.css">
        <link rel="stylesheet" href="./static/css/menu.css">
        
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Quicksand:wght@300..700&display=swap" rel="stylesheet">
        
        <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
     
        
        
        <script src="static/js/bulmadatatable.js"></script>
       
        <script type="text/javascript" src="static/js/traducao.js"></script>
        
    
        <title>JSP Page</title>
    </head>
    
    
 
    <body>
       
        <div class="grid-container">
            <div class="sidebar">
                <span class="sidebar-titulo">Salão do Luciano</span>
                <a href="#"><span class="material-symbols-outlined sidebar-icone">calendar_month</span>Agendamentos</a>
                <a href="#"><span class="material-symbols-outlined sidebar-icone">person</span>Clientes</a>
                <a href="#"><span class="material-symbols-outlined sidebar-icone">cut</span>Serviços</a>
                
               <a href="#" class="bottom" ><span class="material-symbols-outlined sidebar-icone">dark_mode</span></span>Modo Escuro</a>
            </div>
        
            
        
        <div class="container-principal">
             <h1>Lista de Agendamentos</h1>

            <table class="table is-striped is-bordered is-hoverable" id="listarAgendamento">    
            <thead>
               <tr>
                <th>ID</th>
                <th>Serviço</th>
                <th>Data</th>
                <th>Horário</th>
                <th>Valor</th>
            </tr>
            </thead>
            
            <tfoot>
               <tr>
                <th>ID</th>
                <th>Serviço</th>
                <th>Data</th>
                <th>Horário</th>
                <th>Valor</th>
            </tr>
            </tfoot>
            
            <jsp:useBean class="model.AgendamentoDAO" id="a"/>
            <tbody>
            <c:forEach var="a" items="${a.lista}">
                
           
            <tr>
                <td>${a.idAgendamento}</td>
                <td>${a.servico}</td>
                <td>${a.data}</td>
                <td>${a.horario}</td>
                <td>${a.valor}</td>
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
     
        
    </body>
</html>

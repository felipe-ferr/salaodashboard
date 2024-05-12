<%-- 
    Document   : listar_agendamento
    Created on : 23/03/2024, 19:53:32
    Author     : felip
--%>

<%@page import="controller.GerenciarLogin"%>
<%@page import="model.Usuario"%>
<%@page import="model.ClienteDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
    Usuario ulogado = GerenciarLogin.verificarAcesso(request, response);
    request.setAttribute("ulogado", ulogado);
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
        <link rel="stylesheet" href="./static/css/menu.css">
        <link rel="stylesheet" href="./static/css/tabelas.css">


        <script src="./static/bulma/jquery-3.7.1.js"></script>
        <script type="text/javascript" src="static/js/PesquisaTabela.js"></script>

        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatis.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Quicksand:wght@300..700&display=swap" rel="stylesheet">

        <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />

        <script type="text/javascript"> // adicionei aqui por conta do método de exclusão 
            function confirmarExclusão(id, nome) {
                if (confirm('Deseja desativar o agendamento ' + nome + '?')) {
                    location.href = 'gerenciar_agendamento.do?acao=deletar&idagendamento=' + id;
                }
            }
        </script>


        <script src="./static/js/pagination.js"></script>
        <script src="./static/js/dropdownRegistros.js"></script>



        <title>JSP Page</title>
    </head>



    <body>
      


        <div class="grid-container">
            <%@include file="sidebar.jsp" %>



            <div id="principal" class="container-principal">
                <p>oi</p>   
            </div>

        </div>

        <script type="text/javascript" src="static/js/modoescuro.js"></script>
        <script type="text/javascript" src="static/js/sumirTextoTextarea.js"></script>
        <script type="text/javascript" src="static/js/PesquisaTabela.js"></script>
        <script src="./static/js/pagination.js"></script>
        <script src="http://code.jquery.com/jquery-latest.js"></script>
        <script src="./static/js/showDesc.js"></script>
        <script src="./static/js/dropdownRegistros.js"></script>
        <script src="./static/js/filtrosTabela.js"></script>
        <script src="./static/js/fixedthead.js"></script>






    </body>

</html>



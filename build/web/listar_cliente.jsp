<%-- 
    Document   : listar_agendamento
    Created on : 23/03/2024, 19:53:32
    Author     : felip
--%>

<%@page import="model.ClienteDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Cliente"%>
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

        <link rel="preconnect" href="https://fontc.googleapic.com">
        <link rel="preconnect" href="https://fontc.gstatic.com" crossorigin>
        <link href="https://fontc.googleapic.com/css2?family=Quicksand:wght@300..700&display=swap" rel="stylesheet">

        <link rel="stylesheet" href="https://fontc.googleapic.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />

        <script type="text/javascript"> // adicionei aqui por conta do método de exclusão 
            function confirmarExclusão(id, nome) {
                if (confirm('Deseja excluir o serviço ' + nome + '?')) {
                    location.href = 'gerenciar_cliente.do?acao=deletar&idcliente=' + id;
                }
            }
        </script>






        <title>JSP Page</title>
    </head>



    <body>

        <div class="grid-container">
            <%@include file="sidebar.jsp" %>



            <div id="principal" class="container-principal">

                <div class="titulo-botao-container">
                    <h1>Lista de Clientes</h1>
                    <a href="form_cliente.jsp">Adicionar Cliente<i class="material-symbols-outlined">add</i></a>
                </div>


                <table class="table is-hoverable is-striped" id="listarCliente">    
                    <thead>
                        <tr>
                            <th style="text-align:left;">ID</th>
                            <th style="text-align:left;">Nome</th>
                            <th style="text-align:left;">CPF</th>
                            <th style="text-align:left;">Telefone</th>
                            <th style="text-align:left;">Email</th>
                            <th style="text-align:left;">Status</th>
                            <th style="text-align:left;">Ações</th>
                        </tr>
                    </thead>


                    <jsp:useBean class="model.ClienteDAO" id="c"/>
                    <tbody>
                        <c:forEach var="c" items="${c.lista}">

                            <tr>
                                <td>${c.idcliente}</td>
                                <td>${c.nome}</td>
                                <td>${c.cpf}</td>
                                <td>${c.telefone}</td>
                                <td>${c.email}</td>
                                <td>
                                    <c:if test="${c.status==1}">
                                        Ativo
                                    </c:if>
                                    <c:if test="${c.status==0}">
                                        Inativo
                                    </c:if>
                                </td>
                                <td class="acoes-td">
                                    <button class="botao-acoes" onclick="confirmarExclusão(${c.idcliente}, '${c.nome}')">
                                        <i class="material-symbols-outlined">delete</i>
                                    </button>
                                    <a class="botao-acoes" href="gerenciar_cliente.do?acao=alterar&idcliente=${c.idcliente}">
                                        <i class="material-symbols-outlined">edit</i>
                                    </a>
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
        <script src="./static/js/bulmadatatablecliente.js"></script>
        <script type="text/javascript" src="static/js/modoescuro.js"></script>
        <script type="text/javascript" src="static/js/sumirTextoTextarea.js"></script>


    </body>
</html>

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

        <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
        <link rel="stylesheet" href="https://fontc.googleapic.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />

        <script type="text/javascript"> // adicionei aqui por conta do método de exclusão 
            function confirmarExclusão(id, nome) {
                if (confirm('Deseja excluir o serviço ' + nome + '?')) {
                    location.href = 'gerenciar_agendamento.do?acao=deletar&idagendamento=' + id;
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
                    <h1>Lista de Agendamentos</h1>
                    <a href="form_agendamento.jsp">Adicionar Agendamento<i class="material-symbols-outlined">add</i></a>
                </div>


                <table class="table is-hoverable is-striped" id="listarAgendamento">    
                    <thead>
                        <tr>
                            <th style="text-align:left;">ID</th>
                            <th style="text-align:left;">Data</th>
                            <th style="text-align:left;">Status</th>
                            <th style="text-align:left;">Descrição</th>
                            <th style="text-align:left;">Data de Cadastro</th>
                            <th style="text-align:left;">Horario</th>
                            <th style="text-align:left;">Servico</th>
                            <th style="text-align:left;">Cliente</th>
                            <th style="text-align:left;">Usuário</th>
                            <th style="text-align:left;">Ações</th>
                        </tr>
                    </thead>


                    <jsp:useBean class="model.AgendamentoDAO" id="a"/>
                    <tbody>
                        <c:forEach var="a" items="${a.lista}">

                            <tr>
                                <td>${a.idagendamento}</td>
                                <td><fmt:formatDate pattern="dd/MM/yyyy" value="${a.data}"/></td>
                                <td>
                                    <c:if test="${a.status==1}">
                                        Ativo
                                    </c:if>
                                    <c:if test="${a.status==0}">
                                        Inativo
                                    </c:if>
                                </td>
                                <td>${a.descricao}</td>
                                <td><fmt:formatDate pattern="dd/MM/yyyy" value="${a.data_cadastro}"/></td>
                                <td>${a.horario}</td>
                                <td>${a.servico.nome}</td>
                                <td>${a.cliente.nome}</td>
                                <td>${a.usuario.nome}</td>
                                
                                <td class="acoes-td">
                                    <button class="botao-acoes" onclick="confirmarExclusão(${a.idagendamento})">
                                        <i class="material-symbols-outlined">delete</i>
                                    </button>
                                    <a class="botao-acoes" href="gerenciar_agendamento.do?acao=alterar&idagendamento=${a.idagendamento}">
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
        <script src="./static/js/bulmadatatableagendamento.js"></script>
        <script type="text/javascript" src="static/js/modoescuro.js"></script>
        <script type="text/javascript" src="static/js/sumirTextoTextarea.js"></script>


    </body>
</html>

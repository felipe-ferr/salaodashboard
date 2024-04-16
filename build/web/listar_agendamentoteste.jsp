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
        <link rel="stylesheet" href="./static/css/testetabelas.css">

        <link rel="preconnect" href="https://fontc.googleapic.com">
        <link rel="preconnect" href="https://fontc.gstatic.com" crossorigin>
        <link href="https://fontc.googleapic.com/css2?family=Quicksand:wght@300..700&display=swap" rel="stylesheet">

        <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
        <link rel="stylesheet" href="https://fontc.googleapic.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />

        <script type="text/javascript"> // adicionei aqui por conta do método de exclusão 
            function confirmarExclusão(id, nome) {
                if (confirm('Deseja desativar o agendamento ' + nome + '?')) {
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

                <div class="titulo-botao-container">
                    <input type="text" placeholder="Procurar.." onkeyup="pesquisar()" id="pesquisainput">
                </div>



                <div class="tabela-container">
                    <div class="thead">
                        <div>ID</div>
                        <div>Valor</div>
                        <div>Data</div>
                        <div>Status</div>
                        <div>Descrição</div>
                        <div>Data de Agendamento</div>
                        <div>Horário</div>
                        <div>Serviço</div>
                        <div>Cliente</div>
                        <div>Usuário</div>
                        <div>Ações</div>
                    </div>

                    <jsp:useBean class="model.AgendamentoDAO" id="a"/>

                    <c:forEach var="a" items="${a.lista}">


                        <div id="table" class="tabela">

                            <div><span>${a.idagendamento}</span></div>
                            <div><span>${a.valor}</span></div>
                            <div><span><fmt:formatDate pattern="dd/MM/yyyy" value="${a.data}"/></span></div>
                            <div>
                                <span>
                                <c:if test="${a.status==1}">
                                    Ativo
                                </c:if>
                                <c:if test="${a.status==0}">
                                    Inativo
                                </c:if>
                                </span>
                            </div>
                            <div><span>${a.descricao}</span></div>
                            <div><span><fmt:formatDate pattern="dd/MM/yyyy" value="${a.data_cadastro}"/></span></div>
                            <div><span>${a.horario}</span></div>
                            <div><span>${a.servico.nome}</span></div>
                            <div><span>${a.cliente.nome}</span></div>
                            <div><span>${a.usuario.nome}</span></div>

                            <div class="acoes-div">
                                <button class="botao-acoes" onclick="confirmarExclusão(${a.idagendamento})">
                                    <i class="material-symbols-outlined">delete</i>
                                </button>
                                <a class="botao-acoes" href="gerenciar_agendamento.do?acao=alterar&idagendamento=${a.idagendamento}">
                                    <i class="material-symbols-outlined">edit</i>
                                </a>
                            </div>
                        </div>

                    </c:forEach>
                </div>




            </div>
        </div>



        <script src="./static/bulma/jquery-3.7.1.js"></script>
        <script src="./static/bulma/dataTables.js"></script>
        <script src="./static/bulma/dataTables.bulma.js"></script>
        <script src="./static/js/bulmadatatableagendamento.js"></script>
        <script type="text/javascript" src="static/js/modoescuro.js"></script>
        <script type="text/javascript" src="static/js/sumirTextoTextarea.js"></script>
        <script type="text/javascript" src="static/js/PesquisaTabela.js"></script>


    </body>
</html>

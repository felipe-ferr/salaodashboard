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

                           


                <div class="row-container">
                    <h1>Lista de Agendamentos</h1>
                    <a href="form_agendamento.jsp">Adicionar Agendamento <i class="material-symbols-outlined">add</i></a>
                </div>

                <div class="row-container">

                    <div class="searchContainer">
                        <input type="text" id="searchInput" placeholder="Pesquisar">
                        <i class="material-symbols-outlined">search</i>
                    </div>

                     <div class="dropdown-texto-container">
                        <p>Ordenar Por:</p>
                        <div id="dropdownBtnContainer" onmouseover="toggleDropdownMenu()" class="dropdownContainer">
                            <div class="dropdownBtnContainer">
                                <div class="dropdownBtn" id="selectedOption">Padrão</div>
                                <i class="material-symbols-outlined">keyboard_arrow_down</i>
                            </div>
                            <div onclick="updateSelectedOption(event)" id="drop" class="dropdownMenu hidden">
                                <span onclick="sortNomeAlfabetica()">Ordem Alfabética</span>
                                <span onclick="sortIdRowDescending()">Ordem Crescente</span>
                                <span onclick="sortIdRowAscending()">Ordem Decrescente</span>
                                <span onclick="sortValorRowAscending()">Valor mais alto</span>
                                <span onclick="sortValorRowDescending()">Valor mais baixo</span>
                                <span onclick="sortDataDescending()">Mais Próximos</span>
                                <span onclick="sortDataAscending()">Mais Distantes</span>
                                <span onclick="sortDataCadastroDescending()">Mais Recentes</span>
                                <span onclick="sortDataCadastroAscending()">Mais Antigos</span>
                            </div>
                        </div>
                    </div>
                    
                    <div class="dropdown-texto-container">
                        <p>Mostrar: </p>
                        <div id="dropdownBtnContainerMostrar" onmouseover="hoverDropdownMenuMostrar()" class="dropdownContainer">
                            <div class="dropdownBtnContainer">
                                <div class="dropdownBtn" id="selectedOptionMostrar">Todas</div>
                                <i class="material-symbols-outlined">keyboard_arrow_down</i>
                            </div>
                            <div onclick="updateSelectedOptionMostrar(event)" id="dropmostrar" class="dropdownMenu hidden">
                                <span onclick="displayAll()">Todas</span>
                                <span onclick="filterItemsByStatusCancelado()">Canceladas</span>
                                <span onclick="filterItemsByStatusPendente()">Pendentes</span>
                              
                            </div>
                        </div>
                    </div>



                    <div class="searchContainer">
                        <input type="text" placeholder="Procurar Tabela Inteira.." id="searchAll">
                        <i class="material-symbols-outlined">search</i>
                    </div>
                </div>



                <div class="row-container">
                    <div class="thead">
                        <div class="id-row">ID</div>
                        <div>Valor</div>
                        <div>Data</div>          
                        <div>Descrição</div>
                        <div>Data de Agendamento</div>
                        <div>Horário</div>
                        <div>Serviço</div>
                        <div>Cliente</div>
                        <div>Usuário</div>
                        <div>Status</div>
                        <div>Ações</div>
                    </div>
                </div>
                <div id="table" class="tabela-container container">


                    <jsp:useBean class="model.AgendamentoDAO" id="a"/>

                    <c:forEach var="a" items="${a.lista}">


                        <div id="item" class="tabela td" style="font-size: 0.9vw">

                            <div class="id-row">${a.idagendamento}</div>
                            <div class="valor-row">${a.valor}</div>
                            <div class="data"><fmt:formatDate pattern="dd/MM/yyyy" value="${a.data}"/></div>                           
                            <div>
                                <i onclick="showDescDiv(this)" style="cursor: pointer;" class="material-symbols-outlined">comment</i>
                                <span class="desc" style="display:none">
                                    ${a.descricao}
                                </span>
                            </div>
                            <div class="datacadastro"><fmt:formatDate pattern="dd/MM/yyyy" value="${a.data_cadastro}"/></div>
                            <div>${a.horario}</div>
                            <div>${a.servico.nome}</div>
                            <div class="nome-row">${a.cliente.nome}</div>
                            <div>${a.usuario.nome}</div>
                            <div class="status">

                                <c:if test="${a.status==1}">
                                    <span class="ativo">Pendente</span>
                                </c:if>
                                <c:if test="${a.status==0}">
                                    <span class="inativo">Cancelado</span>
                                </c:if>

                            </div>
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

                    <div id="pagination" class="pagination">
                        <button id="firstPageBtn">Primeira</button>
                        <button class="prevnextbtn" id="prevPageBtn"><i class="material-symbols-outlined">navigate_before</i></button>
                        <button class="prevnextbtn" id="nextPageBtn"><i class="material-symbols-outlined">navigate_next</i></button>
                        <button id="lastPageBtn">Última</button>
                    </div>
                </div>




                <div id="pageInfo" onload="updatePageInfo()"></div>








            </div>

        </div>

        <script src="./static/bulma/jquery-3.7.1.js"></script>
        <script type="text/javascript" src="static/js/modoescuro.js"></script>
        <script type="text/javascript" src="static/js/sumirTextoTextarea.js"></script>
        <script type="text/javascript" src="static/js/PesquisaTabela.js"></script>
        <script src="./static/js/pagination.js"></script>
        <script src="http://code.jquery.com/jquery-latest.js"></script>
        <script src="./static/bulma/jquery-3.7.1.js"></script>
        <script src="./static/js/showDesc.js"></script>
        <script src="./static/js/dropdownRegistros.js"></script>
        <script src="./static/js/filtrosTabela.js"></script>





    </body>

</html>



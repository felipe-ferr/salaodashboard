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
        <script>
// Script para carregar o modo escuro antes do usuário ver a página.

// Pegar o valor do cookie
            function getCookie(name) {
                let nameEQ = name + "=";
                let ca = document.cookie.split(';');
                for (let i = 0; i < ca.length; i++) {
                    let c = ca[i];
                    while (c.charAt(0) == ' ')
                        c = c.substring(1, c.length);
                    if (c.indexOf(nameEQ) == 0)
                        return c.substring(nameEQ.length, c.length);
                }
                return null;
            }

// Funções pra aplicar o modo escuro e claro
            function escuro() {
                document.documentElement.style.setProperty('--cor-clara', '#252525');
                document.documentElement.style.setProperty('--cor-escura', '#181818');
                document.documentElement.style.setProperty('--cor-texto', '#AFAFAF');
                document.documentElement.style.setProperty('--cor-texto-preto', '#DFDFDF');
                document.documentElement.style.setProperty('--cor-tabela-stripe', '#161616');

            }

            function light() {
                document.documentElement.style.setProperty('--cor-clara', '#eaeaea');
                document.documentElement.style.setProperty('--cor-escura', '#f5f5f5');
                document.documentElement.style.setProperty('--cor-texto', '##0F0300');
                document.documentElement.style.setProperty('--cor-texto-preto', 'black');
                document.documentElement.style.setProperty('--cor-tabela-stripe', '#F0F0F0');

            }

// Função pra checar o cookie e aplicar o tema antes da página carregar
            (function checkCookieAndApplyTheme() {
                let theme = getCookie("theme");
                if (theme === "dark") {
                    escuro();
                } else if (theme === "light") {
                    light();
                }
            })();

        </script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
        <link rel="stylesheet" href="./static/css/menu.css">
        <link rel="stylesheet" href="./static/css/tabelas.css">
        <script src="./static/js/modoescuro.js"></script>
        <meta charset="UTF-8">

        <link rel="icon" type="image/x-icon" href="static/favicon/favicon.ico">


        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatis.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Quicksand:wght@300..700&display=swap" rel="stylesheet">

        <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />

        <script type="text/javascript"> // adicionei aqui por conta do método de exclusão 
            function confirmarExclusão(id, nome) {
                if (confirm('Deseja desativar o agendamento ' + id + '?')) {
                    location.href = 'gerenciar_agendamento.do?acao=deletar&idagendamento=' + id;
                }
            }
            function confirmarAtivação(id, nome) {
                if (confirm('Deseja Ativar o agendamento ' + id + '?')) {
                    location.href = 'gerenciar_agendamento.do?acao=ativar&idagendamento=' + id;
                }
            }
        </script>


        <script src="./static/js/pagination.js"></script>
        <script src="./static/js/dropdownRegistros.js"></script>



        <title>Agendamentos</title>
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
                                <span onclick="filterItemsByStatusConcluido()">Concluídos</span>

                            </div>
                        </div>
                    </div>



                    <div class="searchContainer">
                        <input type="text" placeholder="Procurar Tabela Inteira.." id="searchAll">
                        <i class="material-symbols-outlined">search</i>
                    </div>
                </div>



                <div class="row-container">
                    <div id="nav" class="thead">
                        <div class="id-row">ID</div>
                        <div>Cliente</div>
                        <div>Data</div>          
                        <div>Horario</div>
                        <div>Serviço</div>
                        <div>Usuario</div>
                        <div>Valor</div>
                        <div>Data de Agendamento</div>
                        <div>Descrição</div>
                        <div>Status</div>
                        <div>Ações</div>
                    </div>
                </div>
                <div id="table" class="tabela-container container">


                    <jsp:useBean class="model.AgendamentoDAO" id="a"/>

                    <c:forEach var="a" items="${a.lista}">


                        <div id="item" class="tabela td" style="font-size: 0.9vw">

                            <div class="id-row">${a.idagendamento}</div>
                            <div class="nome-row">${a.cliente.nome}</div>
                            <div class="data "id="data"><fmt:formatDate pattern="dd/MM/yyyy" value="${a.data}"/></div>                       
                            <div>${a.horario}</div>
                            <div>${a.servico.nome}</div>
                            <div>${a.usuario.nome}</div>
                            <div class="valor-row">${a.valor}</div>
                            <div class="datacadastro"><fmt:formatDate pattern="dd/MM/yyyy" value="${a.data_cadastro}"/></div>                 
                            <div>
                                <i onclick="showDescDiv(this)" style="cursor: pointer;" class="material-symbols-outlined">comment</i>
                                <span class="desc" style="display:none">
                                    ${a.descricao}
                                </span>
                            </div>
                            <div class="status">
                                <c:if test="${a.status==1}">
                                    <span id="pendente" class="ativo">Pendente</span>
                                </c:if>
                                <c:if test="${a.status==0}">
                                    <span id="inativo" class="inativo">Cancelado</span>                
                                </c:if>
                            </div>
                            <div class="acoes-div">
                                <div>
                                    <i onclick="showDeletarDiv(this)" style="cursor: pointer;" class="material-symbols-outlined"style="color:var(--dourado)">settings</i>
                                    <span class="deletar scale-in-center" style="display:none">
                                        <a onclick="confirmarExclusão(${a.idagendamento})">
                                            <i class="material-symbols-outlined">close</i>
                                            Desativar
                                        </a>
                                        <a onclick="confirmarAtivação(${a.idagendamento})">
                                            <i class="material-symbols-outlined">check_box</i>
                                            Ativar
                                        </a>
                                    </span>
                                </div> 
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
        <script>
            document.addEventListener("DOMContentLoaded", function () {
                const descElements = document.querySelectorAll('.desc');
                descElements.forEach(function (descElement) {
                    if (descElement.textContent.trim() === '') {
                        descElement.textContent = 'Este agendamento não possui uma descrição';
                    }
                });
            });
        </script>
        <script type="text/javascript" src="static/js/modoescuro.js"></script>
        <script src="./static/js/pagination.js"></script>
        <script src="http://code.jquery.com/jquery-latest.js"></script>
        <script src="./static/js/showDesc.js"></script>
        <script src="./static/js/dropdownRegistros.js"></script>
        <script src="./static/js/filtrosTabela.js"></script>
        <script src="./static/js/marcarConcluido.js"></script>






    </body>

</html>



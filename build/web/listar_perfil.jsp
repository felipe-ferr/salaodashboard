<%-- 
    Document   : listar_perfil
    Created on : 23/03/2024, 19:53:32
    Author     : felip
--%>

<%@page import="model.PerfilDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Perfil"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="controller.GerenciarLogin"%>
<%@page import="model.Usuario"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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


        <script src="./static/bulma/jquery-3.7.1.js"></script>
        <script type="text/javascript" src="static/js/PesquisaTabela.js"></script>

        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatis.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Quicksand:wght@300..700&display=swap" rel="stylesheet">

        <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />

        <script type="text/javascript"> // adicionei aqui por conta do método de exclusão 
            function confirmarExclusão(id, nome) {
                if (confirm('Deseja desativar o perfil ' + nome + '?')) {
                    location.href = 'gerenciar_perfil.do?acao=deletar&idperfil=' + id;
                }
            }
        </script>


        <script src="./static/js/pagination.js"></script>
        <script src="./static/js/dropdownRegistros.js"></script>



        <title>Perfis</title>
    </head>



    <body>



        <div class="grid-container">
            <%@include file="sidebar.jsp" %>



            <div id="principal" class="container-principal">




                <div class="row-container">
                    <h1>Lista de Perfis</h1>
                    <a href="form_perfil.jsp">Adicionar Perfil<i class="material-symbols-outlined">add</i></a>
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
                                <div class="dropdownBtn" id="selectedOption">Ordem Crescente</div>
                                <i class="material-symbols-outlined">keyboard_arrow_down</i>
                            </div>
                            <div onclick="updateSelectedOption(event)" id="drop" class="dropdownMenu hidden">
                                <span onclick="sortIdRowDescending()">Ordem Crescente</span>
                                <span onclick="sortIdRowAscending()">Ordem Decrescente</span>
                                <span onclick="sortNomeAlfabetica()">Ordem Alfabética</span>
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
                        <div>Nome</div>
                        <div>Ações</div>
                    </div>
                </div>
                <div id="table" class="tabela-container container">


                    <jsp:useBean class="model.PerfilDAO" id="p"/>

                    <c:forEach var="p" items="${p.lista}">


                        <div id="item" class="tabela td">

                            <div class="id-row">${p.idperfil}</div>
                            <div class="nome-row">${p.nome}</div>
                            <div class="acoes-div">
                                <button class="botao-acoes" onclick="confirmarExclusão(${p.idperfil})">
                                    <i class="material-symbols-outlined">delete</i>
                                </button>
                                <a class="botao-acoes" href="gerenciar_perfil.do?acao=alterar&idperfil=${p.idperfil}">
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

            <script src="./static/bulma/jquery-3.7.1.js"></script>
            <script type="text/javascript" src="static/js/modoescuro.js"></script>
            <script type="text/javascript" src="static/js/sumirTextoTextarea.js"></script>
            <script type="text/javascript" src="static/js/PesquisaTabelajs"></script>
            <script src="./static/js/pagination.js"></script>
            <script src="http://code.jquery.com/jquery-latest.js"></script>
            <script src="./static/bulma/jquery-3.7.1.js"></script>
            <script src="./static/js/showDesc.js"></script>
            <script src="./static/js/dropdownRegistros.js"></script>
            <script src="./static/js/filtrosTabela.js"></script>





    </body>

</html>



<%-- 
    Document   : listar_usuario
    Created on : 23/03/2024, 19:53:32
    Author     : felip
--%>

<%@page import="model.UsuarioDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Usuario"%>
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
                if (confirm('Deseja desativar o usuario ' + nome + '?')) {
                    location.href = 'gerenciar_usuario.do?acao=deletar&idusuario=' + id;
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
                    <h1>Lista de Usuarios</h1>
                    <a href="form_usuario.jsp">Adicionar Usuario <i class="material-symbols-outlined">add</i></a>
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
                    
                    <div class="dropdown-texto-container">
                        <p>Mostrar: </p>
                        <div id="dropdownBtnContainerMostrar" onmouseover="hoverDropdownMenuMostrar()" class="dropdownContainer">
                            <div class="dropdownBtnContainer">
                                <div class="dropdownBtn" id="selectedOptionMostrar">Todas</div>
                                <i class="material-symbols-outlined">keyboard_arrow_down</i>
                            </div>
                            <div onclick="updateSelectedOptionMostrar(event)" id="dropmostrar" class="dropdownMenu hidden">
                                <span onclick="displayAll()">Todas</span>
                                <span onclick="filterItemsByStatusInativo()">Inativos</span>
                                <span onclick="filterItemsByStatusAtivo()">Ativos</span>
                              
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
                        <div>CPF</div>
                        <div>Telefone</div>
                        <div>Email</div>
                        <div>Status</div>
                        <div>Ações</div>
                    </div>
                </div>
                <div id="table" class="tabela-container container">


                    <jsp:useBean class="model.UsuarioDAO" id="u"/>

                    <c:forEach var="u" items="${u.lista}">


                        <div id="item" class="tabela td">

                            <div class="id-row">${u.idusuario}</div>
                            <div class="nome-row">${u.nome}</div>
                            <div>${u.cpf}</div>
                            <div>${u.telefone}</div>
                            <div>${u.login}</div>
                            <div class="status">

                                <c:if test="${u.status==1}">
                                    <span class="ativo">Ativo</span>
                                </c:if>
                                <c:if test="${u.status==0}">
                                    <span class="inativo">Inativo</span>
                                </c:if>
                            </div>

                            <div class="acoes-div">
                                <button class="botao-acoes" onclick="confirmarExclusão(${u.idusuario})">
                                    <i class="material-symbols-outlined">delete</i>
                                </button>
                                <a class="botao-acoes" href="gerenciar_usuario.do?acao=alterar&idusuario=${u.idusuario}">
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



<%-- 
    Document   : form_agendamento
    Created on : 02/04/2024, 08:29:35
    Author     : 349550
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./static/css/form.css">
        <link rel="stylesheet" href="./static/css/menu.css">

        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.mask/1.14.15/jquery.mask.js"></script>

        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Quicksand:wght@300..700&display=swap" rel="stylesheet">

        <link rel="stylesheet" href="./static/css/testetabelas.css">
        <title>JSP Page</title>

        <script src="./static/js/mascaras.js"></script>
        <script src="./static/jquerymask/src/jquery.mask.js"></script>


    </head>
    <body>

        <div class="grid-container">
            <%@include file="sidebar.jsp" %>

            <div class="container-principal">
                <form method="POST"action="gerenciar_agendamento.do" value="">

                    <a class="botaoinicio"href="#">
                        <i class="material-symbols-outlined">arrow_back</i>Voltar ao início
                    </a>

                    <h1>Cadastrar Agendamento</h1>

                    <input type="hidden" name="idagendamento" value="${agendamento.idagendamento}"/>

                    <div class="inputContainerRow">
                        <div class="inputContainer">
                            <input id="money" data-mask="00/00/0000" required type="number" name="valor" value="${agendamento.valor}">
                            <p>Valor</p>
                            <i class="material-symbols-outlined">account_circle</i>
                        </div>


                        <div class="inputContainer">
                            <input id="dateInput" required type="text" name="data" value="<fmt:formatDate pattern="dd/MM/yyyy" value="${agendamento.data}"/>">
                            <p>Data:</p>
                            <i class="material-symbols-outlined">cut</i>
                        </div>
                    </div>

                    <script type="text/javascript" src="./static/js/sumirTextoTextarea.js"></script>
                    <div style="margin-top: 5vh" class="inputContainer">
                        <p class="textareatexto" id="ptextarea">Descrição</p>
                        <textarea id="area" onclick="sumirp()" type="text" name="descricao" value="${agendamento.descricao}"></textarea>
                    </div>

                    <div class="inputContainerRow">
                        <div class="inputContainer">
                            <input id="date" required type="text" name="data_cadastro" value="<fmt:formatDate pattern="dd/MM/yyyy" value="${agendamento.data_cadastro}"/>">
                            <p>Data de Agendamento</p>
                            <i class="material-symbols-outlined">key</i>
                        </div>
                        <div class="inputContainer">
                            <input required type="text" name="horario" value="${agendamento.horario}">
                            <p>Horário</p>
                            <i class="material-symbols-outlined">key</i>
                        </div>
                    </div>




                    <div class="inputContainerRow">



                        <select name="status" class="select">
                            <option value="1">Ativo</option>
                            <option value="0">Inativo</option>
                        </select>



                       
                    </div>

                    <div id="dropdownBtnContainer" onclick="toggleDropdownMenu()" class="dropdownContainer">
                        <div class="dropdownBtnContainer">
                            <div class="dropdownBtn" id="selectedOptionMostrar">Todas</div>
                            <i class="material-symbols-outlined">keyboard_arrow_down</i>
                        </div>
                        <div onclick="updateSelectedOptionMostrar(event)" id="drop" class="dropdownMenu hidden">
                            <jsp:useBean class="model.ServicoDAO" id="servico"/>                   
                            <c:forEach var="s" items="${servico.lista}">
                            <label><input type="radio" name="idservico" value="${s.idservico}">${s.nome}</label>
                             </c:forEach>
                        </div>
                    </div>

                    <div class="inputContainerRow">
                        <select name="idcliente" class="select">
                            <option value="">Selecionar Cliente</option>
                            <jsp:useBean class="model.ClienteDAO" id="cliente"/>
                            <c:forEach var="c" items="${cliente.lista}">
                                <option value="${c.idcliente}">${c.nome}</option>

                            </c:forEach>

                        </select>

                        <select name="idusuario" class="select">
                            <option value="">Selecionar Usuário</option>
                            <jsp:useBean class="model.UsuarioDAO" id="usuario"/>
                            <c:forEach var="u" items="${usuario.lista}">
                                <option value="${u.idusuario}">${u.nome}</option>

                            </c:forEach>

                        </select>
                    </div>






                    <button type="submit"class="submit">Cadastrar Agendamento</button>

                </form>

            </div>
        </div>


        <script src="./static/js/dropdownForms.js"></script>
        <script src="./static/js/mascaras.js"></script>
        <script>
                            $(document).ready(function () {
                                $('#date').mask('00/00/0000');
                                $('.time').mask('00:00:00');
                                $('.cep').mask('00000-000');
                                $('.phone').mask('(00) 00000-0000');
                                $('.cpf').mask('000.000.000-00');
                                $('#money').mask('000.000.000.000,00');
                            });
        </script>

    </body>
</html>
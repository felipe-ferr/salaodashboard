

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="controller.GerenciarLogin"%>
<%@page import="model.Usuario"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Usuario ulogado = GerenciarLogin.verificarAcesso(request, response);
    request.setAttribute("ulogado", ulogado);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./static/css/form.css">
        <link rel="stylesheet" href="./static/css/menu.css">

        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Quicksand:wght@300..700&display=swap" rel="stylesheet">

        <script type="text/javascript" src="static/js/mascaras.js"></script>
        <link rel="stylesheet" href="./static/css/testetabelas.css">
        <title>JSP Page</title>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.mask/1.14.15/jquery.mask.js"></script>
        <script src="./static/js/dropdownRegistros.js"></script>
        <script src="./static/jquerymask/src/jquery.mask.js"></script>

    </head>
    <body>

        <div class="grid-container">
            <%@include file="sidebar.jsp"%>

            <div class="container-principal">
                <form method="POST"action="gerenciar_cliente.do" value="">

                    <a class="botaoinicio"href="#">
                        <i class="material-symbols-outlined">arrow_back</i>Voltar ao início
                    </a>

                    <h1>Cadastrar Cliente</h1>

                    <input type="hidden" name="idcliente" value="${cliente.idcliente}"/>

                    <div class="inputContainerRow">
                        <div class="inputContainer">
                            <input required type="text" name="nome" value="${cliente.nome}">
                            <p>Nome:</p>
                            <i class="material-symbols-outlined">person</i>
                        </div>

                        <div class="inputContainer">
                            <input required type="text" name="email" value="${cliente.email}">
                            <p>Email: </p>
                            <i class="material-symbols-outlined">mail</i>
                        </div>
                    </div>

                    <div class="inputContainerRow">
                        <div class="inputContainer">
                            <input class="cpf" required type="text" name="cpf" value="${cliente.cpf}">
                            <p>CPF: </p>
                            <i class="material-symbols-outlined">description</i>
                        </div>


                        <div class="inputContainer">
                            <input class="phone" required type="text" name="telefone" value="${cliente.telefone}">
                            <p>Telefone: </p>
                            <i class="material-symbols-outlined">phone</i>
                        </div>
                    </div>



                    <div class="inputContainerRow">
                        <div class="containerColumn">
                            <span>Status</span>
                            <div style="width: 30%" onclick="setupDropdown()" id="dropdownBtnContainer" class="dropdownContainer">
                                <div class="dropdownBtnContainer">
                                    <div class="dropdownBtn" id="selectedOptionMostrar">Ativo</div>
                                    <i class="material-symbols-outlined">keyboard_arrow_down</i>
                                </div>
                                <div id="dropstatus" class="dropdownMenu hidden">
                                    <label class="label"><input type="radio" checked name="status" value="1">Ativo</label>
                                    <label class="label"><input type="radio" name="status" value="0">Inativo</label>
                                </div>
                            </div>
                        </div>
                    </div>


                    <button type="submit"class="submit">Cadastrar cliente</button>

                </form>

            </div>
        </div>


        <script>
            $(document).ready(function () {
                $('#date').mask('00/00/0000');
                $('.time').mask('00:00:00');
                $('.cep').mask('00000-000');
                $('.phone').mask('(00) 00000-0000');
                $('.cpf').mask('000.000.000-00');

            });
        </script>    
        <script src="./static/js/dropdownForms.js"></script>
    </body>
</html>
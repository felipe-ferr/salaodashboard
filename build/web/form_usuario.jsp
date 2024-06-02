<%-- 
    Document   : form_usuario
    Created on : 02/04/2024, 08:29:35
    Author     : 349550
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <script src="./static/js/modoescuro.js"></script>
        <link rel="stylesheet" href="./static/css/form.css">
        
        <link rel="icon" type="image/x-icon" href="static/favicon/favicon.ico">

        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Quicksand:wght@300..700&display=swap" rel="stylesheet">
        
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.mask/1.14.15/jquery.mask.js"></script>

        <title>Adicionar Usuário</title>

    </head>
    <body>

        <div class="grid-container">
            <%@include file="sidebar.jsp" %>

            <div class="container-principal">
                <form method="POST"action="gerenciar_usuario.do" value="" accept-charset="ISO-8859-1" >

                    <a class="botaoinicio"href="listar_usuario.jsp">
                        <i class="material-symbols-outlined">arrow_back</i>Voltar
                    </a>

                    <h1>Cadastrar Usuário</h1>

                    <input type="hidden" name="idusuario" value="${usuario.idusuario}"/>

                    <div class="inputContainer">
                        <input required type="text"name="nome" value="${usuario.nome}">
                        <p>Nome:</p>
                        <i class="material-symbols-outlined">cut</i>
                    </div>

                    <div class="inputContainerRow">
                        <div class="inputContainer">
                            <input class="cpf" required type="text" name="cpf" value="${usuario.cpf}">
                            <p>CPF</p>
                            <i class="material-symbols-outlined">description</i>
                        </div>

                        <div class="inputContainer">
                            <input class="phone" required type="text" name="telefone" value="${usuario.telefone}">
                            <p>Telefone</p>
                            <i class="material-symbols-outlined">phone</i>
                        </div>
                    </div>

                    <div class="inputContainerRow">
                        <div class="inputContainer">
                            <input required type="text" name="login" value="${usuario.login}">
                            <p>Login</p>
                            <i class="material-symbols-outlined">account_circle</i>
                        </div>
                        <div class="inputContainer">
                            <input required type="password" name="senha" value="${usuario.senha}">
                            <p>Senha</p>
                            <i class="material-symbols-outlined">key</i>
                        </div>
                    </div>

                    <div class="inputContainerRow">
                        <div class="containerColumn">
                            <span>Status</span>
                            <div onclick="setupDropdown()" id="dropdownBtnContainer" class="dropdownContainer">
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

                        <div class="containerColumn">
                            <span>Perfil</span>
                            <div id="dropdownBtnServico" class="dropdownContainer">
                                <div class="dropdownBtnContainer">
                                    <div class="dropdownBtn" id="selectedOptionServico">Selecionar</div>
                                    <i class="material-symbols-outlined">keyboard_arrow_down</i>
                                </div>
                                <div id="dropservico" class="dropdownMenu hidden">
                                    <jsp:useBean class="model.PerfilDAO" id="perfil"/>                   
                                    <c:forEach var="p" items="${perfil.lista}">
                                        <label class="label"><input type="radio" checked required name="idperfil" value="${p.idperfil}">${p.nome}</label>
                                        </c:forEach>
                                </div>
                            </div>
                        </div>

                    </div>






                    <button type="submit"class="submit">Cadastrar Usuário</button>

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

                                });
        </script>
    </body>
</html>

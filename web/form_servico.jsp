<%-- 
    Document   : form_servico
    Created on : 02/04/2024, 08:29:35
    Author     : 349550
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./static/css/form.css">
        <link rel="stylesheet" href="./static/css/menu.css">

        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Quicksand:wght@300..700&display=swap" rel="stylesheet">

        <title>JSP Page</title>

    </head>
    <body>

        <div class="grid-container">
            <%@include file="sidebar.jsp" %>

            <div class="container-principal">
                <form method="POST"action="gerenciar_servico.do" value="">

                    <a class="botaoinicio"href="#">
                        <i class="material-symbols-outlined">arrow_back</i>Voltar ao início
                    </a>

                    <h1>Cadastrar serviço</h1>

                    <input type="hidden" name="idservico" value="${servico.idservico}"/>

                    <div class="inputContainer">
                        <input required type="text"name="nome" value="${servico.nome}">
                        <p>Nome:</p>
                        <i class="material-symbols-outlined">cut</i>
                    </div>


                    <script type="text/javascript" src="./static/js/sumirTextoTextarea.js"></script>
                    <div class="inputContainer">
                        <p class="textareatexto" id="ptextarea">Descrição</p>
                        <textarea id="area" onclick="sumirp()" type="text" name="descricao" value="${servico.descricao}"></textarea>
                    </div>


                    <div class="inputContainerRow">
                        <div class="containerColumn">
                            <span>Status</span>
                            <div style="width: 30%" onclick="setupDropdown()" id="dropdownBtnContainer" class="dropdownContainer">
                                <div class="dropdownBtnContainer">
                                    <div class="dropdownBtn" id="selectedOptionMostrar">Selecionar</div>
                                    <i class="material-symbols-outlined">keyboard_arrow_down</i>
                                </div>
                                <div id="dropstatus" class="dropdownMenu hidden">
                                    <label class="label"><input type="radio" name="status" value="1">Ativo</label>
                                    <label class="label"><input type="radio" name="status" value="0">Inativo</label>
                                </div>
                            </div>
                        </div>
                    </div>



                    <button type="submit"class="submit">Cadastrar Serviço</button>

                </form>

            </div>
        </div>

        <script src="./static/js/dropdownForms.js"></script>
        <script src="./static/js/mascaras.js"></script>
        <script src="./static/js/fillDate.js"></script>
    </body>
</html>

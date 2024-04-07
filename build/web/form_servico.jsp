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

                        <div class="inputContainer">
                            <input required type="number" name="valor" value="${servico.valor}">
                            <p>Valor:</p>
                            <i class="material-symbols-outlined">key</i>
                        </div>
        

                    <script type="text/javascript" src="./static/js/sumirTextoTextarea.js"></script>
                    <div class="inputContainer">
                        <p class="textareatexto" id="ptextarea">Descrição</p>
                        <textarea id="area" required onclick="sumirp()" type="text" name="descricao" value="${servico.descricao}"></textarea>
                    </div>

                 
                        <select name="status" class="select">
                            <option value="1">Ativo</option>
                            <option value="0">Inativo</option>
                        </select>
                 


                    <button type="submit"class="submit">Cadastrar Serviço</button>

                </form>

            </div>
        </div>


    </body>
</html>

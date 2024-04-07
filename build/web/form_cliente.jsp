@ -0,0 +1,81 @@
<%-- 
    Document   : form_cliente
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
                <form method="POST"action="gerenciar_cliente.do" value="">

                    <a class="botaoinicio"href="#">
                        <i class="material-symbols-outlined">arrow_back</i>Voltar ao início
                    </a>

                    <h1>Cadastrar Cliente</h1>

                    <input type="hidden" name="idcliente" value="${cliente.idcliente}"/>

                    <div class="inputContainer">
                        <input required type="text" name="nome" value="${cliente.nome}">
                        <p>Nome:</p>
                        <i class="material-symbols-outlined">person</i>
                    </div>

                    <div class="inputContainerRow">
                        <div class="inputContainer">
                            <input required type="number" name="cpf" value="${cliente.duracao}">
                            <p>CPF: </p>
                            <i class="material-symbols-outlined">description</i>
                        </div>


                        <div class="inputContainer">
                            <input required type="number" name="telefone" value="${cliente.valor}">
                            <p>Telefone: </p>
                            <i class="material-symbols-outlined">phone</i>
                        </div>
                    </div>

                    <div class="inputContainer">
                        <input required type="text" name="email" value="${cliente.nome}">
                        <p>Email: </p>
                        <i class="material-symbols-outlined">mail</i>
                    </div>








                    <button type="submit"class="submit">Cadastrar Serviço</button>

                </form>

            </div>
        </div>


    </body>
</html>
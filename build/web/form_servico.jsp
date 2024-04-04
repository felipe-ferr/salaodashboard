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
                 <form method="POST"action="gerenciar_servico.do"value="">

                <a class="botaoinicio"href="#"><i class="material-symbols-outlined">arrow_back</i>Voltar ao início</a>

                <h1>Cadastrar serviço</h1>
                
                <input type="hidden" name="idservico"/>
                
                <div class="inputContainer">
                    <input required type="text"name="nome"><p>Nome:</p><i class="material-symbols-outlined">location_on</i>
                </div>

                <div class="inputContainer">
                    <input required type="number"name="duracao"><p>Duração</p><i class="material-symbols-outlined">mail</i>
                </div>


                <div class="inputContainer">
                    <input required type="number"name="valor"><p>Valor:</p><i class="material-symbols-outlined">key</i>
                </div>
                
                <div class="inputContainer">
                    <input required type="text"name="descricao"><p>Descrição</p><i class="material-symbols-outlined">key</i>
                </div>
                
                 <div class="inputContainer">
                    <input required type="number"name="status"><p>Status</p><i class="material-symbols-outlined">key</i>
                </div>


                <button type="submit"class="submit">Cadastrar Serviço</button>

            </form>

             </div>
        </div>
           
    </body>
</html>
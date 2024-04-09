<%-- 
    Document   : form_usuario
    Created on : 02/04/2024, 08:29:35
    Author     : 349550
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                <form method="POST"action="gerenciar_usuario.do" value="">

                    <a class="botaoinicio"href="#">
                        <i class="material-symbols-outlined">arrow_back</i>Voltar ao início
                    </a>

                    <h1>Cadastrar Usuário</h1>

                    <input type="hidden" name="idusuario" value="${usuario.idusuario}"/>

                    <div class="inputContainer">
                        <input required type="text"name="nome" value="${usuario.nome}">
                        <p>Nome:</p>
                        <i class="material-symbols-outlined">cut</i>
                    </div>

                    <div class="inputContainer">
                        <input required type="text" name="cpf" value="${usuario.cpf}">
                        <p>CPF</p>
                        <i class="material-symbols-outlined">description</i>
                    </div>

                    <div class="inputContainer">
                        <input required type="text" name="telefone" value="${usuario.telefone}">
                        <p>Telefone</p>
                        <i class="material-symbols-outlined">phone</i>
                    </div>

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

                    <select name="status" class="select">
                        <option value="1">Ativo</option>
                        <option value="0">Inativo</option>
                    </select>

                    <select name="idperfil" class="select">
                        <option value="">Selecionar Perfil</option>
                        <jsp:useBean class="model.PerfilDAO" id="perfil"/>
                        <c:forEach var="p" items="${perfil.lista}">
                            <option value="${p.idperfil}">${p.nome}</option>
                            
                        </c:forEach>
                        
                    </select>






                    <button type="submit"class="submit">Cadastrar Usuário</button>

                </form>

            </div>
        </div>


    </body>
</html>

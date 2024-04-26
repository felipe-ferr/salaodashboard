<%-- 
    Document   : form_login
    Created on : 25/04/2024, 20:03:08
    Author     : suele
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
              <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./static/css/form.css">
        <link rel="stylesheet" href="./static/css/menu.css">

        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Quicksand:wght@300..700&display=swap" rel="stylesheet">
    </head>
    <body>
        <h1>Formulário de Login</h1>
        
        <form action="gerenciar_login.do" method="POST">
            <%--USUARIO--%>
            <div class="row">
                <div class="form-group col-sm-8"
                     <label for="login" class="control-label">Login</label>
                    <input type="text" name="login" id="login" value="" required="">
            </div>
                <%--SENHA--%>
            <div class="row">
                   <div class="form-group col-sm-8"
                      <label for="senha" class="control-label">Senha</label>
                      <input type="password" name="senha" id="senha" value="" required="">
            </div>
                   <%--BOTÃO ENVIAR--%>
            <div class="row">
                <button class="btn btn-success">Entrar</button>
            </div>
        </form>
    </body>
</html>

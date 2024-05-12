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
        <link rel="stylesheet" href="./static/css/login.css">
        <link rel="stylesheet" href="./static/css/menu.css">
        
        <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />

        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Quicksand:wght@300..700&display=swap" rel="stylesheet">
    </head>
    <body>
        <div class="flex-container">  

            <div class="form-container">
                <form class="form_login" action="gerenciar_login.do" method="POST">
                <h1>Entrar na sua conta</h1>
                <div class="inputContainer">
                    <input type="text" name="login" id="login" value="" required="">
                    <p>Usuário</p>
                    <i class="material-symbols-outlined">person</i>
                </div>
                <div class="inputContainer">
                    <input type="password" name="senha" id="senha" value="" required="">
                    <p>Senha</p>
                    <i class="material-symbols-outlined">key</i>
                </div>

                <div class="row">
                    <button class="btn">Entrar</button>
                </div>
            </form>
            </div>
            
            
            <div class="info">
                <img src="imagens/logo.png">
            </div>
            
            
            
            
            
            
        </div>
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    </body>
</html>

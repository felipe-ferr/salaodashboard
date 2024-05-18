<%-- 
    Document   : form_login
    Created on : 25/04/2024, 20:03:08
    Author     : suele
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <title>Salão do Luciano | Login</title>
        <script src="./static/js/modoescuro.js"></script>
        <link rel="stylesheet" href="./static/css/login.css">
        <link rel="stylesheet" href="./static/css/menu.css">
        
        <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />

        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Quicksand:wght@300..700&display=swap" rel="stylesheet">
    </head>
    <body>
        <div class="flex-container">  
            <%
                String mensagem = (String)request.getSession().getAttribute("mensagem");
                if(mensagem !=null){
                    request.getSession().removeAttribute("mensagem");
                
            %>
            <div class="alert">
                <%=mensagem%>
            </div>
            <%
                }
            %>
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

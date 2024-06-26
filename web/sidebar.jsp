<%-- 
    Document   : sjde
    Created on : 31/03/2024, 02:45:42
    Author     : felip
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="./static/css/menu.css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Quicksand:wght@300..700&display=swap" rel="stylesheet">

        <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />

    </head>
    <body>

        <div id="side" class="sidebar">
            <a href="index.jsp" class="sidebar-titulo"><img class="sidebar-img" src="imagens/logo.png">Salão do Luciano</a>
            <a href="listar_agendamento.jsp"><span class="material-symbols-outlined sidebar-icone">calendar_month</span>Agendamentos</a>
            <a href="listar_cliente.jsp"><span class="material-symbols-outlined sidebar-icone">person</span>Clientes</a>
            <a href="listar_servico.jsp"><span class="material-symbols-outlined sidebar-icone">cut</span>Serviços</a>
            <a href="listar_perfil.jsp"><span class="material-symbols-outlined sidebar-icone">account_circle</span>Perfis</a>
            <a href="listar_usuario.jsp"><span class="material-symbols-outlined sidebar-icone">engineering</span>Usuários</a>


            <div class="tema-container bottom">      
                <div class="switch-container">
                    <div><span class="material-symbols-outlined sidebar-icone">account_circle</span><c:if test="${ulogado!=null}">${ulogado.nome}</c:if></div> 
                    <a href="gerenciar_login.do" style="width: auto"><span class="material-symbols-outlined logout">logout</span></a>
                </div>
                <span class="switch-container">
                    <span class="material-symbols-outlined">light_mode</span>
                    <label class="switch">
                        <input type="checkbox" id="switch" onchange="toggleTheme()">
                        <span class="slider round"></span>
                    </label>
                    <span class="material-symbols-outlined">dark_mode</span>
                </span>
            </div>

        </div>

        <script type="text/javascript" src="static/js/modoescuro.js"></script>
        <script type="text/javascript" src="static/js/showBotaoSair.js"></script>
    </body>
</html>

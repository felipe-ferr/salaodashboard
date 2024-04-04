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
                <span class="sidebar-titulo">Salão do Luciano</span>
                <a href="#"><span class="material-symbols-outlined sidebar-icone">calendar_month</span>Agendamentos</a>
                <a href="#"><span class="material-symbols-outlined sidebar-icone">person</span>Clientes</a>
                <a href="listar_servico.jsp"><span class="material-symbols-outlined sidebar-icone">cut</span>Serviços</a>
                
                <div class="tema-container bottom">
                    <span>Modo Escuro</span>
                    <div class="tema-btn-container">
                        <button onclick="escuro()" id="botaodark" class="btn-esquerda"><span class="material-symbols-outlined">dark_mode</span></button>
                        <button onclick="light()" id="botaolight" class="btn-active-direita btn-direita"><span class="material-symbols-outlined">light_mode</span></button>
                    </div>
                </div>
            </div>
   
        <script type="text/javascript" src="static/js/modoescuro.js"></script>
    </body>
</html>

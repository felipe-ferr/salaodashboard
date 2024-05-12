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
                <a href="listar_agendamento.jsp"><span class="material-symbols-outlined sidebar-icone">calendar_month</span>Agendamentos</a>
                <a href="listar_cliente.jsp"><span class="material-symbols-outlined sidebar-icone">person</span>Clientes</a>
                <a href="listar_servico.jsp"><span class="material-symbols-outlined sidebar-icone">cut</span>Serviços</a>
                <a href="listar_perfil.jsp"><span class="material-symbols-outlined sidebar-icone">account_circle</span>Perfis</a>
                <a href="listar_usuario.jsp"><span class="material-symbols-outlined sidebar-icone">engineering</span>Usuários</a>
                
                
                <div class="tema-container bottom">
                    <div><span class="material-symbols-outlined sidebar-icone">account_circle</span><c:if test="${ulogado!=null}">${ulogado.nome}</c:if></div> 
                    <a href="gerenciar_login.do" class="sair"><span class="material-symbols-outlined sidebar-icone">logout</span>Sair</a>
                </div>
            </div>
   
        <script type="text/javascript" src="static/js/modoescuro.js"></script>
    </body>
</html>

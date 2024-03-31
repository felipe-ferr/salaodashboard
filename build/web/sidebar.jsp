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
                <a href="#"><span class="material-symbols-outlined sidebar-icone">calendar_month</span>Servicos</a>
                <a href="#"><span class="material-symbols-outlined sidebar-icone">person</span>Clientes</a>
                <a href="#"><span class="material-symbols-outlined sidebar-icone">cut</span>Serviços</a>
                
                <a onclick="escuro()" href="#" class="bottom" ><span class="material-symbols-outlined sidebar-icone">dark_mode</span>
                <span class="material-symbols-outlined sidebar-icone">light_mode</span>
                </a>
            </div>
   
    </body>
</html>

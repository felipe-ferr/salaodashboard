<%-- 
    Document   : listar_agendamento
    Created on : 23/03/2024, 19:53:32
    Author     : felip
--%>

<%@page import="controller.GerenciarLogin"%>
<%@page import="model.Usuario"%>
<%@page import="model.ClienteDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
    Usuario ulogado = GerenciarLogin.verificarAcesso(request, response);
    request.setAttribute("ulogado", ulogado);
%>

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
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
        <link rel="stylesheet" href="./static/css/menu.css">
        <link rel="stylesheet" href="./static/css/index.css">

        <link rel="icon" type="image/x-icon" href="static/favicon/favicon.ico">

        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatis.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Quicksand:wght@300..700&display=swap" rel="stylesheet">

        <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />

        <script type="text/javascript"> // adicionei aqui por conta do método de exclusão 
            function confirmarExclusão(id, nome) {
                if (confirm('Deseja desativar o agendamento ' + nome + '?')) {
                    location.href = 'gerenciar_agendamento.do?acao=deletar&idagendamento=' + id;
                }
            }
        </script>


        <script src="./static/js/filtroTabelaIndex.js"></script>



        <title>Salão do Luciano | Início</title>
    </head>



    <body>



        <div class="grid-container">
            <%@include file="sidebar.jsp" %>


            <div id="principal" class="container-principal">

                <div class="row-container">
                    <div class="card">
                        <div class="card-icon"> 
                            <i class="material-symbols-outlined">person</i>
                        </div>
                        <div class="card-text">
                            Clientes
                            <span id="qtdClientes"></span>
                        </div>
                    </div>

                    <div class="card">
                        <div class="card-icon"> 
                            <i class="material-symbols-outlined">calendar_month</i>
                        </div>
                        <div class="card-text">
                            Agendamentos Hoje
                            <span id="agendamentosHojeQtd"></span>
                        </div>
                    </div>

                    <div class="card">
                        <div class="card-icon"> 
                            <i class="material-symbols-outlined">attach_money</i>
                        </div>
                        <div class="card-text">
                            Receita Total
                            <span id="valorQtd"></span>
                        </div>
                    </div>
                </div> 

                <div style="margin-top: 5vh" class="row-container">
                    <div id="consulta" class="consulta-container">
                        <div style="justify-content: center" class="row-container">
                            <span>Próximos Agendamentos:</span>
                        </div>
                        <div class="row-container">
                            <div id="nav" class="thead">
                                <div>Data</div>          
                                <div>Horário</div>
                                <div>Cliente</div>
                            </div>
                        </div>
                        <div id="table" class="tabela-container">
                            <jsp:useBean class="model.AgendamentoDAO" id="a"/>

                            <c:forEach var="a" items="${a.listaIndex}">

                                <div id="item" class="tabela" style="font-size: 0.9vw">
                                    <div class="data"><fmt:formatDate pattern="dd/MM/yyyy" value="${a.data}"/></div>                           
                                    <div class="horario">${a.horario}</div>
                                    <div class="nome-row">${a.cliente.nome}</div>
                                </div>

                            </c:forEach>
                        </div>
                    </div>

                    <div id="consulta" class="consulta-container">
                        <div style="justify-content: center" class="row-container">
                            <span>Serviços Concluídos:</span>
                        </div>
                        <div class="row-container">
                            <div id="nav" class="thead">
                                <div>Data</div>          
                                <div>Horário</div>
                                <div>Cliente</div>
                            </div>
                        </div>
                        <div id="table" class="tabela-container">
                            <jsp:useBean class="model.AgendamentoDAO" id="a2"/>

                            <c:forEach var="a2" items="${a2.listaIndexConcluidos}">

                                <div id="item" class="tabela" style="font-size: 0.9vw">
                                    <div class="dataconcluido"><fmt:formatDate pattern="dd/MM/yyyy" value="${a2.data}"/></div>                           
                                    <div class="horario">${a2.horario}</div>
                                    <div class="nome-row">${a2.cliente.nome}</div>
                                </div>

                            </c:forEach>
                        </div>

                    </div>
                </div>





                <div id="clientes" style="display: none;">
                    <jsp:useBean class="model.ClienteDAO" id="c"/>
                    <c:forEach var="c" items="${c.lista}">
                        <div id="item" class="tabela td">
                            <div class="id-row">${c.idcliente}</div>
                        </div>
                    </c:forEach>
                </div>

                <div id="valor" style="display: none">
                    <jsp:useBean class="model.AgendamentoDAO" id="a3"/>
                    <c:forEach var="a3" items="${a3.listaIndex}">
                        <div id="item" class="tabela" style="font-size: 0.9vw">                        
                            <div class="valor-row">${a3.valor}</div>
                        </div>
                    </c:forEach>
                </div>



            </div>

        </div>


        <script src="./static/js/filtroTabelaIndex.js"></script>






    </body>

</html>



<%-- 
    Document   : form_agendamento
    Created on : 02/04/2024, 08:29:35
    Author     : 349550
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
                <form method="POST"action="gerenciar_agendamento.do" value="">

                    <a class="botaoinicio"href="#">
                        <i class="material-symbols-outlined">arrow_back</i>Voltar ao início
                    </a>

                    <h1>Cadastrar Agendamento</h1>

                    <input type="hidden" name="idagendamento" value="${agendamento.idagendamento}"/>

                        
                    <div class="inputContainer">
                        <input required type="text"name="data" value="<fmt:formatDate pattern="dd/MM/yyyy" value="${agendamento.data}"/>">
                        <p>Data:</p>
                        <i class="material-symbols-outlined">cut</i>
                    </div>

                    <div class="inputContainer">
                        <input required type="text" name="descricao" value="${agendamento.descricao}">
                        <p>Descrição:</p>
                        <i class="material-symbols-outlined">account_circle</i>
                    </div>
                    <div class="inputContainer">
                        <input required type="text" name="data_cadastro" value="<fmt:formatDate pattern="dd/MM/yyyy" value="${agendamento.data_cadastro}"/>">
                        <p>Data de Agendamento</p>
                        <i class="material-symbols-outlined">key</i>
                    </div>
                    <div class="inputContainer">
                        <input required type="text" name="horario" value="${agendamento.horario}">
                        <p>Horário</p>
                        <i class="material-symbols-outlined">key</i>
                    </div>





                    

                    <select name="status" class="select">
                        <option value="1">Ativo</option>
                        <option value="0">Inativo</option>
                    </select>


                    <select name="idservico" class="select">
                        <option value="">Selecionar Serviço</option>
                        <jsp:useBean class="model.ServicoDAO" id="servico"/>
                        <c:forEach var="s" items="${servico.lista}">
                            <option value="${s.idservico}">${s.nome}</option>

                        </c:forEach>

                    </select>

                    <select name="idcliente" class="select">
                        <option value="">Selecionar Cliente</option>
                        <jsp:useBean class="model.ClienteDAO" id="cliente"/>
                        <c:forEach var="c" items="${cliente.lista}">
                            <option value="${c.idcliente}">${c.nome}</option>

                        </c:forEach>

                    </select>

                    <select name="idusuario" class="select">
                        <option value="">Selecionar Usuário</option>
                        <jsp:useBean class="model.UsuarioDAO" id="usuario"/>
                        <c:forEach var="u" items="${usuario.lista}">
                            <option value="${u.idusuario}">${u.nome}</option>

                        </c:forEach>

                    </select>






                    <button type="submit"class="submit">Cadastrar Agendamento</button>

                </form>

            </div>
        </div>


    </body>
</html>

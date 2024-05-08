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

        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.mask/1.14.15/jquery.mask.js"></script>

        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Quicksand:wght@300..700&display=swap" rel="stylesheet">


        <title>JSP Page</title>

        <script src="./static/js/mascaras.js"></script>


    </head>
    <body>

        <div class="grid-container">
            <%@include file="sidebar.jsp" %>

            <div class="container-principal">
                <form method="POST" action="gerenciar_agendamento.do" value="">

                    <a class="botaoinicio"href="#">
                        <i class="material-symbols-outlined">arrow_back</i>Voltar ao início
                    </a>

                    <h1>Cadastrar Agendamento</h1>

                    <hr>

                    <input type="hidden" name="idagendamento" value="${agendamento.idagendamento}"/>

                    <div class="inputContainerRow">
                        <div class="inputContainer">
                            <input id="money" oninput="maskMoneyValue()" required type="number" name="valor" value="${agendamento.valor}">
                            <p>Valor:</p>
                            <i class="material-symbols-outlined">payments</i>
                        </div>

                        <div class="inputContainer">                      
                            <input id="dateInput" required type="text" name="data" value="<fmt:formatDate pattern="dd/MM/yyyy" value="${agendamento.data}"/>">
                            <p>Data:</p>
                            <span class="erroMensagem">A data não pode ser menor que hoje!</span>
                            <i class="material-symbols-outlined">calendar_month</i>
                        </div>

                    </div>

                    <script type="text/javascript" src="./static/js/sumirTextoTextarea.js"></script>
                    <div style="margin-top: 5vh" class="inputContainer">
                        <p class="textareatexto" id="ptextarea">Descrição:</p>
                        <textarea id="area" onclick="sumirp()" type="text" name="descricao" value="${agendamento.descricao}"></textarea>
                    </div>

                    <div class="inputContainerRow">
                        <div class="preencherHoje">
                            <label for="fillDateCheckbox">Preencher a data de hoje:</label>
                            <input onclick="fillDate()" id="fillDateCheckbox" type="checkbox">
                        </div>
                        <div class="inputContainer">
                            <input  id="date" required type="text" name="data_cadastro" value="<fmt:formatDate pattern="dd/MM/yyyy" value="${agendamento.data_cadastro}"/>">
                            <p style="font-size:0.7vw">Data de Cadastro:</p>
                            <i class="material-symbols-outlined">calendar_month</i>
                        </div>    
                    </div>




                    <hr>


                    <div class="inputContainerRow">

                        <div class="containerColumn">
                            <span>Status</span>
                            <div onclick="setupDropdown()" id="dropdownBtnContainer" class="dropdownContainer">
                                <div class="dropdownBtnContainer">
                                    <div class="dropdownBtn" id="selectedOptionMostrar">Selecionar</div>
                                    <i class="material-symbols-outlined">keyboard_arrow_down</i>
                                </div>
                                <div id="dropstatus" class="dropdownMenu hidden">
                                    <label class="label"><input type="radio" name="status" value="1">Ativo</label>
                                    <label class="label"><input type="radio" name="status" value="0">Inativo</label>
                                </div>
                            </div>
                        </div>

                        <div class="containerColumn">
                            <span>Serviço</span>
                            <div id="dropdownBtnServico" class="dropdownContainer">
                                <div class="dropdownBtnContainer">
                                    <div class="dropdownBtn" id="selectedOptionServico">Selecionar</div>
                                    <i class="material-symbols-outlined">keyboard_arrow_down</i>
                                </div>
                                <div id="dropservico" class="dropdownMenu hidden">
                                    <jsp:useBean class="model.ServicoDAO" id="servico"/>                   
                                    <c:forEach var="s" items="${servico.lista}">
                                        <label class="label"><input type="radio" name="idservico" value="${s.idservico}">${s.nome}</label>
                                        </c:forEach>
                                </div>
                            </div>
                        </div>

                        <div class="containerColumn">
                            <span>Cliente</span>
                            <div id="dropdownBtnCliente" class="dropdownContainer">
                                <div class="dropdownBtnContainer">
                                    <div class="dropdownBtn" id="selectedOptionCliente">Selecionar</div>
                                    <i class="material-symbols-outlined">keyboard_arrow_down</i>
                                </div>
                                <div id="dropcliente" class="dropdownMenu hidden">
                                    <jsp:useBean class="model.ClienteDAO" id="cliente"/>
                                    <c:forEach var="c" items="${cliente.lista}">
                                        <label class="label"><input type="radio" name="idcliente" value="${c.idcliente}">${c.nome}</label>
                                        </c:forEach>
                                </div>
                            </div>
                        </div>

                        <div class="containerColumn">
                            <span>Usuário</span>
                            <div id="dropdownBtnUsuario" class="dropdownContainer">
                                <div class="dropdownBtnContainer">
                                    <div class="dropdownBtn" id="selectedOptionUsuario">Selecionar</div>
                                    <i class="material-symbols-outlined">keyboard_arrow_down</i>
                                </div>
                                <div id="dropusuario" class="dropdownMenu hidden">
                                    <jsp:useBean class="model.UsuarioDAO" id="usuario"/>
                                    <c:forEach var="u" items="${usuario.lista}">
                                        <label class="label"><input type="radio" name="idusuario" value="${u.idusuario}">${u.nome}</label>
                                        </c:forEach>
                                </div>

                            </div>
                        </div>

                    </div>

                    <span>Horário</span>
                    <div class="horarios-container">
                        <label id="inputElement" id="inputElement" class="horario">
                            <input  type="radio" name="horario" value="9:00" />
                            <p>9h00</p>
                            <i class="material-symbols-outlined">schedule</i>
                        </label>
                        <label id="inputElement" class="horario">
                            <input type="radio" name="horario" value="10:00" />
                            <p>10:00</p>
                            <i class="material-symbols-outlined">schedule</i>
                        </label>
                        <label id="inputElement" class="horario">
                            <input type="radio" name="horario" value="11:00" />
                            <p>11:00</p>
                            <i class="material-symbols-outlined">schedule</i>
                        </label>
                        <label id="inputElement" class="horario">
                            <input type="radio" name="horario" value="13:00" />
                            <p>13:00</p>
                            <i class="material-symbols-outlined">schedule</i>
                        </label>
                        <label id="inputElement" class="horario">
                            <input type="radio" name="horario" value="14:00" />
                            <p>14:00</p>
                            <i class="material-symbols-outlined">schedule</i>
                        </label>
                        <label id="inputElement" class="horario">
                            <input type="radio" name="horario" value="15:00" />
                            <p>15:00</p>
                            <i class="material-symbols-outlined">schedule</i>
                        </label>
                        <label id="inputElement" class="horario">
                            <input type="radio" name="horario" value="16:00" />
                            <p>16:00</p>
                            <i class="material-symbols-outlined">schedule</i>
                        </label>
                        <label id="inputElement" class="horario">
                            <input type="radio" name="horario" value="17:00" />
                            <p>17:00</p>
                            <i class="material-symbols-outlined">schedule</i>
                        </label>
                        <label id="inputElement" class="horario">
                            <input type="radio" name="horario" value="18:00" />
                            <p>18:00</p>
                            <i class="material-symbols-outlined">schedule</i>
                        </label>
                        <label id="inputElement" class="horario">
                            <input type="radio" name="horario" value="19:00" />
                            <p>19:00</p>
                            <i class="material-symbols-outlined">schedule</i>
                        </label>

                    </div>

                    



                    <button type="submit"class="submit">Cadastrar Agendamento</button>

                </form>

            </div>
        </div>


        <script src="./static/js/dropdownForms.js"></script>
        <script src="./static/js/mascaras.js"></script>
        <script src="./static/js/fillDate.js"></script>
        <script>
                                $(document).ready(function () {
                                    $('#date').mask('00/00/0000');
                                    $('.time').mask('00:00:00');
                                    $('.cep').mask('00000-000');
                                    $('.phone').mask('(00) 00000-0000');
                                    $('.cpf').mask('000.000.000-00');

                                });
        </script>
        
    </body>
</html>
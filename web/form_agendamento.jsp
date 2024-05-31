<%-- 
    Document   : form_agendamento
    Created on : 02/04/2024, 08:29:35
    Author     : 349550
--%>

<%@page import="controller.GerenciarLogin"%>
<%@page import="model.Usuario"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <meta http-equiv="content-type" content="text/html; charset=UTF-8">
        <meta http-equiv="content-type" content="text/html; charset=iso-8859-1">
        <link rel="stylesheet" href="./static/css/form.css">

        <link rel="icon" type="image/x-icon" href="static/favicon/favicon.ico">

        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.mask/1.14.15/jquery.mask.js"></script>

        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Quicksand:wght@300..700&display=swap" rel="stylesheet">


        <title>Adicionar Agendamento</title>

        <script src="./static/js/mascaras.js"></script>


    </head>
    <body>
        <div id="formCliente" class="form-cliente slide-in-right">
            <form id="form-cliente" style="height: 100vh; width: 100%;" method="POST"action="gerenciar_cliente.do" value="" accept-charset="ISO-8859-1" >

                <div class="row-container">
                    <h1>Cadastrar Cliente</h1>
                    <span class="botaoinicio" href="index.jsp">
                        <i onclick="fecharFormCliente()" style="cursor: pointer" class="material-symbols-outlined">close</i>
                    </span>
                </div>

                <input type="hidden" name="idcliente" value="${cliente.idcliente}"/>

                <div class="inputContainerRow">
                    <div class="inputContainer">
                        <input required type="text" name="nome" value="${cliente.nome}">
                        <p>Nome:</p>
                        <i class="material-symbols-outlined">person</i>
                    </div>

                    <div class="inputContainer">
                        <input required type="text" name="email" value="${cliente.email}">
                        <p>Email: </p>
                        <i class="material-symbols-outlined">mail</i>
                    </div>
                </div>

                <div class="inputContainerRow">
                    <div class="inputContainer">
                        <input class="cpf" required type="text" name="cpf" value="${cliente.cpf}">
                        <p>CPF: </p>
                        <i class="material-symbols-outlined">description</i>

                    </div>


                    <div class="inputContainer">
                        <input class="phone" required type="text" name="telefone" value="${cliente.telefone}">
                        <p>Telefone: </p>
                        <i class="material-symbols-outlined">phone</i>
                    </div>
                </div>

                <div class="inputContainerRow" style="justify-content: flex-start">
                    <span class="erroMensagem"></span>
                </div>

                <div class="inputContainerRow">
                    <div class="containerColumn">
                        <span>Status</span>
                        <div style="width: 30%" onclick="setupDropdown()" id="dropdownBtnContainer" class="dropdownContainer">
                            <div class="dropdownBtnContainer">
                                <div class="dropdownBtn" id="selectedOptionMostrar">Ativo</div>
                                <i class="material-symbols-outlined">keyboard_arrow_down</i>
                            </div>
                            <div id="dropstatus" class="dropdownMenu hidden">
                                <label class="label"><input type="radio" checked name="status" value="1">Ativo</label>
                                <label class="label"><input type="radio" name="status" value="0">Inativo</label>
                            </div>
                        </div>
                    </div>
                </div>


                <div style="justify-content: center; gap: 1vw" class="row-container">
                    <button onclick="fecharFormCliente(); enviarFormulario(); recarregarLista()" id="submit-btn" type="submit"class="submit">Cadastrar cliente</button>
                    <button onclick="fecharFormCliente()" type="button"class="submit">Cancelar</button>
                </div>

            </form>
        </div>

        <div style="display: none" id="consulta" class="consulta-container scale-in-center">
            <div style="justify-content: space-between" class="row-container">
                <span>Datas Reservadas:</span>
                <i onclick="fecharConsulta()" style="cursor: pointer" class="material-symbols-outlined">close</i>
            </div>
            <div class="row-container">
                <div id="nav" class="thead">
                    <div>Data</div>          
                    <div>Horário</div>
                    <div>Cliente</div>
                    <div>Funcionário</div>
                </div>
            </div>
            <div id="table" class="tabela-container">
                <jsp:useBean class="model.AgendamentoDAO" id="a"/>

                <c:forEach var="a" items="${a.lista}">

                    <div id="item" class="tabela" style="font-size: 0.9vw">
                        <div class="data"><fmt:formatDate pattern="dd/MM/yyyy" value="${a.data}"/></div>                           
                        <div class="horario">${a.horario}</div>
                        <div class="nome-row">${a.cliente.nome}</div>
                        <div class="nome-row">${a.usuario.nome}</div>
                    </div>

                </c:forEach>
            </div>
        </div>

        <div style="display: none" id="escolher-usuario" class="consulta-container scale-in-center">
            <div style="justify-content: space-between" class="row-container">
                <span>Escolher Funcionário:</span>
                <i onclick="fecharUsuario()" style="cursor: pointer" class="material-symbols-outlined">close</i>
            </div>
            <div class="row-container">
                <div id="nav" class="thead">
                    <div>Nome</div>          
                </div>
            </div>
            <div id="table" class="tabela-container">
                <jsp:useBean class="model.UsuarioDAO" id="u"/>

                <c:forEach var="u" items="${u.lista}">

                    <div id="item" class="tabela" style="font-size: 0.9vw">
                        <label class="labelEscolher" onclick="fecharUsuario()"><input form="form" type="radio" name="idusuario" value="${u.idusuario}">${u.nome}</label>
                    </div>

                </c:forEach>
            </div>
        </div>

        <div style="display: none" id="escolher-cliente" class="consulta-container scale-in-center">
            <div style="justify-content: space-between" class="row-container">
                <div class="searchContainer">
                    <input type="text" id="searchInput" placeholder="Pesquisar">
                    <i class="material-symbols-outlined">search</i>
                </div>
                <span onclick="abrirFormCliente()" class="botaoConsulta"><i class="material-symbols-outlined">add</i>Adicionar Cliente</span>
                <i onclick="fecharCliente()" style="cursor: pointer" class="material-symbols-outlined">close</i>
            </div>
            <div class="row-container">
                <div id="nav" class="thead">
                    <div>Escolher Cliente</div>          
                </div>
            </div>
            <div id="table" class="tabela-container">
                <jsp:useBean class="model.ClienteDAO" id="c"/>

                <c:forEach var="c" items="${c.lista}">

                    <div id="item" class="tabela" style="font-size: 0.9vw">
                        <label class="labelEscolher" onclick="fecharCliente()"><input form="form" type="radio" name="idcliente" value="${c.idcliente}">${c.nome}</label>
                    </div>

                </c:forEach>
            </div>
        </div>

        <div style="display: none" id="escolher-servico" class="consulta-container scale-in-center">
            <div style="justify-content: space-between" class="row-container">
                <div class="searchContainer">
                    <input type="text" id="searchInputServico" placeholder="Pesquisar">
                    <i class="material-symbols-outlined">search</i>
                </div>
                <i onclick="fecharServico()" style="cursor: pointer" class="material-symbols-outlined">close</i>
            </div>
            <div class="row-container">
                <div id="nav" class="thead">
                    <div>Escolher Serviço</div>          
                </div>
            </div>
            <div id="table" class="tabela-container">
                <jsp:useBean class="model.ServicoDAO" id="s"/>

                <c:forEach var="s" items="${s.lista}">

                    <div id="item" class="tabela" style="font-size: 0.9vw">
                        <label class="labelEscolher" onclick="fecharServico()"><input form="form" type="radio" name="idservico" value="${s.idservico}">${s.nome}</label>
                    </div>

                </c:forEach>
            </div>
        </div>



        <div id="containergeral" class="grid-container">
            <%@include file="sidebar.jsp" %>

            <div class="container-principal">
                <form id="form" method="POST" action="gerenciar_agendamento.do" value="" accept-charset="ISO-8859-1" >

                    <a class="botaoinicio" href="index.jsp">
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

                            <i class="material-symbols-outlined">calendar_month</i>
                        </div>

                    </div>

                    <div class="inputContainerRow" style="justify-content: flex-end">
                        <span class="erroMensagem"></span>
                        <div onclick="abrirConsulta()" class="botaoConsulta">Mostrar Datas Reservadas</div>
                    </div>



                    <span style="display: flex" id="titlehorario">Horário</span>
                    <div class="horarios-container fade-in" id="semana" style="display: flex">
                        <label id="inputElement" id="inputElement" class="horario">
                            <input  id="hora" type="radio" name="horario" value="9:00" />
                            <p>9:00</p>
                            <i class="material-symbols-outlined">schedule</i>
                        </label>
                        <label id="inputElement" class="horario">
                            <input  id="hora"  type="radio" name="horario" value="10:00" />
                            <p>10:00</p>
                            <i class="material-symbols-outlined">schedule</i>
                        </label>
                        <label id="inputElement" class="horario">
                            <input  id="hora"  type="radio" name="horario" value="11:00" />
                            <p>11:00</p>
                            <i class="material-symbols-outlined">schedule</i>
                        </label>
                        <label id="inputElement" class="horario">
                            <input  id="hora"  type="radio" name="horario" value="13:00" />
                            <p>13:00</p>
                            <i class="material-symbols-outlined">schedule</i>
                        </label>
                        <label id="inputElement" class="horario">
                            <input  id="hora"  type="radio" name="horario" value="14:00" />
                            <p>14:00</p>
                            <i class="material-symbols-outlined">schedule</i>
                        </label>
                        <label id="inputElement" class="horario">
                            <input  id="hora"  type="radio" name="horario" value="15:00" />
                            <p>15:00</p>
                            <i class="material-symbols-outlined">schedule</i>
                        </label>
                        <label id="inputElement" class="horario">
                            <input  id="hora"  type="radio" name="horario" value="16:00" />
                            <p>16:00</p>
                            <i class="material-symbols-outlined">schedule</i>
                        </label>
                        <label id="inputElement" class="horario">
                            <input  id="hora"  type="radio" name="horario" value="17:00" />
                            <p>17:00</p>
                            <i class="material-symbols-outlined">schedule</i>
                        </label>
                        <label id="inputElement" class="horario">
                            <input  id="hora"  type="radio" name="horario" value="18:00" />
                            <p>18:00</p>
                            <i class="material-symbols-outlined">schedule</i>
                        </label>
                        <label id="inputElement" class="horario">
                            <input  id="hora"  type="radio" name="horario" value="19:00" />
                            <p>19:00</p>
                            <i class="material-symbols-outlined">schedule</i>
                        </label>

                    </div>

                    <div class="horarios-container fade-in" id="domingo" style="display:none">
                        <label id="inputElement" id="inputElement" class="horario">
                            <input  id="hora" type="radio" name="horario" value="9:00" />
                            <p>9:00</p>
                            <i class="material-symbols-outlined">schedule</i>
                        </label>
                        <label id="inputElement" class="horario">
                            <input  id="hora" type="radio" name="horario" value="10:00" />
                            <p>10:00</p>
                            <i class="material-symbols-outlined">schedule</i>
                        </label>
                        <label id="inputElement" class="horario">
                            <input  id="hora" type="radio" name="horario" value="11:00" />
                            <p>11:00</p>
                            <i class="material-symbols-outlined">schedule</i>
                        </label>                    

                    </div>


                    <div class="inputContainerRow">  
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
                            <div id="dropdownBtnContainer" class="dropdownContainer">
                                <div class="dropdownBtnContainer">
                                    <div class="dropdownBtn" id="selectedOptionMostrar">Ativo</div>
                                    <i class="material-symbols-outlined">keyboard_arrow_down</i>
                                </div>
                                <div id="dropstatus" class="dropdownMenu hidden">
                                    <label class="label"><input type="radio" checked name="status" value="1">Ativo</label>
                                    <label class="label"><input type="radio" name="status" value="0">Inativo</label>
                                </div>
                            </div>
                        </div>



                        <div class="containerColumn">
                            <span>Serviço</span>
                            <div onclick="abrirServico()" class="dropdownContainer">
                                <div class="dropdownBtnContainer">
                                    <div class="dropdownBtn" id="selectedOptionServico">Selecionar</div>
                                    <i class="material-symbols-outlined">add</i>
                                </div>
                            </div>
                        </div>

                        <div class="containerColumn">
                            <span>Cliente</span>
                            <div onclick="abrirCliente()" class="dropdownContainer">
                                <div class="dropdownBtnContainer">
                                    <div class="dropdownBtn" id="selectedOptionCliente">Selecionar</div>
                                    <i class="material-symbols-outlined">add</i>
                                </div>
                            </div>
                        </div>

                        <div class="containerColumn">
                            <span>Usuário</span>
                            <div onclick="abrirUsuario()" class="dropdownContainer">
                                <div class="dropdownBtnContainer">
                                    <div class="dropdownBtn" id="selectedOptionUsuario">Selecionar</div>
                                    <i class="material-symbols-outlined">add</i>
                                </div>


                            </div>
                        </div>

                    </div>




                    <script type="text/javascript" src="./static/js/sumirTextoTextarea.js"></script>
                    <div style="margin-top: 5vh" class="inputContainer">
                        <p class="textareatexto" id="ptextarea">Descrição:</p>
                        <textarea id="area" onclick="sumirp()" type="text" name="descricao" value="${agendamento.descricao}"></textarea>
                    </div>


                    <button type="submit"class="submit">Cadastrar Agendamento</button>

                </form>

            </div>
        </div>



        <script src="./static/js/dropdownForms.js"></script>
        <script src="./static/js/modoescuro.js"></script>
        <script src="./static/js/mascaras.js"></script>
        <script src="./static/js/fillDate.js"></script>
        <script src="./static/js/mostrarDiv.js"></script>
        <script src="./static/js/dropdownPopup.js"></script>
        <script src="./static/js/searchPopup.js"></script>
        <script>
                                $(document).ready(function () {
                                    $('#date').mask('00/00/0000');
                                    $('.time').mask('00:00:00');
                                    $('.cep').mask('00000-000');
                                    $('.phone').mask('(00) 00000-0000');
                                    $('.cpf').mask('000.000.000-00');

                                });
        </script>
        <script>
            $(document).ready(function () {
                $('#form-cliente').submit(function (event) {
                    // Evita o envio padrão do formulário
                    event.preventDefault();

                    // Serializa os dados do formulário
                    var formData = $(this).serialize();

                    // Envia os dados via AJAX
                    $.ajax({
                        type: 'POST',
                        url: $(this).attr('action'),
                        data: formData,
                        dataType: 'text',
                        success: function (response) {
                            // Aqui você pode tratar a resposta do servidor, se necessário
                            console.log(response);
                            // Exibe mensagem de sucesso
                            alert("Cliente cadastrado com sucesso");
                            // Recarrega a página após 0,5 segundos
                            setTimeout(function () {
                                window.location.reload();
                            }, 500);
                        },
                        error: function (xhr, status, error) {
                            // Exibe mensagem de erro
                            alert("Falha ao gravar informações no banco de dados. Tente novamente");
                        }
                    });
                });
            });
        </script>


     

    </body>
</html>
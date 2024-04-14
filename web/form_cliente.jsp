

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

        <script type="text/javascript" src="static/js/mascaras.js"></script>
        <title>JSP Page</title>

        <script>
            function mTel(tel) {
                tel = tel.replace(/\D/g, "");
                tel = tel.replace(/^(\d)/, "($1");
                tel = tel.replace(/(.{3})(\d)/, "$1)$2")
                if (tel.length == 9) {
                    tel = tel.replace(/(.{1})$/, "-$1")
                } else if (tel.length == 10) {
                    tel = tel.replace(/(.{2})$/, "-$1")
                } else if (tel.length == 11) {
                    tel = tel.replace(/(.{3})$/, "-$1")
                } else if (tel.length == 12) {
                    tel = tel.replace(/(.{4})$/, "-$1")
                } else if (tel.length > 12) {
                    tel = tel.replace(/(.{4})$/, "-$1")
                }
                return tel;
            }
        </script>

    </head>
    <body>

        <div class="grid-container">
            <%@include file="sidebar.jsp"%>

            <div class="container-principal">
                <form method="POST"action="gerenciar_cliente.do" value="">

                    <a class="botaoinicio"href="#">
                        <i class="material-symbols-outlined">arrow_back</i>Voltar ao início
                    </a>

                    <h1>Cadastrar Cliente</h1>

                    <input type="hidden" name="idcliente" value="${cliente.idcliente}"/>

                    <div class="inputContainer">
                        <input required type="text" name="nome" value="${cliente.nome}">
                        <p>Nome:</p>
                        <i class="material-symbols-outlined">person</i>
                    </div>

                    <div class="inputContainerRow">
                        <div class="inputContainer">
                            <input required oninput="mascara(this)" type="text" name="cpf" value="${cliente.cpf}">
                            <p>CPF: </p>
                            <i class="material-symbols-outlined">description</i>
                        </div>


                        <div class="inputContainer">
                            <input required type="text" name="telefone" value="${cliente.telefone}">
                            <p>Telefone: </p>
                            <i class="material-symbols-outlined">phone</i>
                        </div>
                    </div>

                    <div class="inputContainer">
                        <input required type="text" name="email" value="${cliente.email}">
                        <p>Email: </p>
                        <i class="material-symbols-outlined">mail</i>
                    </div>

                    <select name="status" class="select">
                        <option value="1">Ativo</option>
                        <option value="0">Inativo</option>
                    </select>


                    <button type="submit"class="submit">Cadastrar cliente</button>

                </form>

            </div>
        </div>


    </body>
</html>
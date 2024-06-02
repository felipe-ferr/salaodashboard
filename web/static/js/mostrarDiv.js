function abrirConsulta() {
    let c = document.getElementById("consulta");
    let gridcontainer = document.getElementById("containergeral");
    c.style.display = "flex";
    gridcontainer.style.filter = "brightness(50%)";
}


function fecharConsulta() {
    let c = document.getElementById("consulta");
    let gridcontainer = document.getElementById("containergeral");
    c.style.display = "none";
    gridcontainer.style.filter = "brightness(100%)";
}

function abrirAtivarDesativar() {
    let c = document.getElementById("ativardesativar");
    let gridcontainer = document.getElementById("containergeral");
    c.style.display = "flex";
    gridcontainer.style.filter = "brightness(50%)";
}

function abrirUsuario() {
    let c = document.getElementById("escolher-usuario");
    let gridcontainer = document.getElementById("containergeral");
    c.style.display = "flex";
    gridcontainer.style.filter = "brightness(50%)";
}
function fecharUsuario() {
    let c = document.getElementById("escolher-usuario");
    let gridcontainer = document.getElementById("containergeral");
    c.style.display = "none";
    gridcontainer.style.filter = "brightness(100%)";
}
function abrirCliente() {
    let c = document.getElementById("escolher-cliente");
    let gridcontainer = document.getElementById("containergeral");
    c.style.display = "flex";
    gridcontainer.style.filter = "brightness(50%)";
}
function fecharCliente() {
    let c = document.getElementById("escolher-cliente");
    var items = document.querySelectorAll('#item');
    let gridcontainer = document.getElementById("containergeral");
    c.style.display = "none";
    items.forEach(function (item) {
        item.style.display = "flex";
    });
    gridcontainer.style.filter = "brightness(100%)";
}
function abrirServico() {
    let c = document.getElementById("escolher-servico");
    let gridcontainer = document.getElementById("containergeral");
    c.style.display = "flex";
    gridcontainer.style.filter = "brightness(50%)";
}
function fecharServico() {
    let c = document.getElementById("escolher-servico");
    let gridcontainer = document.getElementById("containergeral");
    c.style.display = "none";
    gridcontainer.style.filter = "brightness(100%)";
}
function abrirFormCliente() {
    let c = document.getElementById("formCliente");
    let cliente = document.getElementById("escolher-cliente");
    let gridcontainer = document.getElementById("containergeral");
    c.style.display = "flex";
    cliente.style.display = "none";
    gridcontainer.style.filter = "brightness(30%)";
}
function fecharFormCliente() {
    let c = document.getElementById("formCliente");
    let gridcontainer = document.getElementById("containergeral");
    c.style.display = "none";
    gridcontainer.style.filter = "brightness(100%)";
}
function abrirFormServico() {
    let c = document.getElementById("formServico");
    let servico = document.getElementById("escolher-servico");
    let gridcontainer = document.getElementById("containergeral");
    c.style.display = "flex";
    servico.style.display = "none";
    gridcontainer.style.filter = "brightness(30%)";
}
function fecharFormServico() {
    let c = document.getElementById("formServico");
    let gridcontainer = document.getElementById("containergeral");
    c.style.display = "none";
    gridcontainer.style.filter = "brightness(100%)";
}




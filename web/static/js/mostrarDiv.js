function abrirConsulta(){
    let c = document.getElementById("consulta");
    let gridcontainer = document.getElementById("containergeral");
        c.style.display = "flex";
        gridcontainer.style.filter = "brightness(50%)";
}


function fecharConsulta(){
    let c = document.getElementById("consulta");
    let gridcontainer = document.getElementById("containergeral");
        c.style.display = "none";
        gridcontainer.style.filter = "brightness(100%)";
}

function abrirAtivarDesativar(){
    let c = document.getElementById("ativardesativar");
    let gridcontainer = document.getElementById("containergeral");
        c.style.display = "flex";
        gridcontainer.style.filter = "brightness(50%)";
}
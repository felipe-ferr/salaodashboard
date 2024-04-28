//mover o texto da text area pra cima depois de clicar na textarea
function sumirp() {
    let p = document.getElementById("ptextarea");
    let a = document.getElementById("area");
    
    if (document.hasFocus()){
        p.style.marginTop = "-40px";
        p.style.backgroundColor = "var(--cor-clara)";
    }
    else{
         p.style.backgroundColor = "var(--cor-escura)";
    }
}

//mover o texto do input de data de agendamento pra cima
function sumirpdata() {
    let d = document.getElementById("datetexto");
    
    if (document.hasFocus()){
        d.style.marginTop = "-40px";
        d.style.backgroundColor = "var(--cor-clara)";
    }
    else{
         d.style.backgroundColor = "var(--cor-escura)";
    }
}

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

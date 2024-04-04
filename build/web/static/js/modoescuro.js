let cor = document.querySelector(":root");
let claro = document.getElementById("botaolight");
let dark = document.getElementById("botaodark");

function escuro(){
    cor.style.setProperty("--cor-clara",'#252525');
    cor.style.setProperty("--cor-escura",'#181818');
    cor.style.setProperty("--cor-texto",'#7D7D7D');
    cor.style.setProperty("--cor-texto-preto",'gainsboro');
    
    dark.classList.add("btn-active-esquerda");
    dark.classList.remove("btn-esquerda");
    claro.classList.remove("btn-active-direita");
    claro.classList.add("btn-direita");
   

       
}
function light(){
    cor.style.setProperty("--cor-clara",'#eaeaea');
    cor.style.setProperty("--cor-escura",'#f5f5f5');
    cor.style.setProperty("--cor-texto",'##0F0300'); 
    cor.style.setProperty("--cor-texto-preto",'black');
    
    claro.classList.add("btn-active-direita");
    claro.classList.remove("btn-direita");
    dark.classList.remove("btn-active-esquerda");
    dark.classList.add("btn-esquerda");
}
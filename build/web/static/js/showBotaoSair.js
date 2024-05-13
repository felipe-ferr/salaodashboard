function mostrarBotaoSair(){
    let a = document.getElementById("sair");
    a.style.display = "flex";
    
     // Function to close the "sair" element when clicking outside
  const closeOnClickOutside = (event) => {
    if (event.target !== a) {
      a.style.display = "none";
      document.body.removeEventListener('click', closeOnClickOutside);
    }
  };
}

function definirDataHoje() {
  // Pega o elemento de data
  var inputData = document.getElementById("date"); 

  // Cria um novo objeto Date
  var hoje = new Date();

  // Formata a data no formato DD/MM/YYYY
  var dia = String(hoje.getDate()).padStart(2, '0');
  var mes = String(hoje.getMonth() + 1).padStart(2, '0'); // Janeiro é 0!
  var ano = hoje.getFullYear();

  var dataFormatada = dia + "/" + mes + "/" + ano;

  // Define o valor da entrada de data
  inputData.value = dataFormatada;
}

// Chama a função para definir a data no carregamento da página (opcional)
window.onload = definirDataHoje;

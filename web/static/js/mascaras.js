
//Máscara que checa se a data é menor que hoje


document.getElementById('dateInput').addEventListener('input', function(e) {
    var input = e.target.value;
    var numbers = input.replace(/\D/g, ''); // remove todos os caracteres que não são números

    // Separa os números entre mês, dia e ano
    var char = {2: '/', 4: '/'};
    var date = '';
    for (var i = 0; i < numbers.length && i < 8; i++) {
        date += (char[i] || '') + numbers.charAt(i);
    }

    // Formatar a data
    e.target.value = date;
    if (date.length === 10) { 
        var parts = date.split('/');
        var enteredDate = new Date(parts[2], parts[1] - 1, parts[0]);
        
        var today = new Date();
        today.setHours(0,0,0,0);

        var errorMessageElement = document.querySelector('.erroMensagem');
        if (enteredDate < today) {
            // Checa se a data é menor que hoje e exibe a mensagem de erro
            errorMessageElement.style.display = 'flex';
        } else {
            // Se a data for válida, garante que a mensagem de erro não seja exibida
            errorMessageElement.style.display = 'none';
        }
    }
});

document.getElementById('dateInput').addEventListener('click', function() {
    // Esconde a mensagem de erro quando o usuário clica para editar a data
    var errorMessageElement = document.querySelector('.erroMensagem');
    errorMessageElement.style.display = 'none';
});

function maskMoneyValue(inputValue) {
  const moneyValue = Number(inputValue).toLocaleString('pt-BR', {
    style: 'currency',
    currency: 'BRL',
  });

  return moneyValue;
}







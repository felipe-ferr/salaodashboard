
//Máscara que checa se a data é menor que hoje


document.getElementById('dateInput').addEventListener('input', function(e) {
    var input = e.target.value;

    // remove todos os caracteres que não são números
    var numbers = input.replace(/\D/g, '');

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
        
        var today = new Date(); //obtem a data atual
        today.setHours(0,0,0,0); // remove as horas do método Date()

        if (enteredDate < today) {
            // Checa se a data é menor que hoje
            alert("A data não pode ser menor que a de hoje!");
            e.target.value = ''; 
        }
    }
});

function maskMoneyValue(inputValue) {
  const moneyValue = Number(inputValue).toLocaleString('pt-BR', {
    style: 'currency',
    currency: 'BRL',
  });

  return moneyValue;
}




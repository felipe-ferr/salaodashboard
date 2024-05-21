function hidePastRows() {
  // Pega a data de hoje
  var today = new Date();
  today.setHours(0, 0, 0, 0); 

  var dateElements = document.querySelectorAll('.data');

  dateElements.forEach(function(element) {
    var dateString = element.textContent.trim();

    var parts = dateString.split('/');
    var day = parseInt(parts[0], 10);
    var month = parseInt(parts[1], 10) - 1; 
    var year = parseInt(parts[2], 10);

    var rowDate = new Date(year, month, day);

    if (rowDate < today) {
      // se a data for menor que hoje, ela esconde a linha
      var row = element.parentElement;
      row.style.display = 'none';
    }
  });
}

// chamar a função
window.addEventListener('DOMContentLoaded', hidePastRows);

function showPastRows() {
  // Pega a data de hoje
  var today = new Date();
  today.setHours(0, 0, 0, 0); 

  var dateElements = document.querySelectorAll('.dataconcluido');

  dateElements.forEach(function(element) {
    var dateString = element.textContent.trim();

    var parts = dateString.split('/');
    var day = parseInt(parts[0], 10);
    var month = parseInt(parts[1], 10) - 1; 
    var year = parseInt(parts[2], 10);

    var rowDate = new Date(year, month, day);

    if (rowDate > today) {
      // se a data for menor que hoje, ela esconde a linha
      var row = element.parentElement;
      row.style.display = 'none';
    }
  });
}

// chamar a função
window.addEventListener('DOMContentLoaded', showPastRows);

function countRowsAndDisplay() {
    // Pega todas as divs com a classe "id-row" (para contar a quantidade de clientes)
    var rows = document.querySelectorAll(".id-row");
    
    // pega parte onde estará escrita a quantidade de clientes
    var qtdClientesElement = document.getElementById("qtdClientes");

    // escreve a quantidade de clientes dentro do elemento
    qtdClientesElement.textContent = rows.length;
}

// chamar a função
window.addEventListener("DOMContentLoaded", countRowsAndDisplay);

function countTodayAppointments() {
    var dates = document.querySelectorAll(".data");

    var today = new Date();
    var dd = String(today.getDate()).padStart(2, '0');
    var mm = String(today.getMonth() + 1).padStart(2, '0'); 
    var yyyy = today.getFullYear();
    var todayFormatted = dd + '/' + mm + '/' + yyyy;

    // Contador dos agendamentos de hoje
    var agendamentosHoje = 0;

    // 
    dates.forEach(function(date) {
        // verifica se a data das linhas é igual a hoje e incrementa o contador
        if (date.textContent.trim() === todayFormatted) {
            agendamentosHoje++;
        }
    });

    var agendamentosHojeQtdElement = document.getElementById("agendamentosHojeQtd");

    // Escreve o tanto de agendamentos hoje no card
    agendamentosHojeQtdElement.textContent = agendamentosHoje;
}

// chama a função
window.addEventListener("DOMContentLoaded", countTodayAppointments);

function calculateTotalValue() {
    var values = document.querySelectorAll(".valor-row");

    var totalValue = 0;
    // soma todos os valores da tabela
    values.forEach(function(valueElement) {
        totalValue += parseFloat(valueElement.textContent.trim());
    });

    // Formatar o valor em reais
    var formatter = new Intl.NumberFormat('pt-BR', { style: 'currency', currency: 'BRL' });
    var formattedTotal = formatter.format(totalValue);

    var valorQtdElement = document.getElementById("valorQtd");

    valorQtdElement.textContent = formattedTotal;
}

// Chama a função
window.addEventListener("DOMContentLoaded", calculateTotalValue);





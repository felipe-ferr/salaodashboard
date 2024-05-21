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
    // Get all elements with class "data"
    var dates = document.querySelectorAll(".data");

    // Get today's date
    var today = new Date();
    var dd = String(today.getDate()).padStart(2, '0');
    var mm = String(today.getMonth() + 1).padStart(2, '0'); // January is 0!
    var yyyy = today.getFullYear();
    var todayFormatted = dd + '/' + mm + '/' + yyyy;

    // Counter for appointments today
    var appointmentsToday = 0;

    // Iterate through each date element
    dates.forEach(function(date) {
        // Check if the date matches today's date
        if (date.textContent.trim() === todayFormatted) {
            appointmentsToday++;
        }
    });

    // Get the element where you want to display the count
    var agendamentosHojeQtdElement = document.getElementById("agendamentosHojeQtd");

    // Update the content of the element with the count of appointments today
    agendamentosHojeQtdElement.textContent = appointmentsToday;
}

// Call the function when the page is loaded
window.addEventListener("DOMContentLoaded", countTodayAppointments);

function calculateTotalValue() {
    // Get all elements with class "valor-row"
    var values = document.querySelectorAll(".valor-row");

    // Initialize total value variable
    var totalValue = 0;

    // Iterate through each value element
    values.forEach(function(valueElement) {
        // Parse the value as a float and add it to the total
        totalValue += parseFloat(valueElement.textContent.trim());
    });

    // Format the total value as a money value
    var formatter = new Intl.NumberFormat('pt-BR', { style: 'currency', currency: 'BRL' });
    var formattedTotal = formatter.format(totalValue);

    // Get the element where you want to display the total value
    var valorQtdElement = document.getElementById("valorQtd");

    // Update the content of the element with the formatted total value
    valorQtdElement.textContent = formattedTotal;
}

// Call the function when the page is loaded
window.addEventListener("DOMContentLoaded", calculateTotalValue);





function sortIdRowDescending() {
    const idRows = document.querySelectorAll('.id-row');

    const sortedIdRows = Array.from(idRows).filter(row => !row.parentElement.classList.contains('thead')).sort((a, b) => {
        return parseInt(b.textContent) - parseInt(a.textContent);
    });

    const table = document.querySelector('#table');

    sortedIdRows.forEach(row => {
        if (!row.parentElement.classList.contains('thead')) {
            table.insertBefore(row.parentElement, table.firstChild);
        }
    });
}
function sortIdRowAscending() {
    const idRows = document.querySelectorAll('.id-row');

    const sortedIdRows = Array.from(idRows).filter(row => !row.parentElement.classList.contains('thead')).sort((b, a) => {
        return parseInt(a.textContent) - parseInt(b.textContent); // Sort in ascending order
    });

    const table = document.querySelector('#table');

    sortedIdRows.forEach(row => {
        if (!row.parentElement.classList.contains('thead')) {
            table.appendChild(row.parentElement); // Append rows at the end of the table for ascending order
        }
    });
}

function sortValorRowDescending() {
    const idRows = document.querySelectorAll('.valor-row');

    const sortedIdRows = Array.from(idRows).filter(row => !row.parentElement.classList.contains('thead')).sort((a, b) => {
        return parseInt(b.textContent) - parseInt(a.textContent);
    });

    const table = document.querySelector('#table');

    sortedIdRows.forEach(row => {
        if (!row.parentElement.classList.contains('thead')) {
            table.insertBefore(row.parentElement, table.firstChild);
        }
    });
}
function sortValorRowAscending() {
    const idRows = document.querySelectorAll('.valor-row');

    const sortedIdRows = Array.from(idRows).filter(row => !row.parentElement.classList.contains('thead')).sort((b, a) => {
        return parseInt(a.textContent) - parseInt(b.textContent); // Sort in ascending order
    });

    const table = document.querySelector('#table');

    sortedIdRows.forEach(row => {
        if (!row.parentElement.classList.contains('thead')) {
            table.appendChild(row.parentElement); // Append rows at the end of the table for ascending order
        }
    });
}


function sortDataDescending() {
    const idRows = document.querySelectorAll('.data');

    const sortedIdRows = Array.from(idRows).filter(row => !row.parentElement.classList.contains('thead')).sort((a, b) => {
        return parseInt(b.textContent) - parseInt(a.textContent);
    });

    const table = document.querySelector('#table');

    sortedIdRows.forEach(row => {
        if (!row.parentElement.classList.contains('thead')) {
            table.insertBefore(row.parentElement, table.firstChild);
        }
    });
}
function sortDataAscending() {
    const idRows = document.querySelectorAll('.data');

    const sortedIdRows = Array.from(idRows).filter(row => !row.parentElement.classList.contains('thead')).sort((b, a) => {
        return parseInt(a.textContent) - parseInt(b.textContent); // Sort in ascending order
    });

    const table = document.querySelector('#table');

    sortedIdRows.forEach(row => {
        if (!row.parentElement.classList.contains('thead')) {
            table.appendChild(row.parentElement); // Append rows at the end of the table for ascending order
        }
    });
}

function sortDataCadastroDescending() {
    const idRows = document.querySelectorAll('.datacadastro');

    const sortedIdRows = Array.from(idRows).filter(row => !row.parentElement.classList.contains('thead')).sort((a, b) => {
        return parseInt(b.textContent) - parseInt(a.textContent);
    });

    const table = document.querySelector('#table');

    sortedIdRows.forEach(row => {
        if (!row.parentElement.classList.contains('thead')) {
            table.insertBefore(row.parentElement, table.firstChild);
        }
    });
}
function sortDataCadastroAscending() {
    const idRows = document.querySelectorAll('.datacadastro');

    const sortedIdRows = Array.from(idRows).filter(row => !row.parentElement.classList.contains('thead')).sort((b, a) => {
        return parseInt(a.textContent) - parseInt(b.textContent); // Sort in ascending order
    });

    const table = document.querySelector('#table');

    sortedIdRows.forEach(row => {
        if (!row.parentElement.classList.contains('thead')) {
            table.appendChild(row.parentElement); // Append rows at the end of the table for ascending order
        }
    });
}



function filterItemsByStatusPendente() {
  // Get all the item elements
  const items = document.querySelectorAll('.tabela.td');

  items.forEach(item => {
    // Assuming the status text is directly within the item div, 
    // but this might need adjustment based on the actual DOM structure
    const statusText = item.textContent;

    // Check if the item includes "Pendente"
    if (!statusText.includes("Pendente")) {
      // If it does not include "Pendente", hide the item
      item.style.display = 'none';
    } else {
      // Otherwise, make sure the item is visible (in case it was previously hidden)
      item.style.display = '';
    }
  });
}


function filterItemsByStatusCancelado() {
  // Get all the item elements
  const items = document.querySelectorAll('.tabela.td');

  items.forEach(item => {
    // Assuming the status text is directly within the item div, 
    // but this might need adjustment based on the actual DOM structure
    const statusText = item.textContent;

    // Check if the item includes "Pendente"
    if (!statusText.includes("Cancelado")) {
      // If it does not include "Pendente", hide the item
      item.style.display = 'none';
    } else {
      // Otherwise, make sure the item is visible (in case it was previously hidden)
      item.style.display = '';
    }
  });
}

function displayAll() {
  const items = document.querySelectorAll('.tabela.td');

  items.forEach(item => {
    item.style.display = 'flex'; 
  });
}

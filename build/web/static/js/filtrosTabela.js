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
            table.appendChild(row.parentElement); 
        }
    });
}

function sortByAlphabeticalOrder() {
  const container = document.querySelector('.tabela-container');
  // Ignorar a div dos botões de paginação ao classificar os itens
  const items = Array.from(document.querySelectorAll('.tabela.td:not(#pagination)'));


  const sortedItems = items.sort((a, b) => {
    const serviceA = a.querySelector('.nome-row').textContent.toUpperCase(); 
    const serviceB = b.querySelector('.nome-row').textContent.toUpperCase();
    
    return serviceA.localeCompare(serviceB); 
  });

  
  Array.from(container.children).forEach(child => {
    if (child.id !== 'pagination') {
      container.removeChild(child);
    }
  });

  const paginationDiv = document.getElementById('pagination');
  sortedItems.forEach(item => {
    container.insertBefore(item, paginationDiv);
  });
}



function filterItemsByStatusPendente() {
  const items = document.querySelectorAll('.tabela.td');

  items.forEach(item => {

    const statusText = item.textContent;

    // Procura se o item possui a palavra pendente para escondê-la ou não
    if (!statusText.includes("Pendente")) {
      item.style.display = 'none';
    } else {
      item.style.display = '';
    }
  });
}


function filterItemsByStatusCancelado() {
  const items = document.querySelectorAll('.tabela.td');

  items.forEach(item => {

    const statusText = item.textContent;

    // Procura se o item possui a palavra Cancelado para escondê-la ou não
    if (!statusText.includes("Cancelado")) {
      item.style.display = 'none';
    } else {
      item.style.display = '';
    }
  });
}

function filterItemsByStatusAtivo() {
  const items = document.querySelectorAll('.tabela.td');

  items.forEach(item => {
    const statusText = item.textContent;

    // Procura se o item possui a palavra ativo para escondê-la ou não
    if (!statusText.includes("Ativo")) {
      item.style.display = 'none';
    } else {
      item.style.display = '';
    }
  });
}
function filterItemsByStatusInativo() {
  const items = document.querySelectorAll('.tabela.td');

  items.forEach(item => {

    const statusText = item.textContent;

    if (!statusText.includes("Inativo")) {
      item.style.display = 'none';
    } else {
      item.style.display = '';
    }
  });
}


function displayAll() {
    // mostra todos os items da tabela de volta
  const items = document.querySelectorAll('.tabela.td');

  items.forEach(item => {
    item.style.display = 'flex'; 
  });
}

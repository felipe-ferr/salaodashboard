function sortIdRowDescending() {
    const idRows = document.querySelectorAll('.id-row');

    const sortedIdRows = Array.from(idRows).filter(row => !row.parentElement.classList.contains('thead')).sort((a, b) => {
        return parseInt(b.textContent) - parseInt(a.textContent); // Filtar por ordem decrescente
    });

    const table = document.querySelector('#table');

    sortedIdRows.forEach(row => {
        if (!row.parentElement.classList.contains('thead')) { // ignora o cabeçalho da tabela
            table.insertBefore(row.parentElement, table.firstChild);
        }
    });
    updatePageInfo();
}
function sortIdRowAscending() {
    const idRows = document.querySelectorAll('.id-row');

    const sortedIdRows = Array.from(idRows).filter(row => !row.parentElement.classList.contains('thead')).sort((b, a) => {
        return parseInt(a.textContent) - parseInt(b.textContent); // Filtar por ordem crescente
    });

    const table = document.querySelector('#table');

    sortedIdRows.forEach(row => {
        if (!row.parentElement.classList.contains('thead')) {
            table.appendChild(row.parentElement); 
        }
    });
    updatePageInfo();
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
    updatePageInfo();
}
function sortValorRowAscending() {
    const idRows = document.querySelectorAll('.valor-row');

    const sortedIdRows = Array.from(idRows).filter(row => !row.parentElement.classList.contains('thead')).sort((b, a) => {
        return parseInt(a.textContent) - parseInt(b.textContent);
    });

    const table = document.querySelector('#table');

    sortedIdRows.forEach(row => {
        if (!row.parentElement.classList.contains('thead')) {
            table.appendChild(row.parentElement); 
        }
    });
    updatePageInfo();
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
    updatePageInfo();
}
function sortDataAscending() {
    const idRows = document.querySelectorAll('.data');

    const sortedIdRows = Array.from(idRows).filter(row => !row.parentElement.classList.contains('thead')).sort((b, a) => {
        return parseInt(a.textContent) - parseInt(b.textContent);
    });

    const table = document.querySelector('#table');

    sortedIdRows.forEach(row => {
        if (!row.parentElement.classList.contains('thead')) {
            table.appendChild(row.parentElement); 
        }
    });
    updatePageInfo();
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
    updatePageInfo();
}
function sortDataCadastroAscending() {
    const idRows = document.querySelectorAll('.datacadastro');

    const sortedIdRows = Array.from(idRows).filter(row => !row.parentElement.classList.contains('thead')).sort((b, a) => {
        return parseInt(a.textContent) - parseInt(b.textContent); 
    });

    const table = document.querySelector('#table');

    sortedIdRows.forEach(row => {
        if (!row.parentElement.classList.contains('thead')) {
            table.appendChild(row.parentElement); 
        }
    });
    updatePageInfo();
}

function sortNomeAlfabetica(){
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
  updatePageInfo();
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
  updatePageInfo();
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
  updatePageInfo();
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
  updatePageInfo();
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
  updatePageInfo();
}


function displayAll() {
    // mostra todos os items da tabela de volta
  const items = document.querySelectorAll('.tabela.td');

  items.forEach(item => {
    item.style.display = 'flex'; 
  });
  updatePageInfo();
}



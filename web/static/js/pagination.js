// Função para paginar as tabelas
function paginateTable(itemsPerPage) {
    let table = document.getElementById('table');
    let items = document.querySelectorAll('#item');
    let searchInput = document.getElementById('searchInput');
    let searchAll = document.getElementById('searchAll');
    let paginationDiv = document.getElementById('pagination');
    let pageInfoDiv = document.getElementById('pageInfoDiv');

    let currentPage = 1;
    let numPages = Math.ceil(items.length / itemsPerPage);


    // Atualizar as informações no final da tabela
    function updatePageInfo() {
        let totalItems = items.length;
        let itemsOnPage = document.querySelectorAll('#item[style="display: flex;"]').length;
        let pageInfoDiv = document.getElementById('pageInfo');
        pageInfoDiv.innerHTML = `Mostrando ${itemsOnPage} de ${totalItems} registros totais`;
    }

    // mostra as páginas na página atual
    function showPage(page, searchTerm = '') {
        items.forEach((item, index) => {
            let text = item.innerText.toLowerCase();
            if ((index >= (page - 1) * itemsPerPage && index < page * itemsPerPage) && (text.includes(searchTerm) || searchTerm === '')) {
                item.style.display = 'flex';
            } else {
                item.style.display = 'none';
            }
        });
    }

    // Mostrar a primeira página inicialmente
    showPage(currentPage);
    updatePageInfo();


    // Gerenciar os botôes de paginação
    function handlePagination(action) {
        if (action === 'prev' && currentPage > 1) {
            currentPage--;
        } else if (action === 'next' && currentPage < numPages) {
            currentPage++;
        } else if (action === 'first') {
            currentPage = 1;
        } else if (action === 'last') {
            currentPage = numPages;
        } else {
            currentPage = action;
        }

        showPage(currentPage, searchAll.value.toLowerCase());
        updatePaginationButtons();
        updatePageInfo();

    }




    // Botões de paginação


    let firstPageBtn = document.getElementById('firstPageBtn');
    firstPageBtn.addEventListener('click', () => handlePagination('first'));
    paginationDiv.appendChild(firstPageBtn);

    let prevPageBtn = document.getElementById('prevPageBtn');
    prevPageBtn.addEventListener('click', () => handlePagination('prev'));
    paginationDiv.appendChild(prevPageBtn);

    document.querySelectorAll('.active').forEach(button => button.remove());

// Loop para criar os botões se o número de itens for maior que o permitido por página
    for (let i = 1; i <= numPages; i++) {
        let pageBtn = document.createElement('button');
        pageBtn.textContent = i;
        pageBtn.addEventListener('click', () => handlePagination(i));
        paginationDiv.appendChild(pageBtn);
    }

    let nextPageBtn = document.getElementById('nextPageBtn');
    nextPageBtn.addEventListener('click', () => handlePagination('next'));
    paginationDiv.appendChild(nextPageBtn);

    let lastPageBtn = document.getElementById('lastPageBtn');
    lastPageBtn.addEventListener('click', () => handlePagination('last'));
    paginationDiv.appendChild(lastPageBtn);

    table.appendChild(paginationDiv);
    updatePaginationButtons();


    // Função que atualiza o número de botôes de paginação se necessário
    function updatePaginationButtons() {
        let pageButtons = paginationDiv.querySelectorAll('button');
        pageButtons.forEach((button, index) => {
            if (parseInt(button.textContent) === currentPage) {
                button.classList.add('active');
            } else {
                button.classList.remove('active');
            }
        });

        // Desativa o botão de próxima página caso estiver na última página
        nextPageBtn.disabled = currentPage === numPages;
        // Desativa o botão de página anterior caso estiver na primeira página
        prevPageBtn.disabled = currentPage === 1;

        // Desativa o botão de página anterior caso estiver na primeira página
        if (currentPage === 1) {
            prevPageBtn.classList.add('disabled');
        } else {
            prevPageBtn.classList.remove('disabled');
        }

        if (currentPage === numPages) {
            nextPageBtn.classList.add('disabled');
        } else {
            nextPageBtn.classList.remove('disabled');
        }
    }

    updatePageInfo();

// função que pesquisa por itens em todas as páginas
    searchAll.addEventListener('keyup', function () {
        let searchTerm = searchAll.value.toLowerCase();

        if (searchTerm.trim() === '') {
            showPage(currentPage);
        } else {
            items.forEach((item) => {
                let text = item.innerText.toLowerCase();
                if (text.includes(searchTerm)) {
                    item.style.display = 'flex';
                } else {
                    item.style.display = 'none';
                }
            });
        }
    });


    // função que pesquisa por itens na página atual
    searchInput.addEventListener('keyup', function () {
        let searchTerm = searchInput.value.toLowerCase();

        if (searchTerm.trim() === '') {
            showPage(currentPage);
        } else {
            items.forEach((item) => {
                if (item.style.display !== 'none') {
                    let text = item.innerText.toLowerCase();
                    if (text.includes(searchTerm)) {
                        item.style.display = 'flex';
                    } else {
                        item.style.display = 'none';
                    }
                }
            });
        }
    });
}


// Chamar a função com 15 itens por página
paginateTable(15);
updatePageInfo();




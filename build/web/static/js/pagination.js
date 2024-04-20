// Function to paginate the table
function paginateTable(itemsPerPage) {
    let table = document.getElementById('table');
    let items = document.querySelectorAll('#item');
    let searchInput = document.getElementById('searchInput');
    let searchAll = document.getElementById('searchAll');
    let paginationDiv = document.createElement('div');
    let pageInfoDiv = document.getElementById('pageInfoDiv');

    let currentPage = 1;
    let numPages = Math.ceil(items.length / itemsPerPage);

    // Function to update page information
    // Function to update page information in HTML
    function updatePageInfo() {
        let totalItems = items.length;
        let itemsOnPage = document.querySelectorAll('#item[style="display: flex;"]').length;
        let pageInfoDiv = document.getElementById('pageInfo');
        pageInfoDiv.innerHTML = `Total Items: ${totalItems} | Items on Page: ${itemsOnPage}`;
    }

    // Function to show items for the current page
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

    // Show the first page initially
    showPage(currentPage);

    // Function to handle pagination buttons
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

    }

    // Create pagination buttons
    paginationDiv.classList.add('pagination');

    let firstPageBtn = document.createElement('button');
    firstPageBtn.textContent = 'Primeira Página';
    firstPageBtn.addEventListener('click', () => handlePagination('first'));
    paginationDiv.appendChild(firstPageBtn);

    let prevPageBtn = document.createElement('button');
    prevPageBtn.textContent = 'Anterior';
    prevPageBtn.addEventListener('click', () => handlePagination('prev'));
    paginationDiv.appendChild(prevPageBtn);

    for (let i = 1; i <= numPages; i++) {
        let pageBtn = document.createElement('button');
        pageBtn.textContent = i;
        pageBtn.addEventListener('click', () => handlePagination(i));
        paginationDiv.appendChild(pageBtn);
    }

    let nextPageBtn = document.createElement('button');
    nextPageBtn.textContent = 'Próximo';
    nextPageBtn.addEventListener('click', () => handlePagination('next'));
    paginationDiv.appendChild(nextPageBtn);

    let lastPageBtn = document.createElement('button');
    lastPageBtn.textContent = 'Última Página';
    lastPageBtn.addEventListener('click', () => handlePagination('last'));
    paginationDiv.appendChild(lastPageBtn);

    table.appendChild(paginationDiv);

    // Function to update active page button style
    function updatePaginationButtons() {
        let pageButtons = paginationDiv.querySelectorAll('button');
        pageButtons.forEach((button) => {
            button.classList.remove('active');
            if (button.textContent == currentPage) {
                button.classList.add('active');
            }
        });
    }

    updatePaginationButtons();

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


    // Live search functionality - search without altering page size and ignore hidden items
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



// Function to change the items per page value to 10
function changeItemsPerPageToTen() {
    let table = document.getElementById('table');
    table.innerHTML = ''; // Clear the table
    paginateTable(10); // Call paginateTable with 10 items per page
}

// Call the paginateTable function with 5 items per page initially
paginateTable(5);
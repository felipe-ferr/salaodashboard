// Function to paginate the table
function paginateTable(itemsPerPage) {
    let table = document.getElementById('table');
    let items = document.querySelectorAll('#item');
    let searchInput = document.getElementById('searchInput');
    let searchAll = document.getElementById('searchAll');
    let paginationDiv = document.getElementById('pagination');
    let pageInfoDiv = document.getElementById('pageInfoDiv');

    let currentPage = 1;
    let numPages = Math.ceil(items.length / itemsPerPage);


    // Function to update page information in HTML
    function updatePageInfo() {
        let totalItems = items.length;
        let itemsOnPage = document.querySelectorAll('#item[style="display: flex;"]').length;
        let pageInfoDiv = document.getElementById('pageInfo');
        pageInfoDiv.innerHTML = `Mostrando ${itemsOnPage} de ${totalItems} registros totais`;
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
    updatePageInfo();


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
        updatePaginationButtons();
        updatePageInfo();

    }




    // Create pagination buttons


    let firstPageBtn = document.getElementById('firstPageBtn');
    firstPageBtn.addEventListener('click', () => handlePagination('first'));
    paginationDiv.appendChild(firstPageBtn);

    let prevPageBtn = document.getElementById('prevPageBtn');
    prevPageBtn.addEventListener('click', () => handlePagination('prev'));
    paginationDiv.appendChild(prevPageBtn);

    document.querySelectorAll('.active').forEach(button => button.remove());

// Loop to create pagination buttons
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


    // Function to update active page button style
    function updatePaginationButtons() {
        let pageButtons = paginationDiv.querySelectorAll('button');
        pageButtons.forEach((button, index) => {
            if (parseInt(button.textContent) === currentPage) {
                button.classList.add('active');
            } else {
                button.classList.remove('active');
            }
        });

        // Disable next button if on the last page
        nextPageBtn.disabled = currentPage === numPages;
        // Disable previous button if on the first page
        prevPageBtn.disabled = currentPage === 1;

        // Add 'disabled' class to previous button if on the first page
        if (currentPage === 1) {
            prevPageBtn.classList.add('disabled');
        } else {
            prevPageBtn.classList.remove('disabled');
        }

        // Add 'disabled' class to next button if on the last page
        if (currentPage === numPages) {
            nextPageBtn.classList.add('disabled');
        } else {
            nextPageBtn.classList.remove('disabled');
        }
    }

    updatePageInfo();


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
function mostrarDezItems() {
    paginateTable(10); // Call paginateTable with 10 items per page
    updatePageInfo();
    updatePaginationButtons();
}
// Function to change the items per page value to 25
function mostrarVinteCincoItems() {
    paginateTable(25); // Call paginateTable with 10 items per page
    updatePageInfo();
    updatePaginationButtons();
}
// Function to change the items per page value to 50
function mostrarCinquentaItems() {
    paginateTable(50); // Call paginateTable with 10 items per page
    updatePageInfo();
    updatePaginationButtons();
}
// Function to change the items per page value to 100
function mostrarCemItems() {
    paginateTable(100); // Call paginateTable with 10 items per page
    updatePageInfo();
    updatePaginationButtons();
}

// Call the paginateTable function with 5 items per page initially
paginateTable(10);
updatePageInfo();




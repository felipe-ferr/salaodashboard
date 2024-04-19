// Function to paginate the table
function paginateTable(itemsPerPage) {
    let table = document.getElementById('table');
    let items = document.querySelectorAll('#item');
    let searchInput = document.getElementById('searchInput');
    let paginationDiv = document.createElement('div');

    let currentPage = 1;
    let numPages = Math.ceil(items.length / itemsPerPage);

    // Function to show items for the current page
    function showPage(page) {
        items.forEach((item, index) => {
            if (index >= (page - 1) * itemsPerPage && index < page * itemsPerPage) {
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

        showPage(currentPage);
        updatePaginationButtons();
    }

    // Create pagination buttons
    paginationDiv.classList.add('pagination');

    let firstPageBtn = document.createElement('button');
    firstPageBtn.textContent = 'First Page';
    firstPageBtn.addEventListener('click', () => handlePagination('first'));
    paginationDiv.appendChild(firstPageBtn);

    let prevPageBtn = document.createElement('button');
    prevPageBtn.textContent = 'Previous';
    prevPageBtn.addEventListener('click', () => handlePagination('prev'));
    paginationDiv.appendChild(prevPageBtn);

    for (let i = 1; i <= numPages; i++) {
        let pageBtn = document.createElement('button');
        pageBtn.textContent = i;
        pageBtn.addEventListener('click', () => handlePagination(i));
        paginationDiv.appendChild(pageBtn);
    }

    let nextPageBtn = document.createElement('button');
    nextPageBtn.textContent = 'Next';
    nextPageBtn.addEventListener('click', () => handlePagination('next'));
    paginationDiv.appendChild(nextPageBtn);

    let lastPageBtn = document.createElement('button');
    lastPageBtn.textContent = 'Last Page';
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

    // Live search functionality
    searchInput.addEventListener('keyup', function() {
        let searchTerm = searchInput.value.toLowerCase();
        
        if (searchTerm.trim() === '') {
            paginateTable(itemsPerPage);
        } else {
            paginationDiv.style.display = 'none';
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

  
}

// Function to change the items per page value to 10
function changeItemsPerPageToTen() {
    let table = document.getElementById('table');
    table.innerHTML = ''; // Clear the table
    paginateTable(10); // Call paginateTable with 10 items per page
}

// Call the paginateTable function with 5 items per page initially
paginateTable(5);
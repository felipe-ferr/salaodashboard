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

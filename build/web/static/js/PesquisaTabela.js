function pesquisar() {
    // Declare variables
    var input, filter, table, div, a, i, txtValue;
    input = document.getElementById('pesquisainput');
    filter = input.value.toUpperCase();
    table = document.getElementById("table");
    div = table.getElementsByTagName('div');

    // Loop through all divst items, and hide those who don't match the search query
    for (i = 0; i < div.length; i++) {
        a = div[i].getElementsByTagName("span")[0];
        txtValue = a.textContent || a.innerText;
        if (txtValue.toUpperCase().indexOf(filter) > -1) {
            div[i].style.display = "";
        } else {
            div[i].style.display = "none";
        }
    }
}
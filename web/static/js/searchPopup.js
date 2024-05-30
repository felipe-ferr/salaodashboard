document.getElementById('searchInput').addEventListener('input', function() {
    var filter = this.value.toLowerCase();
    var items = document.querySelectorAll('#item');
    
    items.forEach(function(item) {
        var text = item.textContent || item.innerText;
        if (text.toLowerCase().indexOf(filter) > -1) {
            item.style.display = "flex";
        } else {
            item.style.display = "none";
        }
    });
});

document.getElementById('searchInputServico').addEventListener('input', function() {
    var filter = this.value.toLowerCase();
    var items = document.querySelectorAll('#item');
    
    items.forEach(function(item) {
        var text = item.textContent || item.innerText;
        if (text.toLowerCase().indexOf(filter) > -1) {
            item.style.display = "flex";
        } else {
            item.style.display = "none";
        }
    });
});
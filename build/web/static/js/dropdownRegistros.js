function hoverDropdownMenu() {
    const dropdownBtn = document.getElementById('dropdownBtnContainer');
    const dropdownMenu = document.getElementById('drop');

    dropdownBtn.addEventListener('mouseover', function () {
        dropdownMenu.classList.remove('hidden');
        dropdownMenu.classList.add('visible');
    });

    dropdownBtn.addEventListener('mouseout', function () {
        dropdownMenu.classList.remove('visible');
        dropdownMenu.classList.add('hidden');
    });

    dropdownMenu.addEventListener('mouseover', function () {
        dropdownMenu.classList.remove('hidden');
        dropdownMenu.classList.add('visible');
    });

    dropdownMenu.addEventListener('mouseout', function () {
        dropdownMenu.classList.remove('visible');
        dropdownMenu.classList.add('hidden');
    });
}


document.addEventListener('DOMContentLoaded', function () {
    hoverDropdownMenu();
});

function updateSelectedOption(event) {
    if (event.target.tagName === 'SPAN') {
        var selectedOption = document.getElementById('selectedOption');
        selectedOption.textContent = event.target.textContent;
    }
}
//função separada para o dropdown de mostrar ativos/inativos (para não conflitar as duas funções)
function hoverDropdownMenuMostrar() {
    const dropdownBtn = document.getElementById('dropdownBtnContainerMostrar');
    const dropdownMenu = document.getElementById('dropmostrar');

    dropdownBtn.addEventListener('mouseover', function () {
        dropdownMenu.classList.remove('hidden');
        dropdownMenu.classList.add('visible');
    });

    dropdownBtn.addEventListener('mouseout', function () {
        dropdownMenu.classList.remove('visible');
        dropdownMenu.classList.add('hidden');
    });

    dropdownMenu.addEventListener('mouseover', function () {
        dropdownMenu.classList.remove('hidden');
        dropdownMenu.classList.add('visible');
    });

    dropdownMenu.addEventListener('mouseout', function () {
        dropdownMenu.classList.remove('visible');
        dropdownMenu.classList.add('hidden');
    });
}

// Chama a função assim que o documento for carregado
document.addEventListener('DOMContentLoaded', function () {
    hoverDropdownMenu();
});

function updateSelectedOptionMostrar(event) {
    if (event.target.tagName === 'SPAN') {
        var selectedOption = document.getElementById('selectedOptionMostrar');
        selectedOption.textContent = event.target.textContent;
    }
}

    
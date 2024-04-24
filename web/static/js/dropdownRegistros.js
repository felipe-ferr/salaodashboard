function hoverDropdownMenu() {
    const dropdownBtn = document.getElementById('dropdownBtnContainer');
    const dropdownMenu = document.getElementById('drop');

    dropdownBtn.addEventListener('mouseover', function() {
        dropdownMenu.classList.remove('hidden');
        dropdownMenu.classList.add('visible');
    });

    dropdownBtn.addEventListener('mouseout', function() {
        dropdownMenu.classList.remove('visible');
        dropdownMenu.classList.add('hidden');
    });

    dropdownMenu.addEventListener('mouseover', function() {
        dropdownMenu.classList.remove('hidden');
        dropdownMenu.classList.add('visible');
    });

    dropdownMenu.addEventListener('mouseout', function() {
        dropdownMenu.classList.remove('visible');
        dropdownMenu.classList.add('hidden');
    });
}

// Call the function when the page loads
document.addEventListener('DOMContentLoaded', function() {
    hoverDropdownMenu();
});

function updateSelectedOption(event) {
        if (event.target.tagName === 'SPAN') {
            var selectedOption = document.getElementById('selectedOption');
            selectedOption.textContent = event.target.textContent;
        }
    }
    
    function hoverDropdownMenuMostrar() {
    const dropdownBtn = document.getElementById('dropdownBtnContainerMostrar');
    const dropdownMenu = document.getElementById('dropmostrar');

    dropdownBtn.addEventListener('mouseover', function() {
        dropdownMenu.classList.remove('hidden');
        dropdownMenu.classList.add('visible');
    });

    dropdownBtn.addEventListener('mouseout', function() {
        dropdownMenu.classList.remove('visible');
        dropdownMenu.classList.add('hidden');
    });

    dropdownMenu.addEventListener('mouseover', function() {
        dropdownMenu.classList.remove('hidden');
        dropdownMenu.classList.add('visible');
    });

    dropdownMenu.addEventListener('mouseout', function() {
        dropdownMenu.classList.remove('visible');
        dropdownMenu.classList.add('hidden');
    });
}

// Call the function when the page loads
document.addEventListener('DOMContentLoaded', function() {
    hoverDropdownMenu();
});

function updateSelectedOption(event) {
        if (event.target.tagName === 'SPAN') {
            var selectedOption = document.getElementById('selectedOption');
            selectedOption.textContent = event.target.textContent;
        }
    }
    
    
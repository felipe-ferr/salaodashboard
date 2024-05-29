function showDescDiv(clickedIcon) {
    document.querySelectorAll('.desc').forEach(function(desc) {
        desc.style.display = 'none'; // esconde todas as descrições inicialmente
    });

    // mostrar as descrições que são clicadas
    var descSpan = clickedIcon.nextElementSibling;
    if (descSpan && descSpan.classList.contains('desc')) {
        descSpan.style.display = 'flex'; 
    }

    event.stopPropagation();
}

// fecha a descrição quando clicar em qualquer lugar do documento
document.addEventListener('click', function(event) {
    document.querySelectorAll('.desc').forEach(function(desc) {
        desc.style.display = 'none'; // Hide descriptions
    });
});

// para não fechar quando clicar dentro da descrição
document.querySelectorAll('.desc').forEach(function(desc) {
    desc.addEventListener('click', function(event) {
        event.stopPropagation();
    });
});
function showDeletarDiv(clickedIcon) {
    document.querySelectorAll('.deletar').forEach(function(desc) {
        desc.style.display = 'none'; // esconde todas as descrições inicialmente
    });

    // mostrar as descrições que são clicadas
    var descSpan = clickedIcon.nextElementSibling;
    if (descSpan && descSpan.classList.contains('deletar')) {
        descSpan.style.display = 'flex'; 
    }

    event.stopPropagation();
}

// fecha a descrição quando clicar em qualquer lugar do documento
document.addEventListener('click', function(event) {
    document.querySelectorAll('.deletar').forEach(function(desc) {
        desc.style.display = 'none'; // Hide descriptions
    });
});

// para não fechar quando clicar dentro da descrição
document.querySelectorAll('.deletar').forEach(function(desc) {
    desc.addEventListener('click', function(event) {
        event.stopPropagation();
    });
});
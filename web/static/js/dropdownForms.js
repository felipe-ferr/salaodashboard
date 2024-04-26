
function toggleDropdownMenu(event) {
  var dropdownMenu = document.getElementById('drop');
  // Mostrar menu quando clicar no botão
  if (event.target.closest('#dropdownBtnContainer')) {
    dropdownMenu.classList.toggle('hidden');
    dropdownMenu.classList.toggle('visible');
  } else {
    // Fechar menu se o click for fora do container do botão
    dropdownMenu.classList.add('hidden');
    dropdownMenu.classList.remove('visible');
  }
}

document.addEventListener('click', function(event) {
  toggleDropdownMenu(event);
});
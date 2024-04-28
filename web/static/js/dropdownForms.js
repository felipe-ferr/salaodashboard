function toggleDropdownMenu(event) {
  var dropdownMenu = document.getElementById('dropstatus');
  var selectedOption = document.getElementById('selectedOptionMostrar');

  if (event.target.closest('#dropdownBtnContainer')) {
    dropdownMenu.classList.toggle('hidden');
    dropdownMenu.classList.toggle('visible');
  } else {
    dropdownMenu.classList.add('hidden');
    dropdownMenu.classList.remove('visible');
  }

  // Atualizar o texto do div com o valor do input selecionado no dropdown de status
  if (event.target.type === 'radio' && event.target.closest('#dropstatus')) {
    selectedOption.textContent = event.target.parentElement.textContent.trim();
  }
}

function toggleDropdownServico(event) {
  var dropdownServico = document.getElementById('dropservico');
  var selectedOptionServico = document.getElementById('selectedOptionServico');

  if (event.target.closest('#dropdownBtnServico')) {
    dropdownServico.classList.toggle('hidden');
    dropdownServico.classList.toggle('visible');
  } else {
    dropdownServico.classList.add('hidden');
    dropdownServico.classList.remove('visible');
  }

  // Atualizar o texto do div com o valor do input selecionado no dropdown de serviço
  if (event.target.type === 'radio' && event.target.closest('#dropservico')) {
    selectedOptionServico.textContent = event.target.parentElement.textContent.trim();
  }
}



function toggleDropdownCliente(event) {
  var dropdownCliente = document.getElementById('dropcliente');
  var selectedOptionCliente = document.getElementById('selectedOptionCliente');

  if (event.target.closest('#dropdownBtnCliente')) {
    dropdownCliente.classList.toggle('hidden');
    dropdownCliente.classList.toggle('visible');
  } else {
    dropdownCliente.classList.add('hidden');
    dropdownCliente.classList.remove('visible');
  }

  // Atualizar o texto do div com o valor do input selecionado no dropdown de serviço
  if (event.target.type === 'radio' && event.target.closest('#dropcliente')) {
    selectedOptionCliente.textContent = event.target.parentElement.textContent.trim();
  }
}


function toggleDropdownUsuario(event) {
  var dropdownUsuario = document.getElementById('dropusuario');
  var selectedOptionUsuario = document.getElementById('selectedOptionUsuario');

  if (event.target.closest('#dropdownBtnUsuario')) {
    dropdownUsuario.classList.toggle('hidden');
    dropdownUsuario.classList.toggle('visible');
  } else {
    dropdownUsuario.classList.add('hidden');
    dropdownUsuario.classList.remove('visible');
  }

  // Atualizar o texto do div com o valor do input selecionado no dropdown de serviço
  if (event.target.type === 'radio' && event.target.closest('#dropusuario')) {
    selectedOptionUsuario.textContent = event.target.parentElement.textContent.trim();
  }
}

document.addEventListener('click', function(event) {
  toggleDropdownMenu(event);
  toggleDropdownServico(event);
  toggleDropdownCliente(event);
  toggleDropdownUsuario(event);
});
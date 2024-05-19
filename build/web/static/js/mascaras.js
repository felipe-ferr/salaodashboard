document.getElementById('dateInput').addEventListener('input', function (e) {
    // Valor digitado no campo de input
    var input = e.target.value;

    // Remove todos os caracteres que não são números
    var numbers = input.replace(/\D/g, '');

    // Separa os números em dia, mês e ano
    var char = {2: '/', 4: '/'};
    var date = '';
    for (var i = 0; i < numbers.length && i < 8; i++) {
        date += (char[i] || '') + numbers.charAt(i);
    }

    // Formata a data
    e.target.value = date;
    if (date.length === 10) {
        // Separa a data em dia, mês e ano
        var parts = date.split('/');
        var enteredDate = new Date(parts[2], parts[1] - 1, parts[0]);

        // Pega a data atual sem as horas
        var today = new Date();
        today.setHours(0, 0, 0, 0);

        // Referências para os elementos de input, mensagem de erro e containers
        let dateInput = document.getElementById('dateInput');
        var errorMessageElement = document.querySelector('.erroMensagem');
        var semanaContainer = document.getElementById('semana');
        var domingoContainer = document.getElementById('domingo');
        var titulohorario = document.getElementById('titlehorario');

        // Checagem de mês ou dia inválido
        if (parts[1] > 12 || parts[0] > 31) {
            // Limpa o campo de input e exibe mensagem de erro
            errorMessageElement.textContent = "Data inválida! Por favor, digite um mês válido (1-12) e um dia válido (1-31).";
            errorMessageElement.style.display = 'flex';
            dateInput.value = '';
        } else if (enteredDate < today) {
            // Validação anterior para datas passadas (sem alteração)
            errorMessageElement.textContent = "A data não pode ser no passado.";
            errorMessageElement.style.display = 'flex';
            dateInput.value = '';
            // Add click event listener to the dateInput
            dateInput.addEventListener('click', function () {
                errorMessageElement.style.display = 'none'; // Hide error message on click
            });
        } else {
            // Exibe ambos os containers se for domingo, caso contrário oculta domingo
            if (enteredDate.getDay() === 0) {
                semanaContainer.style.display = 'none';
                domingoContainer.style.display = 'flex';
                titulohorario.style.display = 'flex';
            } else {
                semanaContainer.style.display = 'flex';
                domingoContainer.style.display = 'none';
                titulohorario.style.display = 'flex';
            }
            errorMessageElement.style.display = 'none'; // Oculta mensagem de erro para data válida
        }
    }
});


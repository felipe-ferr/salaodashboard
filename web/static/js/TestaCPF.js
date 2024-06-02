document.querySelector('.cpf').addEventListener('input', function() {
            let cpf = this.value;
            let errorMessage = document.querySelector('.erroMensagemCPF');
            let submitButton = document.querySelector('.submit');

            // Remove todos os caracteres não numéricos
            cpf = cpf.replace(/[^\d]+/g, '');

            if (cpf === '') {
                // Se o campo estiver vazio, esconde a mensagem de erro e ativa o botão de enviar
                errorMessage.style.display = 'none';
                submitButton.disabled = false;
            } else if (cpf.length === 11) {
                // Só valida o CPF se tiver 11 dígitos
                if (validateCPF(cpf)) {
                    errorMessage.style.display = 'none';
                    submitButton.disabled = false;
                } else {
                    errorMessage.textContent = 'CPF inválido';
                    errorMessage.style.display = 'block';
                    submitButton.disabled = true;
                }
            } else {
                // Esconde a mensagem de erro se o CPF não tiver 11 dígitos e ativa o botão de enviar
                errorMessage.style.display = 'none';
                submitButton.disabled = false;
            }
        });

        function validateCPF(cpf) {
            // Remove todos os caracteres não numéricos
            cpf = cpf.replace(/[^\d]+/g, '');
            if (cpf.length !== 11) return false;

            let sum = 0;
            let remainder;

            if (cpf === "00000000000" || 
                cpf === "11111111111" || 
                cpf === "22222222222" || 
                cpf === "33333333333" || 
                cpf === "44444444444" || 
                cpf === "55555555555" || 
                cpf === "66666666666" || 
                cpf === "77777777777" || 
                cpf === "88888888888" || 
                cpf === "99999999999")
                return false;

            for (let i = 1; i <= 9; i++) {
                sum += parseInt(cpf.substring(i-1, i)) * (11 - i);
            }
            remainder = (sum * 10) % 11;
            if ((remainder === 10) || (remainder === 11)) remainder = 0;
            if (remainder !== parseInt(cpf.substring(9, 10))) return false;

            sum = 0;
            for (let i = 1; i <= 10; i++) {
                sum += parseInt(cpf.substring(i-1, i)) * (12 - i);
            }
            remainder = (sum * 10) % 11;
            if ((remainder === 10) || (remainder === 11)) remainder = 0;
            if (remainder !== parseInt(cpf.substring(10, 11))) return false;

            return true;
        }
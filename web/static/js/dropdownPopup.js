document.addEventListener('DOMContentLoaded', (event) => {
            // Function to update the selected option text
            function updateSelectedOption() {
                // Find the checked radio button
                const checkedRadioButton = document.querySelector('input[name="idusuario"]:checked');
                if (checkedRadioButton) {
                    // Get the label associated with the checked radio button
                    const label = checkedRadioButton.parentElement;
                    // Update the text of the element with id "selectedOptionUsuario"
                    document.getElementById('selectedOptionUsuario').innerText = label.textContent.trim();
                }
            }

            // Attach event listeners to all radio buttons
            const radioButtons = document.querySelectorAll('input[name="idusuario"]');
            radioButtons.forEach((radioButton) => {
                radioButton.addEventListener('change', updateSelectedOption);
            });

            // Initial update on page load
            updateSelectedOption();
});

document.addEventListener('DOMContentLoaded', (event) => {
            function updateSelectedOptionCliente() {
                const checkedRadioButton = document.querySelector('input[name="idcliente"]:checked');
                if (checkedRadioButton) {
                    const label = checkedRadioButton.parentElement;
                    document.getElementById('selectedOptionCliente').innerText = label.textContent.trim();
                }
            }

            const radioButtons = document.querySelectorAll('input[name="idcliente"]');
            radioButtons.forEach((radioButton) => {
                radioButton.addEventListener('change', updateSelectedOptionCliente);
            });

            updateSelectedOptionCliente();
});

document.addEventListener('DOMContentLoaded', (event) => {
            function updateSelectedOptionServico() {
                const checkedRadioButton = document.querySelector('input[name="idservico"]:checked');
                if (checkedRadioButton) {
                    const label = checkedRadioButton.parentElement;
                    document.getElementById('selectedOptionServico').innerText = label.textContent.trim();
                }
            }

            const radioButtons = document.querySelectorAll('input[name="idservico"]');
            radioButtons.forEach((radioButton) => {
                radioButton.addEventListener('change', updateSelectedOptionServico);
            });

            updateSelectedOptionServico();
});
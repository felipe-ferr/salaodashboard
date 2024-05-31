$(document).ready(function() {
    // Itera sobre cada elemento com a classe "tabela"
    $('.tabela-container .tabela').each(function() {
        // Seleciona o elemento com a classe "data" dentro da linha atual
        var $dataElement = $(this).find('#data');
        
        if ($dataElement.length) {
            // Obtém a data escrita dentro do elemento
            var dataTexto = $dataElement.text();
            // Converte o texto da data em um objeto Date
            var dataParts = dataTexto.split('/');
            var data = new Date(dataParts[2], dataParts[1] - 1, dataParts[0]); // Formato dd/MM/yyyy
            
            // Obtém a data atual
            var hoje = new Date();
            // Zera as horas, minutos, segundos e milissegundos para comparar somente as datas
            hoje.setHours(0, 0, 0, 0);

            // Seleciona o elemento com o id "pendente" dentro da linha atual
            var $pendenteElement = $(this).find('#pendente');
            
            if (data < hoje && $pendenteElement.length) {
                // Remove a classe "ativo"
                $pendenteElement.removeClass('ativo');
                // Adiciona a classe "concluido"
                $pendenteElement.addClass('concluido');
                // Altera o texto para "Concluído"
                $pendenteElement.text('Concluído');
            }
        }
    });
});

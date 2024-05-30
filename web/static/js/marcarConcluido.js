document.addEventListener('DOMContentLoaded', (event) => {
    const today = new Date();

    document.querySelectorAll('#item').forEach(item => {
      const dataElement = item.querySelector('.data');
      const dateString = dataElement.textContent.trim();
      const parts = dateString.split('/');
      const itemDate = new Date(parts[2], parts[1] - 1, parts[0]); // Convert to Date object

      if (itemDate < today) {
        item.querySelector('.ativo').style.display = 'none';
        item.querySelector('.inativo').style.display = 'none';
        item.querySelector('.concluido').style.display = 'flex';
      }
    });
  });
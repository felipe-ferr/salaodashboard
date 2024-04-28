function fillDate() {
    var checkbox = document.getElementById('fillDateCheckbox');
    var dateInput = document.getElementById('date');

    if (checkbox.checked) {
        var today = new Date();
        var dd = String(today.getDate()).padStart(2, '0');
        var mm = String(today.getMonth() + 1).padStart(2, '0'); //January is 0!
        var yyyy = today.getFullYear();

        today = dd + '/' + mm + '/' + yyyy;
        dateInput.value = today;
    } else {
        dateInput.value = ''; // Clear the input field if the checkbox is unchecked
    }
}
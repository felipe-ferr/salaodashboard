
function mascara(i) {

    var v = i.value;

    if (isNaN(v[v.length - 1])) { // impede entrar outro caractere que não seja número
        i.value = v.substring(0, v.length - 1);
        return;
    }

    i.setAttribute("maxlength", "14");
    if (v.length == 3 || v.length == 7)
        i.value += ".";
    if (v.length == 11)
        i.value += "-";

}


document.getElementById('dateInput').addEventListener('input', function(e) {
    var input = e.target.value;

    // Remove all non-digit characters
    var numbers = input.replace(/\D/g, '');

    // Split the numbers into day, month, year parts
    var char = {2: '/', 4: '/'};
    var date = '';
    for (var i = 0; i < numbers.length && i < 8; i++) {
        date += (char[i] || '') + numbers.charAt(i);
    }

    // Update the input value with formatted date
    e.target.value = date;
 // Date validation
    if (date.length === 10) { // Ensure the full date is entered
        var parts = date.split('/');
        var enteredDate = new Date(parts[2], parts[1] - 1, parts[0]); // Convert to date object, note months are 0-indexed
        
        var today = new Date();
        today.setHours(0,0,0,0); // Reset hours to compare only date without time

        if (enteredDate < today) {
            // If entered date is in the past, clear the input
            alert("The date cannot be lower than today.");
            e.target.value = ''; // Clear the input field
        }
    }
});




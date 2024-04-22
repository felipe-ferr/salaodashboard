function showDescDiv(clickedIcon) {
    // First, close any currently open descriptions
    document.querySelectorAll('.desc').forEach(function(desc) {
        desc.style.display = 'none'; // Hide all descriptions
    });

    // Then, show the clicked description
    var descSpan = clickedIcon.nextElementSibling;
    if (descSpan && descSpan.classList.contains('desc')) {
        descSpan.style.display = 'flex'; // Show only the clicked one
    }

    // Stop the propagation to prevent the document click listener from hiding the description
    event.stopPropagation();
}

// Close the description when clicking anywhere else on the page
document.addEventListener('click', function(event) {
    document.querySelectorAll('.desc').forEach(function(desc) {
        desc.style.display = 'none'; // Hide descriptions
    });
});

// Prevent closing when clicking inside the description
document.querySelectorAll('.desc').forEach(function(desc) {
    desc.addEventListener('click', function(event) {
        event.stopPropagation(); // Stop propagation to keep the description open
    });
});
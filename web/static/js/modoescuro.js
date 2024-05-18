let cor = document.querySelector(":root");


function escuro() {
    cor.style.setProperty("--cor-clara", '#252525');
    cor.style.setProperty("--cor-escura", '#181818');
    cor.style.setProperty("--cor-texto", '#AFAFAF');
    cor.style.setProperty("--cor-texto-preto", '#DFDFDF');
    cor.style.setProperty("--cor-tabela-stripe", '#161616');


    setCookie("theme", "dark", 30);


}

// Function to apply the light theme
function light() {
    cor.style.setProperty("--cor-clara", '#eaeaea');
    cor.style.setProperty("--cor-escura", '#f5f5f5');
    cor.style.setProperty("--cor-texto", '##0F0300');
    cor.style.setProperty("--cor-texto-preto", 'black');
    cor.style.setProperty("--cor-tabela-stripe", '#F0F0F0');

    setCookie("theme", "light", 30);

}

// Function to toggle the theme
function toggleTheme() {
    const checkbox = document.getElementById("switch");
    if (checkbox.checked) {
        escuro();
    } else {
        light();
    }
}
// Function to set a cookie
function setCookie(name, value, days) {
    let expires = "";
    if (days) {
        let date = new Date();
        date.setTime(date.getTime() + (days * 24 * 60 * 60 * 1000));
        expires = "; expires=" + date.toUTCString();
    }
    document.cookie = name + "=" + (value || "") + expires + "; path=/";
}

// Function to get a cookie
function getCookie(name) {
    let nameEQ = name + "=";
    let ca = document.cookie.split(';');
    for (let i = 0; i < ca.length; i++) {
        let c = ca[i];
        while (c.charAt(0) == ' ')
            c = c.substring(1, c.length);
        if (c.indexOf(nameEQ) == 0)
            return c.substring(nameEQ.length, c.length);
    }
    return null;
}

// Function to check the cookie and apply theme
function checkCookie() {
    let theme = getCookie("theme");
    const checkbox = document.getElementById("switch");
    if(theme === "dark") {
        checkbox.checked = true;
        escuro();
    } else if(theme === "light") {
        checkbox.checked = false;
        light();
    }
}
document.addEventListener("DOMContentLoaded", function () {
    checkCookie();
});

document.getElementById("switch").addEventListener('change', toggleTheme);
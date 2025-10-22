document.querySelector(".login-btn").onclick = function(){
    this.textContent = this.textContent === "Iniciar sesión" ? "Cerrar sesión" : "Iniciar sesión";
};

document.querySelector(".add-btn").onclick = function () {
    this.style.display = "none";
    alert("Definición agregada con éxito");
};
document.querySelectorAll(".like-btn").forEach(btn => {
    btn.onclick = function (e) {
        e.preventDefault();
        const titulo = this.closest(".card").querySelector("h1").textContent;
        alert(` Te gustó la definición de "${titulo}"`);
    };
});


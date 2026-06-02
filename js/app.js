// ==========================================
// KMUSIC AI
// Sistema de Recomendación Musical
// Kelvin Marlon Rudas Hinostroza
// ==========================================

console.log("KMusic AI iniciado correctamente");

// ==========================================
// BUSCADOR
// ==========================================

const buscador = document.querySelector(".topbar input");

if (buscador) {

    buscador.addEventListener("keyup", function () {

        let filtro = buscador.value.toLowerCase();

        let canciones = document.querySelectorAll(".song-card");

        canciones.forEach(cancion => {

            let titulo = cancion.textContent.toLowerCase();

            if (titulo.includes(filtro)) {
                cancion.style.display = "block";
            } else {
                cancion.style.display = "none";
            }

        });

    });

}

// ==========================================
// FAVORITOS
// ==========================================

let favoritos = [];

document.querySelectorAll(".btn-like").forEach(btn => {

    btn.addEventListener("click", function () {

        let nombreCancion =
            this.closest(".song-card")
                .querySelector("h3").textContent;

        favoritos.push(nombreCancion);

        alert("❤️ Agregado a Me Gusta: " + nombreCancion);

        console.log("Favoritos:", favoritos);

    });

});

// ==========================================
// GUARDADOS
// ==========================================

let guardados = [];

document.querySelectorAll(".btn-save").forEach(btn => {

    btn.addEventListener("click", function () {

        let nombreCancion =
            this.closest(".song-card")
                .querySelector("h3").textContent;

        guardados.push(nombreCancion);

        alert("🔖 Canción guardada: " + nombreCancion);

        console.log("Guardados:", guardados);

    });

});

// ==========================================
// REPRODUCIR CANCIÓN
// ==========================================

document.querySelectorAll(".btn-play").forEach(btn => {

    btn.addEventListener("click", function () {

        let card = this.closest(".song-card");

        let titulo = card.querySelector("h3").textContent;
        let artista = card.querySelector("p").textContent;

        document.getElementById("song-title").innerHTML =
            "🎵 " + titulo + " - " + artista;

        console.log("Reproduciendo:", titulo);

    });

});

// ==========================================
// RECOMENDACIONES WEKA (SIMULACIÓN)
// ==========================================

function generarRecomendaciones() {

    const recomendaciones = [

        "Numb - Linkin Park",
        "In The End - Linkin Park",
        "Believer - Imagine Dragons",
        "Radioactive - Imagine Dragons",
        "Bohemian Rhapsody - Queen",
        "Shape Of You - Ed Sheeran",
        "Blinding Lights - The Weeknd"

    ];

    let recomendacion =
        recomendaciones[
        Math.floor(Math.random() * recomendaciones.length)
        ];

    console.log(
        "🧠 Recomendación WEKA:",
        recomendacion
    );

}

generarRecomendaciones();

// ==========================================
// ESTADÍSTICAS DEL SISTEMA
// ==========================================

const estadisticas = {

    usuarios: 1250,
    canciones: 15000,
    playlists: 450,
    precision: "94%"

};

console.table(estadisticas);

// ==========================================
// FECHA ACTUAL
// ==========================================

const fecha = new Date();

console.log(
    "Fecha:",
    fecha.toLocaleDateString()
);

// ==========================================
// MENSAJE DE BIENVENIDA
// ==========================================

window.onload = function () {

    console.log(
        "Bienvenido a KMusic Intelligence"
    );

};
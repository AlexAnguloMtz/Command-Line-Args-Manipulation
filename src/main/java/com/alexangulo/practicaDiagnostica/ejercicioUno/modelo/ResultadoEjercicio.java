package com.alexangulo.practicaDiagnostica.ejercicioUno.modelo;

public class ResultadoEjercicio {
    private final int suma;
    private final double media;
    private final int mayor;
    private final int menor;

    ResultadoEjercicio(int suma, double media, int mayor, int menor) {
        this.suma = suma;
        this.media = media;
        this.mayor = mayor;
        this.menor = menor;
    }

    public int obtenerSuma() {
        return suma;
    }

    public double obtenerMedia() {
        return media;
    }

    public int obtenerMayor() {
        return mayor;
    }

    public int obtenerMenor() {
        return menor;
    }

}
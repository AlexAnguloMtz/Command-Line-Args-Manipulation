package com.alexangulo.practicaDiagnostica.ejercicioUno.modelo;

import static java.lang.Integer.parseInt;

public class ProcesadorInput {

    public ResultadoEjercicio procesar(String[] input) throws NumberFormatException {
        int suma = 0;
        int mayor = primerValor(input);
        int menor = primerValor(input);

        for(String cadena : input) {
            int entero = parseInt(cadena);
            if(entero > mayor){
                mayor = entero;
            }
            if(entero < menor) {
                menor = entero;
            }
            suma += entero;
        }
        double media = calcularMedia(suma, input);

        return new ResultadoEjercicio(suma, media, mayor, menor);
    }

    private int primerValor(String[] input) {
        return parseInt(input[0]);
    }

    private int calcularMedia(int suma, String[] input) {
        return suma / input.length;
    }

}

package com.alexangulo.practicaDiagnostica.ejercicioUno.aplicacion;

import com.alexangulo.practicaDiagnostica.ejercicioUno.modelo.InterfazUsuario;
import com.alexangulo.practicaDiagnostica.ejercicioUno.modelo.Mensajes;
import com.alexangulo.practicaDiagnostica.ejercicioUno.modelo.ProcesadorInput;
import com.alexangulo.practicaDiagnostica.ejercicioUno.modelo.ResultadoEjercicio;

public class AplicacionEjercicioUno {

    InterfazUsuario interfazUsuario;

    public AplicacionEjercicioUno(InterfazUsuario interfazUsuario) {
        this.interfazUsuario = interfazUsuario;
    }

    public void iniciar(String[] input) {
        if(estaVacio(input)) {
            interfazUsuario.mostrarMensaje(Mensajes.ERROR_INPUT_VACIO);
            return;
        }
        ResultadoEjercicio resultado = calcularResultados(input);
        interfazUsuario.mostrarMensaje(Mensajes.prepararMensajeFinal(resultado));
    }

    private ResultadoEjercicio calcularResultados(String[] input) {
        ResultadoEjercicio resultados = null;
        try {
            resultados = new ProcesadorInput().procesar(input);
        } catch (NumberFormatException excepcion) {
            interfazUsuario.mostrarMensaje(Mensajes.ERROR_INGRESE_SOLO_ENTEROS);
        }
        return resultados;
    }

    private static boolean estaVacio(String[] arreglo) {
        return arreglo.length == 0;
    }

}

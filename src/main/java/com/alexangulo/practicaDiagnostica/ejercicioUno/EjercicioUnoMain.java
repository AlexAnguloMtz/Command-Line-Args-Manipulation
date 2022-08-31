package com.alexangulo.practicaDiagnostica.ejercicioUno;

import com.alexangulo.practicaDiagnostica.ejercicioUno.aplicacion.AplicacionEjercicioUno;
import com.alexangulo.practicaDiagnostica.ejercicioUno.modelo.InterfazUsuario;
import com.alexangulo.practicaDiagnostica.ejercicioUno.vista.InterfazUsuarioLineaDeComandos;

public class EjercicioUnoMain {

    public static void main(String[] args) {
        InterfazUsuario interfazUsuario = new InterfazUsuarioLineaDeComandos();
        AplicacionEjercicioUno ejercicioUno = new AplicacionEjercicioUno(interfazUsuario);
        ejercicioUno.iniciar(args);
    }

}

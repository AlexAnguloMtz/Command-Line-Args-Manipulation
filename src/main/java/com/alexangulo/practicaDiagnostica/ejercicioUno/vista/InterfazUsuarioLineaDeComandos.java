package com.alexangulo.practicaDiagnostica.ejercicioUno.vista;

import com.alexangulo.practicaDiagnostica.ejercicioUno.modelo.InterfazUsuario;

public class InterfazUsuarioLineaDeComandos implements InterfazUsuario {
    @Override
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}

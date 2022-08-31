package com.alexangulo.practicaDiagnostica.ejerciciosDosYTres.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.String.format;

public class VendedorFormatter {

    private static final String FORMATO_FECHA_NACIMIENTO = "MM/dd/yyyy";

    public static String formatearVendedor(Vendedor vendedor) {
        return format(
                "%d %s %s",
                vendedor.obtenerCodigo(),
                vendedor.obtenerNombre(),
                formatearFechaDeNacimiento(vendedor.obtenerFechaDeNacimiento())
        );
    }

    private static String formatearFechaDeNacimiento(Date fechaDeNacimiento) {
        SimpleDateFormat formateador = new SimpleDateFormat(FORMATO_FECHA_NACIMIENTO);
        return formateador.format(fechaDeNacimiento);
    }
}

package com.alexangulo.practicaDiagnostica.ejerciciosDosYTres.modelo;

import java.text.ParseException;
import java.util.Date;

import static java.lang.Integer.parseInt;

public class VendedorCSVMapper {

    private final FechaDeNacimientoParser fechaDeNacimientoParser;

    public VendedorCSVMapper() {
        this.fechaDeNacimientoParser = new FechaDeNacimientoParser();
    }

    public static Vendedor mapearAVendedor(String informacionVendedor) {
        String[] datosVendedor = separarPorComas(informacionVendedor);
        return new Vendedor(
                extraerCodigo(datosVendedor),
                extraerNombre(datosVendedor),
                extraerFechaDeNacimiento(datosVendedor),
                extraerEstado(datosVendedor)
        );
    }

    private static String[] separarPorComas(String informacionVendedor) {
        return informacionVendedor.split(",");
    }

    private static int extraerCodigo(String[] datosVendedor) {
        return parseInt(datosVendedor[0]);
    }

    private static String extraerNombre(String[] datosVendedor) {
        return datosVendedor[1];
    }

    private static Date extraerFechaDeNacimiento(String[] datosVendedor) {
        String fechaDeNacimiento = datosVendedor[2];
        try {
            return new FechaDeNacimientoParser().parsearFechaDeNacimiento(fechaDeNacimiento);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    private static String extraerEstado(String[] datosVendedor) {
        return datosVendedor[3];
    }
}

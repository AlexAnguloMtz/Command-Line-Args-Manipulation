package com.alexangulo.practicaDiagnostica.ejerciciosDosYTres.modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FechaDeNacimientoParser {

    private static final String PATRON_UNO = "MM/dd/yy";
    private static final String PATRON_DOS = "MM/dd/yyyy";

    public Date parsearFechaDeNacimiento(String fechaDeNacimiento) throws ParseException {
        SimpleDateFormat formatoUno = new SimpleDateFormat(PATRON_UNO);
        SimpleDateFormat formatoDos = new SimpleDateFormat(PATRON_DOS);
        try {
            return formatoUno.parse(fechaDeNacimiento);
        } catch (ParseException exepcion) {
            return formatoDos.parse(fechaDeNacimiento);
        }
    }
}

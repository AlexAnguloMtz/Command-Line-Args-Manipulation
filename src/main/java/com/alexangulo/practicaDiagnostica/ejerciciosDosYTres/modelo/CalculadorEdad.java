package com.alexangulo.practicaDiagnostica.ejerciciosDosYTres.modelo;

import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneOffset;
import java.util.Date;

public class CalculadorEdad {
    public int calcularEdad(Date fechaDeNacimiento) {
        Date ahora = new Date();
        OffsetDateTime inicio = fechaDeNacimiento.toInstant().atOffset(ZoneOffset.UTC);
        OffsetDateTime actual = ahora.toInstant().atOffset(ZoneOffset.UTC);
        return Period.between(inicio.toLocalDate(), actual.toLocalDate()).getYears();
    }
}

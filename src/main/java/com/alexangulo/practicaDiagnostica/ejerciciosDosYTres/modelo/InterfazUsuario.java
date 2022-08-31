package com.alexangulo.practicaDiagnostica.ejerciciosDosYTres.modelo;


import java.util.Collection;
import java.util.Map;

public interface InterfazUsuario {
    void mostrarReporteEjercicioDos(Collection<String> reporteFinal);

    void mostrarReporteEjercicioTres(Map<String, Integer> vendedoresPorEstado);
}

package com.alexangulo.practicaDiagnostica.ejerciciosDosYTres.modelo;

import java.util.List;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;

public class ProcesadorCSV {
    public List<Vendedor> extraerVendedores(List<String> lineas, Predicate<Vendedor> filtro) {

        // Eliminamos la primera linea del archivo ya que es una linea que en este momento no necesitamos
        List<String> lineasValidas = removerPrimeraLinea(lineas);

        return lineasValidas.stream()
                .map(VendedorCSVMapper::mapearAVendedor)
                .filter(filtro)
                .collect(toList());
    }

    private List<String> removerPrimeraLinea(List<String> lineas) {
        return lineas.subList(1, lineas.size());
    }

}

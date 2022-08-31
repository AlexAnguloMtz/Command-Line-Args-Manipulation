package com.alexangulo.practicaDiagnostica.ejerciciosDosYTres.modelo;

import java.util.Collection;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class GeneradorVendedoresConFormato {

    public List<String> formatearVendedores(Collection<? extends Vendedor> vendedores) {
        return vendedores.stream()
                .map(VendedorFormatter::formatearVendedor)
                .collect(toList());
    }
}

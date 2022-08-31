package com.alexangulo.practicaDiagnostica.ejerciciosDosYTres.modelo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ExtractorVendedoresPorEstado {
    public Map<String, Integer> extraerVendedoresPorEstado(Collection<? extends Vendedor> vendedores) {
        var vendedoresPorEstado = new HashMap<String, Integer>();
        for(Vendedor vendedor : vendedores) {
            String estado = vendedor.obtenerEstado();
            if(vendedoresPorEstado.containsKey(estado)) {
                Integer cantidadPrevia = vendedoresPorEstado.get(estado);
                vendedoresPorEstado.put(estado, cantidadPrevia + 1);
            }
            else {
                vendedoresPorEstado.put(estado, 1);
            }
        }
        return vendedoresPorEstado;
    }
}

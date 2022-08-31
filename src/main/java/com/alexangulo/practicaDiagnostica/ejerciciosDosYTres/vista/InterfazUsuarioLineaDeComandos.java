package com.alexangulo.practicaDiagnostica.ejerciciosDosYTres.vista;


import com.alexangulo.practicaDiagnostica.ejerciciosDosYTres.modelo.InterfazUsuario;
import com.alexangulo.practicaDiagnostica.ejerciciosDosYTres.modelo.Vendedor;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class InterfazUsuarioLineaDeComandos implements InterfazUsuario {
    @Override
    public void mostrarReporteEjercicioDos(Collection<String> reporte) {
        System.out.printf("\n Vendedores mayores de %d anios \n\n", Vendedor.EDAD_MINIMA);
        reporte.forEach(System.out::println);
    }

    @Override
    public void mostrarReporteEjercicioTres(Map<String, Integer> vendedoresPorEstado) {
        System.out.println("\nVendedores por estado:");
        vendedoresPorEstado.entrySet().stream()
                .forEach(this::mostrarEstadoConSuCantidadDeVendedores);
    }

    private void mostrarEstadoConSuCantidadDeVendedores(Entry<String, Integer> entradaEstadoVendedores) {
        System.out.printf("\n%s %d", entradaEstadoVendedores.getKey(), entradaEstadoVendedores.getValue());
    }

}

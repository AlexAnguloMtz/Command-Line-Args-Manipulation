package com.alexangulo.practicaDiagnostica.ejerciciosDosYTres.aplicacion;

import com.alexangulo.practicaDiagnostica.ejerciciosDosYTres.modelo.ExtractorVendedoresPorEstado;
import com.alexangulo.practicaDiagnostica.ejerciciosDosYTres.modelo.InterfazUsuario;
import com.alexangulo.practicaDiagnostica.ejerciciosDosYTres.modelo.ProcesadorCSV;
import com.alexangulo.practicaDiagnostica.ejerciciosDosYTres.modelo.Vendedor;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

import static java.util.stream.Collectors.toMap;

public class AplicacionEjercicioTres {

    private final InterfazUsuario interfazUsuario;

    public AplicacionEjercicioTres(InterfazUsuario interfazUsuario) {
        this.interfazUsuario = interfazUsuario;
    }

    public void iniciar(Supplier<File> proveedorDeArchivo,
                        Function<File, List<String>> lectorArchivo) {

        // Leemos el archivo
        List<String> lineasArchivo = lectorArchivo.apply(proveedorDeArchivo.get());

        // Extraemos todos los vendedores, utilizando un Predicate que siempre devuelve true
        List<Vendedor> vendedores = new ProcesadorCSV().extraerVendedores(lineasArchivo, (vendedor) -> true);

        // Extraemos la cantidad de vendedores en cada estado del pais
        Map<String, Integer> vendedoresPorEstado = extraerVendedoresPorEstado(vendedores);

        // Enviamos a nuestra interfaz de usuario
        interfazUsuario.mostrarReporteEjercicioTres(vendedoresPorEstado);

    }

    private Map<String, Integer> extraerVendedoresPorEstado(List<Vendedor> vendedores) {
        return new ExtractorVendedoresPorEstado().extraerVendedoresPorEstado(vendedores);
    }

}


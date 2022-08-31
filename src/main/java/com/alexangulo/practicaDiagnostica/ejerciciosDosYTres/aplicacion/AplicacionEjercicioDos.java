package com.alexangulo.practicaDiagnostica.ejerciciosDosYTres.aplicacion;

import com.alexangulo.practicaDiagnostica.ejerciciosDosYTres.modelo.GeneradorVendedoresConFormato;
import com.alexangulo.practicaDiagnostica.ejerciciosDosYTres.modelo.InterfazUsuario;
import com.alexangulo.practicaDiagnostica.ejerciciosDosYTres.modelo.ProcesadorCSV;
import com.alexangulo.practicaDiagnostica.ejerciciosDosYTres.modelo.Vendedor;

import java.io.File;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class AplicacionEjercicioDos {

    private final InterfazUsuario interfazUsuario;

    public AplicacionEjercicioDos(InterfazUsuario interfazUsuario) {
        this.interfazUsuario = interfazUsuario;
    }

    public void iniciar(Supplier<File> proveedorDeArchivo,
                        Function<File, List<String>> lectorArchivo) {

        // Leemos el archivo apoyandonos de interfaces funcionales
        List<String> lineasArchivo = lectorArchivo.apply(proveedorDeArchivo.get());

        // Extraemos los vendedores, filtrando solo aquellos que nos interesan con un Predicate.
        // La misma clase Vendedor encapsula quien es elegible y quien no
        List<Vendedor> vendedores = new ProcesadorCSV().extraerVendedores(lineasArchivo, Vendedor::esElegible);

        // Damos formato para salida
        List<String> vendedoresConFormato = new GeneradorVendedoresConFormato().formatearVendedores(vendedores);

        // Enviamos a nuestra interfaz de usuario
        interfazUsuario.mostrarReporteEjercicioDos(vendedoresConFormato);

    }

}
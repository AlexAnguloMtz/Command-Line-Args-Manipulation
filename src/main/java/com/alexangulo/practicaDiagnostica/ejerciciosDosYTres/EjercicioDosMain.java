package com.alexangulo.practicaDiagnostica.ejerciciosDosYTres;

import com.alexangulo.practicaDiagnostica.ejerciciosDosYTres.infraestructura.LectorArchivo;
import com.alexangulo.practicaDiagnostica.ejerciciosDosYTres.infraestructura.ProveedorArchivo;
import com.alexangulo.practicaDiagnostica.ejerciciosDosYTres.aplicacion.AplicacionEjercicioDos;
import com.alexangulo.practicaDiagnostica.ejerciciosDosYTres.modelo.InterfazUsuario;
import com.alexangulo.practicaDiagnostica.ejerciciosDosYTres.vista.InterfazUsuarioLineaDeComandos;

import java.io.File;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class EjercicioDosMain {

    private static final String NOMBRE_ARCHIVO = "vendors-data.csv";

    public static void main(String[] args) {

        InterfazUsuario interfazUsuario = new InterfazUsuarioLineaDeComandos();
        AplicacionEjercicioDos ejercicioDos = new AplicacionEjercicioDos(interfazUsuario);

        Supplier<File> proveedorDeArchivo = new ProveedorArchivo(NOMBRE_ARCHIVO);
        Function<File, List<String>> lectorDeArchivo = new LectorArchivo();

        ejercicioDos.iniciar(proveedorDeArchivo, lectorDeArchivo);

    }

}

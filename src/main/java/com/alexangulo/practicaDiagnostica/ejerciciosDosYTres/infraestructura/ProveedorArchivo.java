package com.alexangulo.practicaDiagnostica.ejerciciosDosYTres.infraestructura;

import java.io.File;
import java.util.function.Supplier;

public class ProveedorArchivo implements Supplier<File> {

    private final String nombreArchivo;

    public ProveedorArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    @Override
    public File get() {
        ClassLoader classLoader = getClass().getClassLoader();
        return new File(classLoader.getResource(nombreArchivo).getFile());
    }
}

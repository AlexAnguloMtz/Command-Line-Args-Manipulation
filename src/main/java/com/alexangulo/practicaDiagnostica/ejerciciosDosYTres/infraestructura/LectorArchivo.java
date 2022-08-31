package com.alexangulo.practicaDiagnostica.ejerciciosDosYTres.infraestructura;

import java.io.*;
import java.util.List;
import java.util.function.Function;

import static java.util.stream.Collectors.toList;

public class LectorArchivo implements Function<File, List<String>> {

    @Override
    public List<String> apply(File archivo) {
        try {
            return leer(archivo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<String> leer(File archivo) throws IOException {
        try(var bufferedReader = new BufferedReader(new FileReader(archivo))) {
            return leerLineas(bufferedReader);
        }
    }

    private List<String> leerLineas(BufferedReader bufferedReader) throws IOException {
        return bufferedReader.lines()
                .collect(toList());
    }


}

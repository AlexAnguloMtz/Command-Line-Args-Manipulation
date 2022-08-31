package com.alexangulo.practicaDiagnostica.ejercicioUno.modelo;

import static java.lang.String.format;

public class Mensajes {

    public static final String ERROR_INPUT_VACIO =
            "Error. No ingresaste ningun entero. Reinicia el programa.";

    public static final String ERROR_INGRESE_SOLO_ENTEROS =
            "Error. Favor de ingresar unicamente enteros. Reinicia el programa.";

    public static String prepararMensajeFinal(ResultadoEjercicio resultado) {
        return format(
                "Suma: %d \n" +
                "Media: %4f \n" +
                "Mayor: %d \n" +
                "Menor: %d",
                resultado.obtenerSuma(),
                resultado.obtenerMedia(),
                resultado.obtenerMayor(),
                resultado.obtenerMenor()
        );
    }

}

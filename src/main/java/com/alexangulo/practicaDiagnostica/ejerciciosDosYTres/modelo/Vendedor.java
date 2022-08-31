package com.alexangulo.practicaDiagnostica.ejerciciosDosYTres.modelo;

import java.util.Date;

public class Vendedor {

    public static final int EDAD_MINIMA = 30;
    private final int codigo;
    private final String nombre;
    private final Date fechaDeNacimiento;
    private final CalculadorEdad calculadorEdad;

    private final String estado;

    public Vendedor(int codigo, String nombre, Date fechaDeNacimiento, String estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.estado = estado;
        this.calculadorEdad = new CalculadorEdad();
    }

    public static boolean esElegible(Vendedor vendedor) {
        return vendedor.obtenerEdad() > EDAD_MINIMA;
    }

    public int obtenerCodigo() {
        return codigo;
    }

    public int obtenerEdad() {
        return calculadorEdad.calcularEdad(fechaDeNacimiento);
    }

    public String obtenerNombre() {
        return nombre;
    }

    public Date obtenerFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public String obtenerEstado() {
        return estado;
    }
}

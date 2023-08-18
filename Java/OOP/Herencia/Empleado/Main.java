package org.example.Herencia.Empleado;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("María", 50000, "Ventas");
        Trabajador trabajador = new Trabajador("Juan", 30000, "Ensamblaje");

        gerente.trabajar();
        gerente.planificar();

        System.out.println();

        trabajador.trabajar();
        trabajador.reportar();
    }
}
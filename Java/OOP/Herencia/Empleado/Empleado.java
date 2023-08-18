package org.example.Herencia.Empleado;

class Empleado {
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void trabajar() {
        System.out.println("El empleado " + nombre + " está trabajando.");
    }
}


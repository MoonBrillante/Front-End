package org.example.Herencia.Empleado;

class Trabajador extends Empleado {
    private String tareaPrincipal;

    public Trabajador(String nombre, double salario, String tareaPrincipal) {
        super(nombre, salario);
        this.tareaPrincipal = tareaPrincipal;
    }

    public String getTareaPrincipal() {
        return tareaPrincipal;
    }

    @Override
    public void trabajar() {
        System.out.println("El trabajador " + getNombre() + " está realizando la tarea " + tareaPrincipal + ".");
    }

    public void reportar() {
        System.out.println("El trabajador " + getNombre() + " está reportando su progreso.");
    }
}

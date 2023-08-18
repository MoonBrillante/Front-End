package org.example.Herencia.Empleado;

class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public void trabajar() {
        System.out.println("El gerente " + getNombre() + " está supervisando el departamento " + departamento + ".");
    }

    public void planificar() {
        System.out.println("El gerente " + getNombre() + " está planificando estrategias.");
    }
}


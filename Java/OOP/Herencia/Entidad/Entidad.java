package org.example.Herencia.Entidad;

class Entidad {
    private String nombre;

    public Entidad(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarInfo() {
        System.out.println("Entidad: " + nombre);
    }
}

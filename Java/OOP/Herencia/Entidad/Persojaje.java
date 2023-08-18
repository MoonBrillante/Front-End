package org.example.Herencia.Entidad;

class Personaje extends Entidad {
    private int nivel;

    public Personaje(String nombre, int nivel) {
        super(nombre);
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Nivel: " + nivel);
    }
}
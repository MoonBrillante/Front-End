package org.example.Herencia.Entidad;

class Enemigo extends Entidad {
    private int puntosDeVida;

    public Enemigo(String nombre, int puntosDeVida) {
        super(nombre);
        this.puntosDeVida = puntosDeVida;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Puntos de Vida: " + puntosDeVida);
    }
}

package org.example.Herencia.Animal;

class Reptil extends Animal {
    private boolean esColdBlooded;

    public Reptil(String nombre, boolean esColdBlooded) {
        super(nombre);
        this.esColdBlooded = esColdBlooded;
    }

    public boolean esColdBlooded() {
        return esColdBlooded;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El reptil emite un siseo.");
    }
}

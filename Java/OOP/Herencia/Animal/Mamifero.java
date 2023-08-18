package org.example.Herencia.Animal;

class Mamifero extends Animal {
    private boolean tienePelo;

    public Mamifero(String nombre, boolean tienePelo) {
        super(nombre);
        this.tienePelo = tienePelo;
    }

    public boolean tienePelo() {
        return tienePelo;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El mamífero hace un sonido característico.");
    }
}
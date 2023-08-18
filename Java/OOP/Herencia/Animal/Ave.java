package org.example.Herencia.Animal;

class Ave extends Animal {
    private boolean puedeVolar;

    public Ave(String nombre, boolean puedeVolar) {
        super(nombre);
        this.puedeVolar = puedeVolar;
    }

    public boolean puedeVolar() {
        return puedeVolar;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El ave emite un canto melódico.");
    }
}

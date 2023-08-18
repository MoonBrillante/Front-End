package org.example.Herencia.Entidad;

class Item extends Entidad {
    private String tipo;

    public Item(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: " + tipo);
    }
}

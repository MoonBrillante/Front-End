package org.example.Herencia.Dispositivo;

class Telefono extends Dispositivo {
    private String numero;

    public Telefono(String marca, String modelo, String numero) {
        super(marca, modelo);
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }
}
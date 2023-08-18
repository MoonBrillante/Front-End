package org.example.Herencia.Dispositivo;

class Tableta extends Dispositivo {
    private String sistemaOperativo;

    public Tableta(String marca, String modelo, String sistemaOperativo) {
        super(marca, modelo);
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }
}

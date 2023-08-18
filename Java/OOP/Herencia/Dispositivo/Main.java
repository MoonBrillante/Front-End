package org.example.Herencia.Dispositivo;

public class Main {
    public static void main(String[] args) {
        Telefono telefono = new Telefono("Samsung", "Galaxy S21", "123-456-7890");
        Tableta tableta = new Tableta("Apple", "iPad Pro", "iOS");

        System.out.println("Detalles del Teléfono:");
        telefono.mostrarDetalles();
        System.out.println("Número: " + telefono.getNumero());

        System.out.println("\nDetalles de la Tableta:");
        tableta.mostrarDetalles();
        System.out.println("Sistema Operativo: " + tableta.getSistemaOperativo());
    }
}
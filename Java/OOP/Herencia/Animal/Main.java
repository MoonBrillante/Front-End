package org.example.Herencia.Animal;

public class Main {
    public static void main(String[] args) {
        Mamifero perro = new Mamifero("Perro", true);
        Ave aguila = new Ave("Aguila", true);
        Reptil serpiente = new Reptil("Serpiente", true);

        System.out.println("Detalles del Mamífero:");
        System.out.println("Nombre: " + perro.getNombre());
        System.out.println("Tiene pelo: " + perro.tienePelo());
        perro.hacerSonido();

        System.out.println("\nDetalles del Ave:");
        System.out.println("Nombre: " + aguila.getNombre());
        System.out.println("Puede volar: " + aguila.puedeVolar());
        aguila.hacerSonido();

        System.out.println("\nDetalles del Reptil:");
        System.out.println("Nombre: " + serpiente.getNombre());
        System.out.println("Es de sangre fría: " + serpiente.esColdBlooded());
        serpiente.hacerSonido();
    }
}

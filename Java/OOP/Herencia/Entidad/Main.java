package org.example.Herencia.Entidad;

public class Main {
    public static void main(String[] args) {
        Personaje jugador = new Personaje("Héroe", 5);
        Enemigo monstruo = new Enemigo("Dragón", 100);
        Item espada = new Item("Espada de Fuego", "Arma");

        jugador.mostrarInfo();
        monstruo.mostrarInfo();
        espada.mostrarInfo();
    }
}

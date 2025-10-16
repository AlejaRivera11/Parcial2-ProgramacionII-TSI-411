package com.uniajc;

public class Main {
    public static void main(String[] args) {
        //Mensaje inicial de la interfaz de simulación de batalla
        System.out.println("Simulación de Batalla entre Criaturas");

        //Crear armas para los participantes de las batallas
        Arma espada = new Arma("Espada", 15);
        Arma baston = new Arma("Baston Magico", 20);
        Arma garras = new Arma("Garras Afiladas", 10);

        // Crear criaturas participantes
        Criatura guerrero = new Guerrero("Guerrero", 100, 10);
        Dragon dragon = new Dragon("Dragón", 150, 25, "Dura", garras);
        Mago mago = new Mago("Mago", 80, 5, "Bola de Fuego");

        //equipar armas a las criaturas
        guerrero.equiparArma(espada);
        dragon.equiparArma(garras);
        mago.equiparArma(baston);

        //Mostrar criaturas iniciales
        System.out.println("\nCriaturas creadas:");
        System.out.println(guerrero.getNombre() + " - Salud: " + guerrero.getSalud());
        System.out.println(dragon.getNombre() + " - Salud: " + dragon.getSalud());
        System.out.println(mago.getNombre() + " - Salud: " + mago.getSalud());
        System.out.println("\n-------------------------------\n");

        // Simular batallas
        
        //Batalla 1: Guerrero vs Dragón
        System.out.println("Batalla 1: Guerrero vs Dragón");
        Batalla.simular(guerrero, dragon);
        System.out.println("\n-------------------------------\n");

        //Batalla 2: Mago vs Dragón
        System.out.println("Batalla 2: Mago vs Dragón");
        Batalla.simular(mago, dragon);
        System.out.println("\n-------------------------------\n");

        //Mensaje final de la interfaz de simulación de batalla
        System.out.println("Fin de la simulación de batalla.");
        
    }
}
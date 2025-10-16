package com.uniajc;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Simulación de Batalla entre Criaturas");

        //Crear armas
        Arma espada = new Arma("Espada", 15);
        Arma baston = new Arma("Baston Magico", 20);
        Arma garras = new Arma("Garras Afiladas", 10);

        // Crear criaturas
        Criatura guerrero = new Guerrero("Guerrero", 100, 10);
        Dragon dragon = new Dragon("Dragón", 150, 25, "Dura", garras);
        Mago mago = new Mago("Mago", 80, 5, "Bola de Fuego");

        //equipar armas
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
        System.out.println("Batalla 1: Guerrero vs Dragón");
        Batalla.simular(guerrero, dragon);
        System.out.println("\n-------------------------------\n");
        System.out.println("Batalla 2: Mago vs Dragón");
        Batalla.simular(mago, dragon);
        System.out.println("\n-------------------------------\n");
             
        System.out.println("Fin de la simulación de batalla.");
        
    }
}
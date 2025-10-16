package com.uniajc;

public class Batalla {

    public static void simular(Criatura criatura1, Criatura criatura2){
        // Simulación simple de batalla entre dos criaturas
        System.out.println("La batalla comienza entre " + criatura1.getNombre() + " y " + criatura2.getNombre() + "!");
        // Mientras ambas criaturas tengan salud, se atacan mutuamente
        while (criatura1.getSalud() > 0 && criatura2.getSalud() > 0) {
            criatura1.atacar(criatura2);
            if (criatura2.getSalud() <= 0) {// Si la criatura2 muere, termina la batalla
                System.out.println(criatura2.getNombre() + " ha sido derrotado!");
                break;
            }
            criatura2.atacar(criatura1);
            if (criatura1.getSalud() <= 0) {// Si la criatura1 muere, termina la batalla
                System.out.println(criatura1.getNombre() + " ha sido derrotado!");
                break;
            }
        }
        // Mensaje final de la batalla
        System.out.println("La batalla ha terminado.");
    }
    
}

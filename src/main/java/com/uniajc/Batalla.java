package com.uniajc;

public class Batalla {

    public static void simular(Criatura criatura1, Criatura criatura2){
        System.out.println("La batalla comienza entre " + criatura1.getNombre() + " y " + criatura2.getNombre() + "!");
        while (criatura1.getSalud() > 0 && criatura2.getSalud() > 0) {
            criatura1.atacar(criatura2);
            if (criatura2.getSalud() <= 0) {
                System.out.println(criatura2.getNombre() + " ha sido derrotado!");
                break;
            }
            criatura2.atacar(criatura1);
            if (criatura1.getSalud() <= 0) {
                System.out.println(criatura1.getNombre() + " ha sido derrotado!");
                break;
            }
        }
        System.out.println("La batalla ha terminado.");
    }
    
}

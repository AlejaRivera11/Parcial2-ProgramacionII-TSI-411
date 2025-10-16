package com.uniajc;

public class Mago extends Criatura implements Magico {
    // Atributos específicos del Mago
    private String hechizo; 
    // Constructor
    public Mago(String nombre, int salud, int fuerza, String hechizo) {
        super(nombre, salud, fuerza);
        this.hechizo = hechizo;
    }

    @Override
    public void atacar(Criatura objetivo) {// El mago ataca lanzando un hechizo
    int daño = fuerza;

    if (arma != null) {// Si el mago tiene un arma equipada, añade su daño adicional
        daño = daño + arma.atacarConArma(objetivo);
    }

    if (hechizo == null) {// Si el mago no conoce ningún hechizo, ataca con magia básica
        System.out.println(nombre + " ataca con magia básica y causa " + daño + " de daño a " + objetivo.nombre);
    } else {// Si el mago conoce un hechizo, lo usa para atacar
        System.out.println(nombre + " lanza el hechizo " + hechizo + " y causa " + daño + " de daño a " + objetivo.nombre);
    }

    objetivo.defender(daño);// El objetivo defiende contra el ataque
}

    @Override
    public void defender(int daño) {// El mago recibe daño directamente
        salud -= daño;
        System.out.println(nombre + " recibe " + daño + " de daño. Salud restante: " + salud + ".");
    }

    @Override
    public void lanzarHechizo() {// El mago lanza su hechizo
        if (hechizo == null) {// Si no conoce ningún hechizo
            System.out.println(nombre + " intenta lanzar un hechizo, pero no conoce ninguno.");
        } else {// Si conoce un hechizo
            System.out.println(nombre + " lanza su hechizo: " + hechizo + "!");
        }
    }

    @Override
    public void aprenderHechizo() {// El mago aprende un nuevo hechizo
        this.hechizo = " Lluvia Infernal !!!!"; 
        System.out.println(nombre + " ha aprendido el hechizo de : " + hechizo);
    }





}

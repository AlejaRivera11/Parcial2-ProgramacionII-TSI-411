package com.uniajc;

public class Mago extends Criatura implements Magico {
    private String hechizo; 

    public Mago(String nombre, int salud, int fuerza, String hechizo) {
        super(nombre, salud, fuerza);
        this.hechizo = hechizo;
    }

    @Override
    public void atacar(Criatura objetivo) {
    int daño = fuerza;

    if (arma != null) {
        daño = daño + arma.atacarConArma(objetivo);
    }

    if (hechizo == null) {
        System.out.println(nombre + " ataca con magia básica y causa " + daño + " de daño a " + objetivo.nombre);
    } else {
        System.out.println(nombre + " lanza el hechizo " + hechizo + " y causa " + daño + " de daño a " + objetivo.nombre);
    }

    objetivo.defender(daño);
}

    @Override
    public void defender(int daño) {
        salud -= daño;
        System.out.println(nombre + " recibe " + daño + " de daño. Salud restante: " + salud + ".");
    }

    @Override
    public void lanzarHechizo() {
        if (hechizo == null) {
            System.out.println(nombre + " intenta lanzar un hechizo, pero no conoce ninguno.");
        } else {
            System.out.println(nombre + " lanza su hechizo: " + hechizo + "!");
        }
    }

    @Override
    public void aprenderHechizo() {
        this.hechizo = " Lluvia Infernal !!!!"; 
        System.out.println(nombre + " ha aprendido el hechizo de : " + hechizo);
    }





}

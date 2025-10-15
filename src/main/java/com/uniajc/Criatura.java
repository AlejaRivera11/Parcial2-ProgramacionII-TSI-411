package com.uniajc;

abstract class Criatura {
    protected String nombre;
    protected int salud;
    protected int fuerza;
    protected Arma arma;

    public Criatura(String nombre, int salud, int fuerza) {
        this.nombre = nombre;
        this.salud = salud;
        this.fuerza = fuerza;
    }

    public abstract void atacar(Criatura objetivo);
    public abstract void defender(int daño);


    public boolean estaViva() {
        return this.salud > 0;
    }

    public void equiparArma(Arma arma) {
        this.arma = arma;
        System.out.println(nombre + " ha equipado el arma: " + arma.getNombre());
    }

    public void desequiparArma() {
        System.out.println(nombre + " ha dejado su arma.");
        this.arma = null;
    }

}   
package com.uniajc;

public class Guerrero extends Criatura {
    //metodo constructor
    public Guerrero(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }
    @Override
    // Implementación del método atacar
    public void atacar(Criatura objetivo) {
        int daño = this.fuerza;
        if (this.arma != null) daño += this.arma.getDañoAdicional();
        objetivo.defender(daño);
        System.out.println(this.nombre + " ataca a " + objetivo.nombre + " causando " + daño + " de daño.");
    }
    @Override
    // Implementación del método defender
    public void defender(int daño) {
        this.salud -= daño;
        System.out.println(this.nombre + " recibe " + daño + " de daño. Salud restante: " + this.salud);
    }
    
}
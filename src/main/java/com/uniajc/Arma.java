package com.uniajc;

public class Arma {
    
    private String nombre;
    private int dañoAdicional;
    //constructor
    public Arma(String nombre, int dañoAdicional) {
        this.nombre = nombre;
        this.dañoAdicional = dañoAdicional;
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDañoAdicional(int dañoAdicional) {
        this.dañoAdicional = dañoAdicional;
    }


    //método para atacar con el arma
    public int atacarConArma(Criatura objetivo) {
        return dañoAdicional;
    }
    //getter para dañoAdicional
    public int getDañoAdicional() {
        return dañoAdicional;
    }

    
}

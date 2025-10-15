package com.uniajc;

public class Arma {
    
    private String nombre;
    private int dañoAdicional;

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



    public int atacarConArma(Criatura objetivo) {
        return dañoAdicional;
    }
    public int getDañoAdicional() {
        return dañoAdicional;
    }

    
}

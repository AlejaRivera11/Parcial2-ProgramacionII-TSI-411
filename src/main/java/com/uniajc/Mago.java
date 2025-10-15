package com.uniajc;

import java.util.List;

public class Mago extends Criatura implements Magico {
    private List<String> hechizos;
    
    public Mago(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
        this.hechizos = new ArrayList<>();
    }

    @Override
    public void lanzarHechizo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'lanzarHechizo'");
    }

    @Override
    public void aprenderHechizo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'aprenderHechizo'");
    }

    @Override
    public void atacar(Criatura objetivo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atacar'");
    }

    @Override
    public void defender(int daño) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'defender'");
    }
}

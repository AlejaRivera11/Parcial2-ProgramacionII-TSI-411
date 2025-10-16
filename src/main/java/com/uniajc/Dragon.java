package com.uniajc;

public class Dragon extends Criatura implements volador {
    // Atributos específicos del Dragón
    private String escamas;
    private Arma arma;
    // Constructor
    public Dragon(String nombre, int salud, int fuerza, String escamas, Arma arma) {
        super(nombre, salud, fuerza);
        this.escamas = escamas;
        this.arma = arma;
    }

    
    @Override
    public void atacar(Criatura objetivo) {// El dragón ataca lanzando una llamarada
        int daño = fuerza * 2;
        if (arma != null) {
            daño += arma.getDañoAdicional();
        }
        System.out.println(nombre + " lanza una llamarada y causa " + daño + " de daño a " + objetivo.nombre);
        objetivo.defender(daño);
    }

    @Override
    public void volar() {// El dragón vuela
        System.out.println(nombre + " está volando alto por los cielos.");
    }

    @Override
    public void aterrizar() {// El dragón aterriza
        System.out.println(nombre + " aterriza con fuerza en el suelo.");
    }
    
    @Override
    public void defender(int daño) {// El dragón reduce el daño recibido según el tipo de escamas
        int reduccion = 0;
        // Lógica simple para reducción de daño basada en el tipo de escamas
        if (escamas.equalsIgnoreCase("Dura")) {
            reduccion = 5;
        } else if (escamas.equalsIgnoreCase("Media")) {
            reduccion = 2;
        }

        int dañoFinal = daño - reduccion;
        if (dañoFinal < 0) dañoFinal = 0;

        salud -= dañoFinal;// Reducir la salud del dragón
        System.out.println(nombre + " tiene escamas " + escamas.toLowerCase() + 
        " y recibe " + dañoFinal + " de daño. Su salud restante: " + salud);// Mostrar salud restante
    }



    
    

}

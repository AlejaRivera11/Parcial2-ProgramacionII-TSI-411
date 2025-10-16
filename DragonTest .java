package com.uniajc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DragonTest {

    private Dragon dragon;
    private Guerrero guerrero;

    @BeforeEach
    void prepararDatos() {
        // Creamos un dragón y un guerrero
        dragon = new Dragon("Smaug", 100, 20, "dura");
        guerrero = new Guerrero("Leonidas", 60, 10);
    }

    @Test
    void probarAtaqueDelDragonAlGuerrero() {
        int saludAntes = guerrero.getSalud();

        // El dragón ataca
        dragon.atacar(guerrero);

        // Revisamos que el guerrero haya perdido salud
        assertTrue(guerrero.getSalud() < saludAntes);
    }

    @Test
    void probarQueDragonDefiendeConEscamas() {
        int saludAntes = dragon.getSalud();

        // El dragón recibe un ataque
        dragon.defender(15);

        // Verificamos que haya perdido algo de salud (dependiendo de sus escamas)
        assertTrue(dragon.getSalud() < saludAntes);
    }

    @Test
    void probarQueDragonPuedeVolarYAterrizar() {
        // Como el dragón puede volar, probamos los métodos de la interfaz
        dragon.volar();
        dragon.aterrizar();

        // Solo verificamos que el programa no falle al usar estos métodos
        assertTrue(true);
    }
}
package com.uniajc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DragonTest {

    @Test
    void probarAtaqueDelDragonAlGuerrero() {
        // Creamos un dragón y un guerrero
        Dragon dragon = new Dragon("Drag", 100, 20, "dura");
        Guerrero guerrero = new Guerrero("Matias", 60, 10);

        int saludAntes = guerrero.getSalud();

        // El dragón ataca
        dragon.atacar(guerrero);

        // Revisamos que el guerrero haya perdido salud
        assertTrue(guerrero.getSalud() < saludAntes);
    }

    @Test
    void probarQueDragonDefiendeConEscamas() {
        // Creamos un dragón
        Dragon dragon = new Dragon("Drag", 100, 20, "dura");

        int saludAntes = dragon.getSalud();

        // El dragón recibe daño
        dragon.defender(15);

        // Verificamos que haya perdido algo de salud
        assertTrue(dragon.getSalud() < saludAntes);
    }

    @Test
    void probarQueDragonPuedeVolarYAterrizar() {
        // Creamos un dragón
        Dragon dragon = new Dragon("Drag", 100, 20, "dura");

        // Probamos que pueda volar y aterrizar sin errores
        dragon.volar();
        dragon.aterrizar();

        assertTrue(true);
    }
}

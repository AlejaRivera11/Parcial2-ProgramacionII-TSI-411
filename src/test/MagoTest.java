package com.uniajc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MagoTest {

    @Test
    public void probarAtaqueDelMagoAlGuerrero() {
        // Se crean las criaturas
        Mago mago = new Mago("Merlin", 80, 15, "Bola de fuego");
        Guerrero guerrero = new Guerrero("Thor", 100, 20);

        // Guardamos la salud antes del ataque
        int saludAntes = guerrero.getSalud();

        // El mago ataca
        mago.atacar(guerrero);

        // Revisamos que el guerrero haya perdido salud
        assertTrue(guerrero.getSalud() < saludAntes);
    }

    @Test
    public void probarQueElMagoTieneSuHechizo() {
        // Creamos un mago con su hechizo
        Mago mago = new Mago("Merlin", 80, 15, "Bola de fuego");

        // Revisamos que el hechizo sea el mismo que le pusimos
        assertEquals("Bola de fuego", mago.getHechizo());
    }
}
package com.uniajc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArmaTest {

    @Test
    public void testCrearArma() {
        // Creamos un arma y verificar sus atributos
        Arma arma = new Arma("Espada", 10);

        assertNotNull(arma, "El objeto arma no debe ser nulo");
        assertEquals("Espada", arma.getNombre(), "El nombre del arma debe ser 'Espada'");
        assertEquals(10, arma.getPoder(), "El poder del arma debe ser 10");
    }

    @Test
    public void testArmaEquipadaAumentaAtaque() {
        // Creamos un guerrero y arma
        Guerrero guerrero = new Guerrero("Thor", 100, 20);
        Arma espada = new Arma("Espada", 10);

        // Equipamos un arma
        guerrero.equiparArma(espada);

        // Verificar que el ataque aumente correctamente
        int ataqueEsperado = 30;
        assertEquals(ataqueEsperado, guerrero.getAtaque(),
        "El ataque del guerrero debe aumentar al equipar el arma");
    }
}
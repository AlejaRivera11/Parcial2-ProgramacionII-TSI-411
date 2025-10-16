package com.uniajc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GuerreroTest {

    private Guerrero guerrero;
    private Mago mago;
    private Arma espada;

    @BeforeEach
    void prepararDatos() {
        // Creamos un guerrero, un mago y un arma
        guerrero = new Guerrero("Conan", 50, 10);
        mago = new Mago("Gandalf", 40, 8);
        espada = new Arma("Espada corta", 5);

        // Le ponemos el arma al guerrero
        guerrero.equiparArma(espada);
    }

    @Test
    void probarAtaqueDelGuerreroAlMago() {
        int saludAntes = mago.getSalud();

        // El guerrero ataca
        guerrero.atacar(mago);

        // Revisamos que el mago haya perdido salud
        assertTrue(mago.getSalud() < saludAntes);
    }

    @Test
    void probarQueElGuerreroPierdeSaludAlDefender() {
        int saludAntes = guerrero.getSalud();

        // El guerrero recibe daño
        guerrero.defender(8);

        // Verificamos que ahora tenga menos salud
        assertTrue(guerrero.getSalud() < saludAntes);
    }

    @Test
    void probarQueConArmaHaceMasDaño() {
        // Creamos otro guerrero sin arma
        Guerrero sinArma = new Guerrero("Soldado", 50, 10);
        Mago enemigo = new Mago("Hechicero", 40, 8);

        // Calculamos daño sin arma
        int saludAntes = enemigo.getSalud();
        sinArma.atacar(enemigo);
        int dañoSinArma = saludAntes - enemigo.getSalud();

        // Reiniciamos enemigo
        enemigo = new Mago("Hechicero", 40, 8);
        saludAntes = enemigo.getSalud();

        // Ahora atacamos con el guerrero que sí tiene arma
        guerrero.atacar(enemigo);
        int dañoConArma = saludAntes - enemigo.getSalud();

        // Comprobamos que el daño con arma sea mayor
        assertTrue(dañoConArma > dañoSinArma);
    }
}
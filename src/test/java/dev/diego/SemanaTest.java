package dev.diego;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SemanaTest {
    private Semana semana;

    @BeforeEach
    public void setUp() {
        semana = new Semana();
        semana.crearDiasDeLaSemana();
    }

    @Test
    public void testCrearDiasDeLaSemana() {
        List<String> dias = semana.getDias();
        assertEquals(7, dias.size());
        assertEquals("Lunes", dias.get(0));
    }

    @Test
    public void testGetDias() {
        List<String> dias = semana.getDias();
        assertNotNull(dias);
        assertEquals(7, dias.size());
    }

    @Test
    public void testGetLargo() {
        assertEquals(7, semana.getLargo());
    }

    @Test
    public void testEliminarDia() {
        semana.eliminarDia("Lunes");
        assertFalse(semana.existeDia("Lunes"));
    }

    @Test
    public void testGetDia() {
        assertEquals("Lunes", semana.getDia(0));
    }

    @Test
    public void testExisteDia() {
        assertTrue(semana.existeDia("Martes"));
        assertFalse(semana.existeDia("Inexistente"));
    }

    @Test
    public void testOrdenarDiasAlfabeticamente() {
        semana.ordenarDiasAlfabeticamente();
        List<String> diasOrdenados = semana.getDias();
        assertEquals("Domingo", diasOrdenados.get(0));
    }

    @Test
    public void testVaciarLista() {
        semana.vaciarLista();
        assertEquals(0, semana.getLargo());
    }
}

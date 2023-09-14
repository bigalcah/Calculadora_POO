import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void maximo() {
        assertEquals(4.5 , Main.maximo(4.5, 4.2));
        assertEquals(3.1 , Main.maximo(3.1, -3.1));
    }

    @Test
    void minimo() {
        assertEquals(4.2 , Main.minimo(4.5, 4.2));
        assertEquals(-3.1 , Main.minimo(3.1, -3.1));
    }

    @Test
    void sonDistintos() {
        assertTrue(Main.sonDistintos(-1.6,1.6));
        assertFalse(Main.sonDistintos(0,0));
        assertTrue(Main.sonDistintos(0.000003, -0.000003));
    }

    @Test
    void isMayorCero() {
        assertTrue(Main.isMayorCero(3));
        assertTrue(Main.isMayorCero(0.1));
        assertFalse(Main.isMayorCero(-3));
        assertFalse(Main.isMayorCero(-0.1));

    }

    @Test
    void isDistintoCero() {
        assertTrue(Main.isDistintoCero(0.1));
        assertTrue(Main.isDistintoCero(-0.1));
        assertFalse(Main.isDistintoCero(0));
    }
}
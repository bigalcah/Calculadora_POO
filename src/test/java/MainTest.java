import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    double[] matrizEsperada1 = new double[2];
    double[] matrizEsperada2 = new double[2];
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        matrizEsperada1[0] = 5;
        matrizEsperada1[1] = 2;
        matrizEsperada2[0] = (double) 5 / 4;
        matrizEsperada2[1] = (double) - 1 / 4;
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void calcularDiscriminante() {
        assertThrowsExactly(ArithmeticException.class, () -> {Main.calcularDiscriminante(10,6,2);});
        assertEquals(Main.calcularDiscriminante(2,4,2),Math.sqrt(0));
    }

    @Test
    void sistema2x2() {
        assertArrayEquals(Main.sistema2x2(2,-3,4,-2,6,2),matrizEsperada1);
        assertArrayEquals(Main.sistema2x2(6,-2,8,2,2,2),matrizEsperada2);
    }
}
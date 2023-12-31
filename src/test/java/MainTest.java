import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    String ecuacionESperada;
    String ecuacionESperada2;
    double PI;
    double radio;
    double altura;
    double[] matrizEsperada1 = new double[2];
    double[] matrizEsperada2 = new double[2];

    @BeforeEach
    void setUp() {
        ecuacionESperada = "y = 2.5x + 1.5";
        ecuacionESperada2 = "y = 1.0";
        PI = Math.PI;
        matrizEsperada1[0] = 5;
        matrizEsperada1[1] = 2;
        matrizEsperada2[0] = (double) 5 / 4;
        matrizEsperada2[1] = (double) - 1 / 4;
    }

    @AfterEach
    void tearDown() {
        ecuacionESperada = null;
        ecuacionESperada2 = null;
    }

    @Test
    void maximo() {
        assertEquals(4.5, Main.maximo(4.5, 4.2));
        assertEquals(3.1, Main.maximo(3.1, -3.1));
    }

    @Test
    void minimo() {
        assertEquals(4.2, Main.minimo(4.5, 4.2));
        assertEquals(-3.1, Main.minimo(3.1, -3.1));
    }

    @Test
    void sonIguales() {
        assertFalse(Main.sonIguales(-1.6, 1.6));
        assertTrue(Main.sonIguales(0, 0));
        assertFalse(Main.sonIguales(0.000003, -0.000003));
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

    @Test
    void calculoPendiente() {
        assertEquals(2.5, Main.obtenerPendiente(3, 9, 1, 4));
        assertEquals(0, Main.obtenerPendiente(4, 1, 5, 1));
    }

    @Test
    void obtenerEcuacionRecta() {
        assertEquals(ecuacionESperada, Main.obtenerEcuacionRecta(3, 9, 1, 4));
        assertEquals(ecuacionESperada2, Main.obtenerEcuacionRecta(4, 1, 5, 1));
    }


    @Test
    void areaCirculo() {
        radio = 2;
        assertEquals(4 * PI, Main.areaCirculo(radio));

        radio = 2.3;
        assertEquals(2.3 * 2.3 * PI, Main.areaCirculo(radio));
    }


    @Test
    void perimetroCirculo() {
        radio = 2;
        assertEquals(2 * PI * 2, Main.perimetroCirculo(radio));

        radio = 5;
        assertEquals(2 * PI * 5, Main.perimetroCirculo(radio));
    }

    @Test
    void volumenEsfera() {
        radio = 4;
        assertEquals((double) 4 / 3 * Math.PI * Main.potencia(4, 3), Main.volumenEsfera(radio));

        radio = 0.1;
        assertEquals((double) 4 / 3 * Math.PI * Main.potencia(0.1, 3), Main.volumenEsfera(radio));
    }

    @Test
    void volumenCono() {
        radio = 1.9;
        altura = 3;
        assertEquals((double) 1 / 3 * Math.PI * 3 * Main.potencia(1.9, 2), Main.volumenCono(radio, altura));

        radio = 10.99;
        altura = 4.2;
        assertEquals((double) 1 / 3 * Math.PI * 4.2 * Main.potencia(10.99, 2), Main.volumenCono(radio, altura));

    }

    @org.junit.jupiter.api.Test
    void PerimetroCuadradoRecrangulo(){
        assertEquals(8, Main.perimetroCuadradoRectangulo(2,2));
        assertEquals(104, Main.perimetroCuadradoRectangulo(2, 50));
        assertEquals(308, Main.perimetroCuadradoRectangulo(56, 98));
    }

    @Test
    void areaCuadradoRectangulo(){
        assertEquals(4, Main.areaCuadradoRectangulo(2,2));
        assertEquals(100, Main.areaCuadradoRectangulo(2, 50));
        assertEquals(5488, Main.areaCuadradoRectangulo(56, 98));
    }

    @Test
    void areaEsfera(){
        assertEquals(1017.88, Main.areaEsfera(9));
        assertEquals(63347.07, Main.areaEsfera(71));
        assertEquals(38013.27, Main.areaEsfera(55));
    }

    @Test
    void areaCubo(){
        assertEquals(39366, Main.areaCubo(81));
        assertEquals(63654, Main.areaCubo(103));
        assertEquals(2973696, Main.areaCubo(704));
    }

    @Test
    void volumenCubo(){
        assertEquals(531441, Main.volumenCubo(81));
        assertEquals(1092727, Main.volumenCubo(103));
        assertEquals(348913664, Main.volumenCubo(704));
    }

    @Test
    void areaCono(){
        assertEquals(179.12, Main.areaCono(4,5));
        assertEquals(45781.38, Main.areaCono(41,83));
        assertEquals(3772.24, Main.areaCono(18,23));
    }

    @Test
    void interseccio(){
        assertEquals("X = 3.0, Y = 5.0", Main.interseccionRectas(3,2,19,1,1,8));
        assertEquals("No hay solucion unica", Main.interseccionRectas(1,1,19,1,1,8));
        assertEquals("No hay solucion unica", Main.interseccionRectas(0,0,19,0,0,8));
    }

    @org.junit.jupiter.api.Test
    void calcularDiscriminante() {
        assertThrowsExactly(ArithmeticException.class, () -> {Main.calcularDiscriminante(10,6,2);});
        assertEquals(Main.calcularDiscriminante(2,4,2),Math.sqrt(0));
    }
}
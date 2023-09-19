import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
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
}
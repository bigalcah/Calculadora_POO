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
        assertEquals(1017.87, Main.areaEsfera(9));
    }

}
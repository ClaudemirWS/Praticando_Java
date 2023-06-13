package calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteCalculadoraJUnit {

    private Calculadora calc;

    public TesteCalculadoraJUnit() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        calc = new Calculadora();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testaSoma() {
        int resultado = calc.somar(2, 5);
        int valorEsperado = 7;
        assertEquals(resultado, valorEsperado);
    }

    @Test
    public void testaDivisao() {
        int resultado = calc.dividir(3, 0);
        int valorEsperado = 1;
        assertEquals(resultado, valorEsperado);
    }
}

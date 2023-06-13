package calculadora;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TesteParametizadoJUnit {

    private Calculadora calc;
    private int primeiroNumero;
    private int segundoNumero;
    private int resultadoEsperado;

    public TesteParametizadoJUnit(int n1, int n2, int esperado) {
        this.primeiroNumero = n1;
        this.segundoNumero = n2;
        this.resultadoEsperado = esperado;
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

    @Parameters
    public static Collection<Object[]> entradas() {
        return Arrays.asList(
                new Object[][]{
                    {1, 2, 3},
                    {11, 22, 35},
                    {111, 222, 333},
                    {10, 9, 19}
                }
        );
    }

    @Test
    public void testaSoma() {
        int resultado = calc.somar(primeiroNumero, segundoNumero);
        assertEquals(resultado, resultadoEsperado);
    }
}

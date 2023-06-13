package biblioteca;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class LivroServiceTest {

    private LivroService livroService;

    public LivroServiceTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        livroService = new LivroService();
        Livro livro1 = new Livro(1, "Java", 2019);
        livroService.adicionarLivro(livro1);
        Livro livro2 = new Livro(2, "Testes Unitários com JUnit", 2023);
        livroService.adicionarLivro(livro2);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testar_listaPossuiAoMenosDoisLivros() {
        assertTrue(livroService.listarLivros().size() >= 2);
    }

    @Test
    public void testar_primeiroLivroPossuiNomeJava() {
        Livro livroAtual = livroService.getlivroPorId(1);
        assertEquals("Java", livroAtual.getTitulo());
    }

    @Test
    public void testar_livrosPublicadosEm2000() {
        assertTrue(livroService.listarTitulosPorPubicacao(2000).size() > 0);
    }

}

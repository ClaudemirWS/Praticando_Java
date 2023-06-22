package visao;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Claudemir
 */
public class GuiJTableBuscaPacienteTeste {

    GuiJTableBuscaPaciente buscaPaciente;

    public GuiJTableBuscaPacienteTeste() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        buscaPaciente = new GuiJTableBuscaPaciente();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void teste_PreencherTabela() {
        buscaPaciente.preencherTabela();
    }

    @Test
    public void teste_BuscarFiltroPorID() {
        buscaPaciente.jcomboFiltro.setSelectedIndex(0);
        String pesquisa = (String) buscaPaciente.jcomboFiltro.getSelectedItem();
        System.out.println("Selecionado: " + pesquisa);
        //VAI ATRIBUIR UM VALOR AO CAMPO DE PESQUISA E TESTAR A BUSCA
        buscaPaciente.jtFiltro.setText("1");
        assertTrue(buscaPaciente.buscarFiltro() == true);
    }

    @Test
    public void teste_BuscarFiltroPorCPF() {
        buscaPaciente.jcomboFiltro.setSelectedIndex(1);
        String pesquisa = (String) buscaPaciente.jcomboFiltro.getSelectedItem();
        System.out.println("Selecionado: " + pesquisa);
        //VAI ATRIBUIR UM VALOR AO CAMPO DE PESQUISA E TESTAR A BUSCA
        buscaPaciente.jtFiltro.setText("123.456.789-00");
        assertTrue(buscaPaciente.buscarFiltro() == true);
    }

    @Test
    public void teste_BuscarFiltroPorNome() {
        buscaPaciente.jcomboFiltro.setSelectedIndex(2);
        String pesquisa = (String) buscaPaciente.jcomboFiltro.getSelectedItem();
        System.out.println("Selecionado: " + pesquisa);
        //VAI ATRIBUIR UM VALOR AO CAMPO DE PESQUISA E TESTAR A BUSCA
        buscaPaciente.jtFiltro.setText("Carlos dos Santos");
        assertTrue(buscaPaciente.buscarFiltro() == true);
    }

    @Test
    public void teste_LimparBusca() {
        buscaPaciente.jbLimpar.doClick();
    }
}

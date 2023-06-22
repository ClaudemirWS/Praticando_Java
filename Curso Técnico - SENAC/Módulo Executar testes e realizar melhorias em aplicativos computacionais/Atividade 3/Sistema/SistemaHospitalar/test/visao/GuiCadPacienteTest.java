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
public class GuiCadPacienteTest {

    private GuiCadPaciente cadPaciente;
    private Menu menu;

    ;
    
    public GuiCadPacienteTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        cadPaciente = new GuiCadPaciente();
        menu = new Menu();
    }

    @After
    public void tearDown() {

    }
    
    @Test
    public void teste_AbreTelaCadastro(){
        menu.setVisible(true);
        GuiCadPaciente gcp = new GuiCadPaciente();
        menu.jAreaTrabalho.add(gcp);
        gcp.setVisible(true);
    }

    @Test
    public void teste_NaoPermiteCamposVazios() {
        assertTrue(cadPaciente.cadastrar() != 1);
    }
    
    @Test
    public void teste_PreencheConvenios(){
        assertTrue(cadPaciente.preencherCombo() == 1);
    }

    @Test
    public void teste_CadastraPacienteComSucesso() {
        cadPaciente.jtNome.setText("Paciente Teste");
        cadPaciente.jtCpf.setText("00000000000");
        cadPaciente.jtRG.setText("00000000");
        cadPaciente.jtEndereco.setText("Rua Teste");
        cadPaciente.jtTelefone.setText("(00) 00000-0000");
        cadPaciente.jtEmail1.setText("emailteste@email.com");
        cadPaciente.jtDataNasc.setText("00/00/0000");
        cadPaciente.jcConvenio.setSelectedIndex(1);
        
        assertTrue(cadPaciente.cadastrar() == 1);        
    }

}

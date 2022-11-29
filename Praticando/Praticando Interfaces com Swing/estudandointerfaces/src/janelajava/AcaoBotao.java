package janelajava;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**s
 * @author Claudemir
 */

class AcaoBotao implements ActionListener {

    private JTextField campoNome;

    public AcaoBotao(JTextField campoNome) {
        this.campoNome = campoNome;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Boas vindas " + campoNome.getText()
                + "!");
    }
}

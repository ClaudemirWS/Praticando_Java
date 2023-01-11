package minieditor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 * @author Claudemir
 */
public class MiniEditor extends JFrame implements ActionListener {

    //componente de Frame
    JFrame f;

    //componente de texto
    JTextArea t;

    // Método construtor
    MiniEditor() {

        // Criando um frame
        f = new JFrame("MineEditor");

        // Criando o componente text
        t = new JTextArea();

        // criando a barra de menu
        JMenuBar mb = new JMenuBar();

        // criando o menu arquivo
        JMenu m1 = new JMenu("Arquivo");

        //criando os itens do menu arquivo
        JMenuItem mi1 = new JMenuItem("Novo");
        JMenuItem mi2 = new JMenuItem("Abrir");
        JMenuItem mi3 = new JMenuItem("Salvar");

        // adicionando as actions listener
        mi1.addActionListener(this);
        mi2.addActionListener(this);
        mi3.addActionListener(this);

        //adicionando as opções no meu arquivo   
        m1.add(mi1);
        m1.add(mi2);
        m1.add(mi3);

        //criando o menu fechar
        JMenuItem mc = new JMenuItem("Fechar");

        // adicionando as actions listener
        mc.addActionListener(this);

        //adicionando as opções do menu na barra de menus 
        mb.add(m1);
        mb.add(mc);

        //especificando as configurações do frame, com barra de menus e tamanho
        f.setJMenuBar(mb);
        f.add(t);
        f.setSize(500, 500);
        f.show();
    }

    // quando o botão for pressionado no menu
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        switch (s) {

            case "Novo":
                t.setText("");
                break;

            case "Fechar":
                f.dispose();
                break;

            case "Abrir": {
                // Crie um objeto da classe JFileChooser, que permite selecionar local e nome de arquivos   
                JFileChooser j = new JFileChooser("C:");

                // chamando a função showsOpenDialog para mostrar a caixa de diálogo salvar
                int r = j.showOpenDialog(null);

                // Se o usuário selecionar um arquivo
                if (r == JFileChooser.APPROVE_OPTION) {

                    // Defina o rótulo para o caminho do diretório selecionado
                    File fi = new File(j.getSelectedFile().getAbsolutePath());

                    try {
                        // String
                        String s1 = "", sl = "";

                        // File reader
                        FileReader fr = new FileReader(fi);

                        // Buffered reader
                        BufferedReader br = new BufferedReader(fr);

                        // inicializando sl
                        sl = br.readLine();

                        // selecionando a entrada do arquivo
                        while ((s1 = br.readLine()) != null) {
                            sl = sl + "\n" + s1;
                        }

                        ///Defina o texto
                        t.setText(sl);

                    } catch (Exception evt) {
                        JOptionPane.showMessageDialog(f, evt.getMessage());
                    }
                } else {
                    // Se o usuário cancelou a operação
                    JOptionPane.showMessageDialog(f, "Operação cancelada");
                }
                break;
            }
            case "Salvar": {

                // Crie um objeto da classe JFileChooser
                JFileChooser j = new JFileChooser("f:");

                // Invoque a função showsSaveDialog para mostrar a caixa de diálogo de salvamento
                int r = j.showSaveDialog(null);

                if (r == JFileChooser.APPROVE_OPTION) {

                    // Defina o rótulo para o caminho do diretório selecionado
                    File fi = new File(j.getSelectedFile().getAbsolutePath());

                    try {
                        // Criando o file writer
                        FileWriter wr = new FileWriter(fi, false);

                        // criando buffered writer para gravar
                        BufferedWriter w = new BufferedWriter(wr);

                        // escrevendo
                        w.write(t.getText());

                        //forçando gravar todos os dados presentes no fluxo de saída do arquivo    
                        w.flush();

                        //fecha o arquivo
                        w.close();
                    } catch (Exception evt) {
                        JOptionPane.showMessageDialog(f, evt.getMessage());
                    }
                } else {
                    // Se o usuário cancelou a operação
                    JOptionPane.showMessageDialog(f, "Operação cancelada");
                }
                break;
            }
            default:
                break;
        }
    }

    // Método main da classe
    public static void main(String args[]) {
        MiniEditor e = new MiniEditor();
    }
}

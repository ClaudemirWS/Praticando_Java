package manipulandoarquivo.input_output_stream;

import java.io.*;

/**
 * @author Claudemir ]
 * Fluxo de Caracteres 
 * Esse fluxo é usado para ler ou gravar
 * dados de caracteres com 16 bits Unicode. O fluxo de caracteres é novamente
 * subdividido em dois tipos, que são os seguintes:
 *
 * Fluxo de entrada de caracteres: usado para ler dados de caracteres de
 * diferentes dispositivos. Fluxo de saída de caracteres: usado para gravar
 * dados de caracteres em diferentes dispositivos. *
 */
//importando a classe para manipulação de arquivo
public class Copiar2 {

    public static void main(String args[]) throws IOException {

        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("C:\\teste\\input.txt");
            out = new FileWriter("C:\\teste\\output.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}

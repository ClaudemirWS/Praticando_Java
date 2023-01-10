package manipulandoarquivo.input_output_stream;

import java.io.*;

/**
 * @author Claudemir 
 * Fluxo de Bytes 
 * Esse fluxo é usado para ler ou gravar dados
 * de bytes de 8 bits (binary digit). O fluxo de bytes é novamente subdividido
 * em dois tipos, que são os seguintes:
 *
 * Fluxo de entrada de bytes: usado para ler dados de bytes de diferentes
 * dispositivos. Fluxo de saída de byte: usado para gravar dados de byte em
 * diferentes dispositivos
 */
//importando a classe para manipulação de arquivo
public class Copiar {

    public static void main(String args[]) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("C:\\teste\\input.txt");
            out = new FileOutputStream("C:\\teste\\output.txt");

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

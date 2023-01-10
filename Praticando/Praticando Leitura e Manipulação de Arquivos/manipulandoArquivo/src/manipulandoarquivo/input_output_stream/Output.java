package manipulandoarquivo.input_output_stream;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * @author Claudemir
 */
public class Output {

    public static void main(String args[]) {

        String data = "Manipulando arquivos com Java";

        try {
            OutputStream out = new FileOutputStream("C:\\teste\\output.txt");

            // Convertendo a string em bytes
            byte[] dataBytes = data.getBytes();

            // Grava dados no OutputStream
            out.write(dataBytes);
            System.out.println("Dados gravados no arquivo");

            // Fecha o OutputStream
            out.close();
        } catch (Exception e) {
            e.getStackTrace();
        }

    }
}

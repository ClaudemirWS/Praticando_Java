package manipulandoarquivo.input_output_stream;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author Claudemir
 */
public class Input {

    public static void main(String args[]) {

        byte[] array = new byte[100];

        try {
            InputStream input = new FileInputStream("C:\\input.txt");

            System.out.println("Bytes disponíveis no arquivo " + input.available());

            // Ler byte a byte do fluxo de entrada
            input.read(array);
            System.out.println("Cariologia: ");

            // Convertendo array de bytes em string
            String data = new String(array);
            System.out.println(data);

            // fechando o InputStream
            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}

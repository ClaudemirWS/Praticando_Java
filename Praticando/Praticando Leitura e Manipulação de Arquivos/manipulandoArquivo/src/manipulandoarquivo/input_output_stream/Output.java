package manipulandoarquivo.input_output_stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * @author Claudemir
 */
public class Output {

    public static void main(String args[]) {

        String data = "Manipulando arquivos com Java";

        try {
            File obj = new File("C:\\output.txt");
            OutputStream out = new FileOutputStream(obj);

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

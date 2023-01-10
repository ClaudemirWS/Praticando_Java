package manipulandoarquivo;

//importando a classe File
import java.io.File;

//Importe a classe FileNotFoundException para lidar com erros
import java.io.FileNotFoundException;

//Importe a classe Scanner para ler o conteúdo de arquivos de texto
import java.util.Scanner;

/**
 * @author Claudemir
 */
public class Ler {

    public static void main(String[] args) {
        try {
            File obj = new File("C://teste//arquivo.txt");
            Scanner Reader = new Scanner(obj);
            while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                System.out.println(data);
            }
            Reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ocorreu algum erro.");
        }
    }
}

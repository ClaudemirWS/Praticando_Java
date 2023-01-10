package manipulandoarquivo;

//importando a classe FileWriter
import java.io.FileWriter;

//Importe a classe IOException para lidar com erros
import java.io.IOException;

/**
 * @author Claudemir
 */
public class Gravar {

    public static void main(String[] args) {
        try {
            FileWriter Writer = new FileWriter("C://teste//arquivo.txt");
            Writer.write("Gravando dados no arquivo!");
            Writer.close();
            System.out.println("Sucesso ao gravar no arquivo.");
        } catch (IOException e) {
            System.out.println("Ocorreu algum erro.");
        }
    }
}

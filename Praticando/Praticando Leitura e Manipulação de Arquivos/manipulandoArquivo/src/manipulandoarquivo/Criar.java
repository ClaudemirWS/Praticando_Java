package manipulandoarquivo;

//importando a classe File
import java.io.File;

//Importe a classe IOException para lidar com erros
import java.io.IOException;

/**
 * @author Claudemir
 */
public class Criar {

    public static void main(String[] args) {

        try {
            File obj = new File("C://teste//arquivo.txt");
            if (obj.createNewFile()) {
                System.out.println("Arquivo criado: " + obj.getName());
            } else {
                System.out.println("Arquivo já existe.");
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro." + e.getMessage());
        }
    }
}

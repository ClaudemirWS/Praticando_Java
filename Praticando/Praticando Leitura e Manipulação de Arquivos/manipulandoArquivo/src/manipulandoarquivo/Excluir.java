package manipulandoarquivo;
//importando a classe File

import java.io.File;

/**
 * @author Claudemir
 */
public class Excluir {

    public static void main(String[] args) {
        File obj = new File("C://arquivo.txt");
        if (obj.delete()) {
            System.out.println("Excluido o arquivo : " + obj.getName());
        } else {
            System.out.println("Falha ao excluir o arquivo");
        }
    }
}

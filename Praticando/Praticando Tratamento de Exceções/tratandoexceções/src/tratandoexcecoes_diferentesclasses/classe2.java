package tratandoexcecoes_diferentesclasses;

/**
 * @author Claudemir
 */
public class classe2 {

    public static void main(String args[]) {

        try {
            classe1.geraExcecao(); //chamando o método que gera a excecao da classe acima
        } catch (ArrayIndexOutOfBoundsException exc) {
            // capturando a excecao
            System.out.println("Indice do vetor fora do seu escopo");
        }
        System.out.println("Mensagem depois do catch");
    }
}

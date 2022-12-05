package tratandoexcecoes_throw;

/**
 * @author Claudemir
 */
public class throwTeste {

    public static void main(String args[]) {
        try {
            System.out.println("Antes de lançar a exceção");
            throw new ArithmeticException(); // Lancando a excecao 
        } catch (ArithmeticException exc) {
            //Capturando a exceção
            System.out.println("Exceção capturada");
        }

        System.out.println("Aqui já estamos fora do bloco try/catch");
    }
}

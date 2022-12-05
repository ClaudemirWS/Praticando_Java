package tratandoexcecoes_finally;

/**
 * @author Claudemir
 */
public class classe1 {

    public static void geraExcecao(int escolha) {
        int t;
        int nums[] = new int[2];

        System.out.println("Recebendo" + escolha);

        try {
            switch (escolha) {
                case 0:
                    t = 10 / escolha; // Gerando o erro de divisão por zero
                    break;
                case 1:
                    nums[4] = 4; // Gerando o erro de índice fora do escopo
                    break;
                case 2:
                    return; // Retornando ao bloco try
            }
        } catch (ArithmeticException exc) {
            //Capturando a exceção
            System.out.println("Divisao por zero detectada");
            return; //Return do catch
        } catch (ArrayIndexOutOfBoundsException exc) {
            //Capturando a exceção
            System.out.println("Erro de índice fora do escopo");
        } finally {
            System.out.println("Saindo do bloco try");
        }

    }
}

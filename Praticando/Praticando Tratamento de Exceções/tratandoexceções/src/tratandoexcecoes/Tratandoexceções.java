package tratandoexcecoes;

/**
 * @author Claudemir
 */
public class Tratandoexceções {

    public static void main(String[] args) {
        // Demonstrando um tratamento de exceção
        int nums[] = new int[4];
        try {	//criando o bloco try
            System.out.println("Isso acontece antes da excecao ser gerada");
            // Gerando o erro
            nums[7] = 10; // Tentando colocar um inteiro dentro de um vetor na posição 7, mas o vetor só possui 4 posições.
            System.out.println("Essa mensagem não será exibida");
        } catch (ArrayIndexOutOfBoundsException exc) { //Este catch captura erros de ArrayIndexOutOfBounds
            // Capturando a exceção
            System.out.println("Índice de vetor fora do seu escopo!");
        }
        System.out.println("Mensagem exibida após o tratamento da exceção!");

    }

}

package tratandoexcecoes_finally;

/**
 * @author Claudemir
 */
public class classe2 {

    public static void main(String args[]) {
        for (int i = 0; i < 3; i++) {
            classe1.geraExcecao(i);
            System.out.println();
        }
    }
}

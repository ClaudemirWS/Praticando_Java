package tratabdoexcecoes_divisaozero;

/**
 * @author Claudemir
 */
public class classe {

    public static void main(String args[]) {

        int numeral[] = {4, 8, 16, 32, 64, 128};
        int denominador[] = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < numeral.length; i++) {
            try {
                System.out.println(
                        numeral[i] + " / "
                        + denominador[i] + " é "
                        + numeral[i] / denominador[i]);
            } catch (ArithmeticException exc) {
                // pegando a exceção
                System.out.println("Divisao por zero nao e possivel");
            }
        }

    }
}

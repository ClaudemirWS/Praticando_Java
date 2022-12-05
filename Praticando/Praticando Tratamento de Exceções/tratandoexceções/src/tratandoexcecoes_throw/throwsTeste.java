package tratandoexcecoes_throw;

/**
 * @author Claudemir
 */
public class throwsTeste {

    public int division(int a, int b) throws ArithmeticException {
        int t = a / b;
        return t;
    }

    public static void main(String args[]) {
        throwsTeste obj = new throwsTeste();
        try {
            System.out.println(obj.division(15, 0));
        } catch (ArithmeticException e) {
            System.out.println("Voce nao deveria tentar dividir por zero");
        }
    }
}

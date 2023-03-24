package Main;

/**
 * @author Claudemir
 */
public class Fatorial {

    private int num = 0;
    private int fat = 1;
    private String formula = "";

    public void setValor(int n) {
        num = n;
        int f = 1;
        String s = "";
        for (int c = n; c > 1; c--) {
            f *= c;
            s += c + " x ";
        }
        s += "1 =";
        fat = f;
        formula = s;
    }

    //RETORNA O VALOR FINAL DA MULTIPLICAÇÃO
    public String getFatorial() {
        return String.valueOf(fat);
    }

    //RETORNA UMA STRING COM TODO O PASSO FEITO NO LAÇO FOR
    public String getFormula() {
        return formula;
    }
}

package calculadora;

public class TesteCalculadora {

    public void testaSoma() {
        Calculadora calc = new Calculadora();
        int resultado = calc.somar(3, 2);
        System.out.println("testaSoma: " + (resultado == 5 ? "OK" : "ERRO"));
    }

    public void testaSubtracao() {
        Calculadora calc = new Calculadora();
        int resultado = calc.subtrair(3, 2);
        System.out.println("testaSub: " + (resultado == 1 ? "OK" : "ERRO"));
    }

    public void testaMultiplicacao() {
        Calculadora calc = new Calculadora();
        int resultado = calc.multiplicar(3, 2);
        System.out.println("testaMult: " + (resultado == 6 ? "OK" : "ERRO"));
    }

    public void testaDivisao() {
        Calculadora calc = new Calculadora();
        int resultado = calc.dividir(3, 2);
        System.out.println("testaDiv: " + (resultado == 1 ? "OK" : "ERRO"));
    }

    public static void main(String[] args) {
        new TesteCalculadora().testaSoma();
        new TesteCalculadora().testaSubtracao();
        new TesteCalculadora().testaMultiplicacao();
        new TesteCalculadora().testaDivisao();
    }

}

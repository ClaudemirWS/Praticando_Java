package testesemframework;

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

    /*
    
    a classe TesteCalculadora é funcional, mas, para a boa prática de programação, 
    erros devem ser tratados com exceções (blocos try catch), e não com simples avaliações 
    condicionais (if e else). Criar testes dessa maneira, com controle de exceções, além de 
    poluir o código com blocos try catch, é muito trabalhoso. É neste momento que se mostra 
    útil a utilização de um framework para automatização de testes.
    
    public void testaDivisao() {
        Calculadora calc = new Calculadora();
        int resultado = calc.dividir(3, 2);
        System.out.println("testaDiv: " + (resultado == 1 ? "OK" : "ERRO"));
    }*/
    
    public void testaDivisao() {
        Calculadora calc = new Calculadora();
        int resultado = calc.dividir(3, 0);
        System.out.println("testaDiv: " + (resultado == 1 ? "OK" : "ERRO"));
    }

}

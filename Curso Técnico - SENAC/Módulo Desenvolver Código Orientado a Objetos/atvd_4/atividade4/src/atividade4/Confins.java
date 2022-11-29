package atividade4;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Confins implements Impostos {

    private double calculo, totalDebito, totalCredito;
    protected String resultado;

    public Confins() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total de débito da empresa: R$ ");
        this.totalDebito = sc.nextDouble();
        System.out.print("Total de crédito da empresa: R$ ");
        this.totalCredito = sc.nextDouble();
    }

    //MÉTODO RESPONSÁVEL POR CALCULAR O IMPOSTO
    @Override
    public double calculaImposto() {
        calculo = (totalDebito - totalCredito) * 7.6 / 100;
        return calculo;
    }

    //MÉTODO RESPONSÁVEL POR RETORNAR O CÁLCULO
    @Override
    public String retornaImposto() {
        resultado = String.valueOf("Cálculo do Confins: " + totalDebito + " - " + totalCredito
                + " * 7.6% = R$ " + calculaImposto());
        return resultado;
    }

}

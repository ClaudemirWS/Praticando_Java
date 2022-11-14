package atividade4;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class ICMS implements Impostos {

    private double calculo, mercadoria;
    private int aliquota;
    protected String resultado;

    public ICMS() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mercadoria tributada: R$ ");
        this.mercadoria = sc.nextDouble();
        System.out.print("Alíquota: ");
        this.aliquota = sc.nextInt();
    }

    //MÉTODO RESPONSÁVEL POR CALCULAR O IMPOSTO
    @Override
    public double calculaImposto() {
        calculo = mercadoria * aliquota / 100;
        return calculo;
    }

    //MÉTODO RESPONSÁVEL POR RETORNAR O CÁLCULO
    @Override
    public String retornaImposto() {
        resultado = String.valueOf("Cálculo do ICMS: " + mercadoria + " x " + aliquota
                + "% = R$ " + calculaImposto());
        return resultado;
    }

}

package atividade4;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class IPI implements Impostos {

    private double calculo, valorProduto, frete, seguro, outros;
    private int aliquota;
    protected String resultado;
    
    public IPI() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Alíquota: ");
        this.aliquota = sc.nextInt();
        System.out.print("Valor do produto: R$ ");
        this.valorProduto = sc.nextDouble();
        System.out.print("Frete: R$ ");
        this.frete = sc.nextDouble();
        System.out.print("Seguro: R$ ");
        this.seguro = sc.nextDouble();
        System.out.print("Outros: R$ ");
        this.outros = sc.nextDouble();
    }
    
    //MÉTODO RESPONSÁVEL POR CALCULAR O IMPOSTO
    @Override
    public double calculaImposto() {
        calculo = (valorProduto + frete + seguro + outros) * aliquota / 100;
        return calculo;
    }

    //MÉTODO RESPONSÁVEL POR RETORNAR O CÁLCULO
    @Override
    public String retornaImposto() {
        resultado = String.valueOf("Cálculo do IPI: (" + valorProduto + " + " + frete + " + " + seguro + " + " + outros
                + ") * " + aliquota + "% = R$ " + calculaImposto());
        return resultado;
    }

}

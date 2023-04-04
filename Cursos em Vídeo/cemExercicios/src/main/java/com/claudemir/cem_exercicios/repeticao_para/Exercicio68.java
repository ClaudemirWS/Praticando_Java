package com.claudemir.cem_exercicios.repeticao_para;

import java.util.Scanner;

/**
 * @author Claudemir
 */
public class Exercicio68 {

    public static void main(String[] args) {
        String sexo;
        Float peso, mediaMulheres = 0f, maiorHomem = 0f;
        int totMulheres = 0, homCem = 0;
        for (int i = 1; i <= 8; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite o sexo da " + i + "º pessoa(M/F): ");
            sexo = sc.nextLine();
            System.out.print("Digite o peso da " + i + "º pessoa: ");
            peso = sc.nextFloat();
            //VERIFICA SEXO
            if (sexo.equals("F")) {
                //SOMA O TOTAL DE MULHERES
                totMulheres += 1;
                //GUARDA A SOMA DO PESO DE TODAS AS MULHERES
                mediaMulheres += peso;
            } else if (sexo.equals("M")) {
                //CONTA HOMENS COM MAIS DE 100 KG
                if (peso > 100) {
                    homCem += 1;
                }
                //PROCURA O MAIOR PESO ENTRE OS HOMENS
                if (peso == 0) {
                    maiorHomem = peso;
                }
                if (peso > maiorHomem) {
                    maiorHomem = peso;
                }
            }
        }
        System.out.println("");
        System.out.println("Foram cadastradas o total de " + totMulheres + " mulheres.");
        System.out.println("A média de peso entre todas as mulheres foi de " + (mediaMulheres/totMulheres) + ".");
        System.out.println("O total de homens com peso acima de 100Kg foi " + homCem + ".");
        System.out.println("O maior peso registrado entre os homens foi " + maiorHomem + ".");
    }
}

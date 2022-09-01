package com.claudemir.cem_exercicios.um_para_vinte;

import java.util.Scanner;

/**
 * REFAZENDO OS CEM EXERCICIOS QUE FIZ EM PORTUGOL
 *
 * @author Claudemir Souza
 */
public class Exercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double n1,n2;
        System.out.println("===== MÉDIA DE UM ALUNO =====");
        System.out.print("Digite a primeira nota: ");
        n1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        n2 = sc.nextDouble();
        System.out.println("A média do aluno é " + ((n1+n2)/2));
    }
}

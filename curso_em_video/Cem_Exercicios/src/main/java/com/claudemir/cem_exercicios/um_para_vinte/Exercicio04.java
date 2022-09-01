package com.claudemir.cem_exercicios.um_para_vinte;

import java.util.Scanner;

/**
 * REFAZENDO OS CEM EXERCICIOS QUE FIZ EM PORTUGOL
 *
 * @author Claudemir Souza
 */
public class Exercicio04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        System.out.println("===== SOMANDO 2 NÚMEROS =====");
        System.out.print("Digite um número: ");
        n1 = sc.nextInt();
        System.out.print("Digite outro número: ");
        n2 = sc.nextInt();
        System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
    }

}

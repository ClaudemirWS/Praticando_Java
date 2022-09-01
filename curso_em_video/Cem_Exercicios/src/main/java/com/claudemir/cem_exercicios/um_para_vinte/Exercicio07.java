package com.claudemir.cem_exercicios.um_para_vinte;

import java.util.Scanner;

/**
 * REFAZENDO OS CEM EXERCICIOS QUE FIZ EM PORTUGOL
 *
 * @author Claudemir Souza
 */
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num;
        System.out.println("===== DOBRO E TERÇA PARTE =====");
        System.out.print("Digite um número real: ");
        num = sc.nextDouble();
        System.out.println("O dobro de " + num + " é: " + (num*2) );
        System.out.println("A terça parte de " + num + " é: " + (num/3));
    }
}

package com.claudemir.cem_exercicios.sequencias_basicas;

import java.util.Scanner;

/**
 * REFAZENDO OS CEM EXERCICIOS QUE FIZ EM PORTUGOL
 *
 * @author Claudemir Souza
 */
public class Exercicio11 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b, c, res;
        System.out.println("===== EQUAÇÃO DO SEGUNDO GRAU =====");
        System.out.print("Digite o valor de A: ");
        a = sc.nextFloat();
        System.out.print("Digite o valor de B: ");
        b = sc.nextFloat();
        System.out.print("Digite o valor de C: ");
        c = sc.nextFloat();
        res = b*b-(4*a*c);
        System.out.println("O valor de delta é: " + res);
    }
    
}

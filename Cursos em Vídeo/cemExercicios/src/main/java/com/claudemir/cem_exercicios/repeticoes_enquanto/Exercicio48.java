package com.claudemir.cem_exercicios.repeticoes_enquanto;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Exercicio48 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 1, max = 7, num = 0, soma = 0;
        System.out.println("===== SOMA DE 7 NÚMEROS INTEIROS ====");
        while (cont < max + 1) {
            System.out.print("Digite o " + cont + "º número: ");
            num = sc.nextInt();
            soma += num;
            cont += 1;
        }
        System.out.println("SOMA = " + soma);
    }
}

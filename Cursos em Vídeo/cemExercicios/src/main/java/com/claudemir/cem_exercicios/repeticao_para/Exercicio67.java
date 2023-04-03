package com.claudemir.cem_exercicios.repeticao_para;

import java.util.Scanner;

/**
 * @author Claudemir
 */
public class Exercicio67 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== CONTAGEM DE 0 ATÉ UM NÚMERO =====");
        System.out.print("Digite um número inteiro positivo: ");
        int n = sc.nextInt();
        //CONTADOR
        for (int i = 0; i <= n; i++){
            System.out.print(" " + i + " -> ");
        }
        System.out.print("Acabou!");
    }
}

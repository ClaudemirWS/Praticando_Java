package com.claudemir.cem_exercicios.repeticoes_enquanto;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Exercicio42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 1, val;
        System.out.println("===== CONTAGEM CRESCENTE =====");
        System.out.print("Digite um número positivo: ");
        val = sc.nextInt();
        while (val > cont) {
            cont += 1;
            System.out.print(cont + " -> ");
            if (val == cont) {
                System.out.print("Acabou!");
            }            
        }
    }
}

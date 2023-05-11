package com.claudemir.cem_exercicios.procedimentos;

import java.util.Scanner;

/**
 * @author Claudemir
 */
public class Exercicio93 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor inicial do contador: ");
        int ini = sc.nextInt();
        System.out.print("Digite o valor final do contador: ");
        int fim = sc.nextInt();
        System.out.print("Digite o passo do contador: ");
        int pas = sc.nextInt();
        contador(ini, fim, pas);
    }

    public static void contador(int ini, int fim, int pas) {
        if (ini < fim) {
            for (int i = ini; i <= fim; i += pas) {
                System.out.print(i + " -> ");
            }
        }
        System.out.print("Acabou!");
    }
}

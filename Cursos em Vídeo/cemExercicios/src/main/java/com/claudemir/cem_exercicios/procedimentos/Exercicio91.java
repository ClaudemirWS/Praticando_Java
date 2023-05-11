package com.claudemir.cem_exercicios.procedimentos;

import java.util.Scanner;

/**
 * @author Claudemir
 */
public class Exercicio91 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o 1º valor: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o 2º valor: ");
        int n2 = sc.nextInt();
        maior(n1, n2);

    }

    public static void maior(int n1, int n2) {
        int maior = 0;
        String msg = "";
        if (n1 > maior) {
            maior = n1;
            msg = "O 1º número foi o maior";
            if (n2 > maior) {
                maior = n2;
                msg = "O 2º número foi o maior";
            } else if (n1 == n2) {
                msg = "Ambos números são iguais";
            }
        }
        System.out.println(msg);
    }
}

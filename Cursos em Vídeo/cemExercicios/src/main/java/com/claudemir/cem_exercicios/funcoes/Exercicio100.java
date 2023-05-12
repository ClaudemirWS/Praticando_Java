package com.claudemir.cem_exercicios.funcoes;

import java.util.Scanner;

/**
 * @author Claudemir
 */
public class Exercicio100 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a 1º nota: ");
        int n1 = sc.nextInt();
        System.out.print("Digite a 2º nota: ");
        int n2 = sc.nextInt();

        System.out.println("A média do aluno foi " + media(n1, n2));
        System.out.println("O aluno está " + situacao(n1,n2));
    }

    public static Integer media(int n1, int n2) {
        return (n1 + n2) / 2;
    }

    public static String situacao(int n1, int n2) {
        String msg;
        int media = media(n1, n2);
        if (media <= 4) {
            msg = "REPROVADO";
        } else if (media > 4 && media < 7) {
            msg = "EM RECUPERAÇÃO";
        } else {
            msg = "APROVADO";
        }
        return msg;
    }
}

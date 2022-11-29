package com.claudemir.cem_exercicios.condicoes_compostas;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Exercicio27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1, n2, media;
        System.out.println("===== MÉDIA DE UM ALUNO =====");
        System.out.print("Digite a 1º nota do Aluno: ");
        n1 = sc.nextFloat();
        System.out.print("Digite a 2º nota do ALuno: ");
        n2 = sc.nextFloat();
        media = (n1 + n2) / 2;
        if (media < 4.9) {
            System.out.println("Aluno Reprovado.");
        } else if (media > 5 && media < 6.9) {
            System.out.println("Aluno em Recuperação.");
        } else {
            System.out.println("Aluno Aprovado.");
        }
    }
}

package com.claudemir.cem_exercicios.condicoes_basicas;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Exercicio19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, n1, n2;
        float media;
        System.out.println("===== MÉDIA DE UM ALUNO =====");
        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.print("Digite a 1º nota: ");
        n1 = sc.nextLine();
        System.out.print("Digite a 2º nota: ");
        n2 = sc.nextLine();
        media = ((Float.parseFloat(n1) + Float.parseFloat(n2))/2);
        if (media >= 7) {
            System.out.println(nome + " foi aprovado com média " + media + ".");
        } else {
            System.out.println(nome + " foi reprovado com média " + media + ".");
        }
    }
}

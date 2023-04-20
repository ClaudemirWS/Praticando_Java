package com.claudemir.cem_exercicios.vetores;

import java.util.Scanner;

/**
 * @author Claudemir
 */
public class Exercicio77 {

    public static void main(String[] args) {
        //LENDO O NOME DE 7 PESSOAS
        String nome, vetor[] = new String[7];
        Scanner sc = new Scanner(System.in);
        //PREENCHE A LISTA
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o nome da " + (i + 1) + "º pessoa: ");
            nome = sc.nextLine().strip();
            vetor[i] = nome;
        }
        //MOSTRA A LISTA
        System.out.print("\n===== LISTA DE PESSOAS =====\n");
        for (int i = vetor.length-1; i >= 0; i--) {
            System.out.println((i + 1) + "º Pessoa: " + vetor[i]);
        }
    }
}

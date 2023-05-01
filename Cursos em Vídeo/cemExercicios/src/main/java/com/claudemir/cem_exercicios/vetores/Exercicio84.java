package com.claudemir.cem_exercicios.vetores;

import java.util.Scanner;

/**
 * @author Claudemir
 */
public class Exercicio84 {

    public static void main(String[] args) {
        String nomes[] = new String[8], nome;
        int idades[] = new int[8], idade;

        //PREENCHE VETOR
        for (int i = 0; i < idades.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite o nome da " + (i + 1) + "º pessoa: ");
            nome = sc.nextLine();
            System.out.print("Digite a idade da " + (i + 1) + "º pessoa: ");
            idade = sc.nextInt();
            nomes[i] = nome;
            idades[i] = idade;
        }

        //LÊ VALORES
        System.out.print("===== MAIORES DE IDADE =====\n");
        for (int i = 0; i < idades.length; i++) {
            if (idades[i] >= 18) {
                System.out.println("Pessoa de nº " + (i + 1) + ": " + nomes[i] + ", idade: " + idades[i] + ".");
            }
        }
    }
}

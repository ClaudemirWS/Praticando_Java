package com.claudemir.cem_exercicios.vetores;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Claudemir
 */
public class Exercicio80 {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int num, qtd = 0;
        int vetor[] = new int[30];

        System.out.print("Digite um número: ");
        num = sc.nextInt();
        //PREENCHE O VETOR E VERIFICA QUANTAS VEZES O NÚMERO DIGITADO APARECE
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(1, 15);
            //VERIFICA SE O NÚMERO DIGITADO FOI SORTEADO
            if (vetor[i] == num) {
                qtd += 1;
            }
        }
        //VERIFICA SE O NÚMERO FOI SORTEADO E FAZ OU NÃO A CONDIÇÃO
        if (qtd > 0) {
            //EM QUE POSIÇÕES O NÚMERO APARECE
            System.out.print("\nO número foi sorteado "+ qtd +" vezes");
            System.out.print("\nPosições: ");
            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i] == num) {
                    System.out.print("[" + i + "] ");
                }
            }
        } else {
            System.out.print("\nO número não foi sorteado.");
        }
    }

}

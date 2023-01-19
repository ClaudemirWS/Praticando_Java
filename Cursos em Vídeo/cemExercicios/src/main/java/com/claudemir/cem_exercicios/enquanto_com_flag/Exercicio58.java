package com.claudemir.cem_exercicios.enquanto_com_flag;

import java.util.Scanner;

/**
 * @author Claudemir
 */
public class Exercicio58 {

    public static void main(String[] args) {
        //FUNCIONALIDADES DO PROGRAMA
        int soma = 0, idade = 0, media = 0;

        //INICIO
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite a idade de um aluno (ou 999 para SAIR): ");
            idade = sc.nextInt();
            if (idade != 999) {
                soma += 1;
                media += idade;
            }
        } while (idade != 999);
        media = media / soma;
        System.out.println("Existem " + soma + " alunos na turma e a média de idade foi " + media + ".");
    }
}

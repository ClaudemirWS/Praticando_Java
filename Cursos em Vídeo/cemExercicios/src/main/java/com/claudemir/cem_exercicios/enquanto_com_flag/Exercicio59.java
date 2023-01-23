package com.claudemir.cem_exercicios.enquanto_com_flag;

import java.util.Scanner;

/**
 * @author Claudemir
 */
public class Exercicio59 {

    public static void main(String[] args) {
        //FUNCIONALIDADES DO PROGRAMA
        int maior = 0, homens = 0, mulhJovem = 0, mediaHom = 0;
        String sexo, idade;

        //INICIO
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite uma idade (ou 999 para SAIR): ");
            idade = sc.nextLine();
            System.out.print("Digite o sexo (M/F): ");
            sexo = sc.nextLine().strip().toUpperCase();
            if (!idade.equals("999")) {
                //MAIOR IDADE RECEBIDA
                if (maior == 0) {
                    maior = Integer.parseInt(idade);
                } else if (Integer.parseInt(idade) > maior) {
                    maior = Integer.parseInt(idade);
                }
                //QUANTIDADE DE HOMENS
                if (sexo.equals("M")) {
                    homens += 1;
                }
                //IDADE DA MULHER MAIS JOVEM
                if (sexo.equals("F")) {
                    if (Integer.parseInt(idade) == 0) {
                        mulhJovem = Integer.parseInt(idade);
                    } else if (Integer.parseInt(idade) < mulhJovem) {
                        mulhJovem = Integer.parseInt(idade);
                    }
                }
                //MÉDIA DE IDADE ENTRE OS HOMENS
                if (sexo.equals("M")) {
                    mediaHom += Integer.parseInt(idade);
                }
            }
        } while (!idade.equals("999"));
        mediaHom = mediaHom / homens;
        System.out.println("Maior idade recebida: " + maior);
        System.out.println("Quantidade de homens: " + homens);
        System.out.println("Idade da mulher mais jovem: " + mulhJovem);
        System.out.println("Média de idade entre os homens: " + mediaHom);
    }
}

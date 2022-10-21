package com.claudemir.cem_exercicios.repeticoes_enquanto;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Exercicio53 {

    public static void main(String[] args) {
        int cont = 1, idade, homens = 0, mulheres = 0, media = 0, mediaHomem = 0, mulheres20 = 0;
        String sexo;
        while (cont != 6) {
            Scanner scInt = new Scanner(System.in);
            Scanner scString = new Scanner(System.in);
            System.out.print("Digite a idade da " + cont + "ª pessoa: ");
            idade = scInt.nextInt();
            System.out.print("Digite o sexo da " + cont + "ª pessoa (M/F): ");
            sexo = scString.nextLine().strip().toUpperCase();

            //CONDICOES
            if (sexo.equals("M")) {
                homens += 1;
                mediaHomem += idade;
            }
            if (sexo.equals("F")) {
                mulheres += 1;
                if (idade > 20) {
                    mulheres20 += 1;
                }
            }
            media += idade;
            cont += 1;
        }
        mediaHomem = mediaHomem / homens;
        media = media / cont;
        System.out.println("\nA média entre todas as idades foi de: " + media);
        System.out.println(homens + " homens foram cadastrados.");
        System.out.println(mediaHomem + " foi a média de idade entre os homens.");
        System.out.println(mulheres + " mulheres foram cadastradas.");
        System.out.println(mulheres20 + " mulheres tem mais de 20 anos.");
    }
}

package com.claudemir.cem_exercicios.repeticoes_enquanto;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Exercicio52 {

    public static void main(String[] args) {
        int cont = 1, idade, media = 0, mais18 = 0, menor5 = 0, maiorIdade = 0;
        while (cont != 11) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite a idade da " + cont + "ª pessoa: ");
            idade = sc.nextInt();

            //CONDICOES
            if (cont == 1){
                maiorIdade = idade;
            }
            else if (idade > maiorIdade) {
                maiorIdade = idade;
            }
            if (idade > 18) {
                mais18 += 1;
            }
            if (idade < 5) {
                menor5 += 1;
            }
            media += idade;
            cont += 1;
        }
        media = media / cont;
        System.out.println("A média entre todas as idades é de: " + media);
        System.out.println(mais18 + " pessoas tem mais de 18 anos de idade.");
        System.out.println(menor5 + " pessoas tem menos de 5 anos de idade.");
        System.out.println(maiorIdade + " foi a maior idade recebida.");
    }
}

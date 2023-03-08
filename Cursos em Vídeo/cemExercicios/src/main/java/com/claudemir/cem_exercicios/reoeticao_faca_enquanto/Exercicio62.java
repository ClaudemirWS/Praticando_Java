package com.claudemir.cem_exercicios.reoeticao_faca_enquanto;

import java.util.Scanner;

/**
 * @author Claudemir
 */
public class Exercicio62 {

    public static void main(String[] args) {
        int num = 1, idade = 0, qtd = 0, media = 0, maior21 = 0;
        do {
            Scanner sc = new Scanner(System.in);
            //CONTA COMO UMA PESSOA A MAIS
            qtd += 1;
            System.out.print("Digite a idade de uma pessoa: ");
            idade = sc.nextInt();
            //ADICIONA A IDADE A FUTURA SOMA DA MÉDIA
            media += idade;
            //SE A IDADE FOR MAIOR QUE 21, CONTABILIZA
            if (idade > 21) {
                maior21 += 1;
            }
            System.out.print("Continuar para próxima pessoa (1 - SIM / 0 - NÃO): ");
            num = sc.nextInt();
        } while (num == 1);
        //APRESENTA OS RESULTADOS
        System.out.println(qtd + " idades foram recebidas.");
        System.out.println(media/qtd + " foi a média entre todas as idades.");
        System.out.println(maior21 + " pessoas tem mais de 21 anos.");
    }
}

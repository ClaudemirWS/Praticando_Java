package com.claudemir.cem_exercicios.repeticoes_enquanto;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Exercicio55 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int comp, jog, cont = 4;
        comp = random.nextInt(10);
        while (cont != 0) {
            System.out.println("===== ACERTE O NÚMERO =====");
            System.out.print("(" + cont + ") Tentativas. Qual o número sorteado: ");
            jog = sc.nextInt();
            if (comp == jog) {
                System.out.println("Você acertou! O número foi o " + jog + ".");
            } else {
                System.out.println("Você errou!");
            }
            cont -= 1;
        }
        if (cont == 0) {
            System.out.println("Você não conseguiu acertar, o número era o " + comp + ".");
        }
    }
}

package com.claudemir.cem_exercicios.condicoes_compostas;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Exercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int comp, jog;
        System.out.println("===== PEDRA PAPEL OU TESOURA =====");
        comp = random.nextInt(3);
        System.out.print("0 - PEDRA | 1 - PAPEL | 2 - TESOURA: ");
        jog = sc.nextInt();
        if (comp == jog)
        {
            System.out.println("Empate!");
        }
        else if (comp == 0 && jog == 2 || comp == 1 && jog == 0 || comp == 2 && jog == 1)
        {
            System.out.println("O computador ganhou!");
        }
        else
        {
            System.out.println("O jogador ganhou!");
        }        
    }
}

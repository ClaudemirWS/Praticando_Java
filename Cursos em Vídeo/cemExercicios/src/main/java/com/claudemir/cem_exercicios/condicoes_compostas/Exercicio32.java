package com.claudemir.cem_exercicios.condicoes_compostas;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Exercicio32 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int comp, jog;
        comp = random.nextInt(5);
        System.out.println("===== ACERTE O NÚMERO DE 1 A 5 =====");
        System.out.print("Número: ");
        jog = sc.nextInt();
        if (jog == comp) {
            System.out.println("Acertou!");
        } else {
            System.out.println("Errou!");
        }

    }
}

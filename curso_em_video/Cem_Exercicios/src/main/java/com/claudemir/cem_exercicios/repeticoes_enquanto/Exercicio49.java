package com.claudemir.cem_exercicios.repeticoes_enquanto;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Exercicio49 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 1, max = 6, num = 0, par = 0, impar = 0;
        System.out.println("===== NÚMEROS PARES E ÍMPARES ====");
        while (cont < max + 1) {
            System.out.print("Digite o " + cont + "º número: ");
            num = sc.nextInt();
            if (num % 2 == 0) {
                par += 1;
            } else {
                impar += 1;
            }
            cont += 1;
        }
        System.out.println("Foram digitados " + par + " números pares.");
        System.out.println("Foram digitados " + impar + " números ímpares.");
    }
}
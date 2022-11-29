package com.claudemir.cem_exercicios.sequencias_basicas;

import java.util.Scanner;

/**
 * REFAZENDO OS CEM EXERCICIOS QUE FIZ EM PORTUGOL
 *
 * @author Claudemir Souza
 */
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("===== ANTECESSOR E SUCESSOR =====");
        System.out.print("Digite um número inteiro: ");
        num = sc.nextInt();
        System.out.println("O antecessor do número " + num + " é o " + (num-1));
        System.out.println("O sucessor do número " + num + " é o " + (num+1));
    }
    
}

package com.claudemir.cem_exercicios.repeticoes_enquanto;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Exercicio44 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorIni, valorFim, valorIncr;
        System.out.println("===== CONTADOR =====");
        System.out.print("Digite o valor inicial da contagem: ");
        valorIni = sc.nextInt();
        System.out.print("Digite o valor final da contagem: ");
        valorFim = sc.nextInt();
        System.out.print("Digite o incremento da contagem: ");
        valorIncr = sc.nextInt();

        //CONTADOR
        while (valorIni < valorFim + 1) {
            System.out.print(valorIni + " -> ");
            valorIni += valorIncr;
        }
        System.out.print("Acabou!");
    }
}

package com.claudemir.cem_exercicios.repeticoes_enquanto;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Exercicio45 {

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
        if (valorIni < valorFim) {
            while (valorIni < valorFim + 1) {
                System.out.print(valorIni + " -> ");
                valorIni += valorIncr;
            }
        } else if (valorIni > valorFim) {
            while (valorIni > valorFim - 1 ) {
                System.out.print(valorIni + " -> ");
                valorIni -= valorIncr;
            }
        }
        else{
            System.out.println("Valor inicial e final são os mesmos.");
        }
        System.out.print("Acabou!");
    }
}

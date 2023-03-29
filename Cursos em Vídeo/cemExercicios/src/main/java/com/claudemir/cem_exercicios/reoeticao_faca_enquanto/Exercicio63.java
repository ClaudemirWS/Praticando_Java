package com.claudemir.cem_exercicios.reoeticao_faca_enquanto;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author Claudemir
 */
public class Exercicio63 {

    public static void main(String[] args) {
        String prog;
        int n, soma = 0, menor = 0, qtd = 0, pares = 0;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite um número (0 para SAIR): ");
            n = sc.nextInt();
            if (n != 0) {
                //SOMA TODOS OS NÚMEROS
                soma += n;
                //ARMAZENA O MENOR NÚMERO
                if (qtd == 0) {
                    menor = n;
                } else if (n < menor) {
                    menor = n;
                }
                //CONTA QUANTOS PARES EXISTEM
                if (n % 2 == 0) {
                    pares += 1;
                }
                //AUMENTA UM NÚMERO A QUANTIDADE
                qtd += 1;
            }
        } while (n != 0);

        System.out.println("\n" + qtd + " números foram cadastrados.");
        System.out.println("A SOMA entre todos foi " + soma);
        System.out.println("O MENOR número foi o " + menor);
        System.out.println("A MÉDIA entre todos os números foi " + (soma/qtd));
        System.out.println(pares + " números são PARES.");
    }
}

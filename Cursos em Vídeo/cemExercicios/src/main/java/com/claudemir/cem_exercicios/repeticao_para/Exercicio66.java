package com.claudemir.cem_exercicios.repeticao_para;

import java.util.Scanner;

/**
 * @author Claudemir
 */
public class Exercicio66 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor;

        //RECEBE O NÚMERO
        System.out.print("Digite um valor: ");
        valor = sc.nextInt();

        //MOSTRA A TABUADA DO NÚMERO
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + valor + " = " + (i*valor));
        }
    }
}

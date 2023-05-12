package com.claudemir.cem_exercicios.funcoes;

import java.util.Scanner;

/**
 * @author Claudemir
 */
public class Exercicio99 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a base: ");
        int bas = sc.nextInt();
        System.out.print("Digite o expoente: ");
        int exp = sc.nextInt();
        System.out.println(bas + " elevado a " + exp + " potência é igual a: " + potencia(bas, exp));
    }

    public static Double potencia(int base, int exp) {
        double pot = Math.pow(base, exp);
        return pot;
    }
}

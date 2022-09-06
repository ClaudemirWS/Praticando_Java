package com.claudemir.cem_exercicios.condicoes_basicas;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Exercicio22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== ANOS PARA ALISTAMENTO =====");
        int ano = 2022, nasc, idade;
        System.out.print("Digite seu ano de nascimento: ");
        nasc = sc.nextInt();
        idade = ano - nasc;
        if (idade == 18) {
            System.out.println("Você deve se alistar neste ano.");
        } else if (idade > 18) {
            System.out.println("Você está " + (idade - 18) + " anos atrasado para o alistamento.");
        } else {
            System.out.println("Faltam " + (18 - idade) + " anos para você se alistar.");
        }
    }

}

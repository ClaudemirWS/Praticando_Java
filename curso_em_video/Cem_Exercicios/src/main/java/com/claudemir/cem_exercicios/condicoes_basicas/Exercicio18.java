package com.claudemir.cem_exercicios.condicoes_basicas;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nasc, ano = 2022, idade = 0;
        System.out.println("===== IDADE PARA VOTAR =====");
        System.out.print("Digite seu ano de nascimento: ");
        nasc = sc.nextInt();
        idade = ano-nasc;
        System.out.println("Você tem " + idade + " anos de idade.");
        if (idade >= 17){
            System.out.println("Você já pode votar!");
        }
        else{
            System.out.println("Você ainda não pode votar!");
        }
    }
}

package com.claudemir.cem_exercicios.um_para_vinte;

import java.util.Scanner;

/**
 * REFAZENDO OS CEM EXERCICIOS QUE FIZ EM PORTUGOL
 *
 * @author Claudemir Souza
 */
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        //RECEBE E PRINTA NOME DO USUÁRIO
        System.out.print("Qual é o seu nome? ");
        nome = sc.nextLine();
        System.out.println("Bem vindo!, " + nome);
    }
}

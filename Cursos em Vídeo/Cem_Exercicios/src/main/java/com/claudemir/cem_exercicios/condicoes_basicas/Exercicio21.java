package com.claudemir.cem_exercicios.condicoes_basicas;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Exercicio21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ano;
        System.out.println("===== ANO BISSEXTO =====");
        System.out.print("Digite um ano: ");
        ano = sc.nextInt();
        if (ano % 4 == 0) {
            //SE O ANO NÃO FOR DIVISÍVEL POR 100
            if (ano % 100 != 0) {

                System.out.println("O ano " + ano + " é bissexto!");
            } //SE O ANO FOR DIVISÍVEL POR 100
            else if (ano % 100 == 0) {

                //SE O ANO FOR DIVISÍVEL POR  400
                if (ano % 400 == 0) {

                    System.out.println("O ano " + ano + " é bissexto!");
                } //SE NAO ATENDER A NENHUMA DAS POSSIBILIDADES
                else {

                    System.out.println("O ano " + ano + " não é bissexto!");
                }
            }
        } //SE NAO ATENDER A NENHUMA DAS POSSIBILIDADES
        else {

            System.out.println("O ano " + ano + " não é bissexto!");
        }
    }

}

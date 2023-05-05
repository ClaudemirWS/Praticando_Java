package com.claudemir.cem_exercicios.procedimentos;

import java.util.Scanner;

/**
 * @author Claudemir
 */
public class Exercicio87 {

    public static void main(String[] args) {
        String msg = "Mensagem em branco";
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua mensagem: ");
        msg = sc.nextLine();
        mensagem(msg);

    }

    //FUNÇÃO QUE RECEBE VALORES
    private static void mensagem(String msg) {
        System.out.println("\n+---------------------------------+");
        System.out.println(msg);
        System.out.println("\n+---------------------------------+");

    }
}

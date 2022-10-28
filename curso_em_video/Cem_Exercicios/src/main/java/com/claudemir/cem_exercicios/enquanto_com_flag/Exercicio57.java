package com.claudemir.cem_exercicios.enquanto_com_flag;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Exercicio57 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 1;
        String sexo, sal;
        float salm = 0, salf = 0;
        System.out.println("===== TOTAL DE SALÁRIOS POR SEXO =====");
        while (cont == 1) {
            //RECEBE OS DADOS
            Scanner scString = new Scanner(System.in);
            System.out.print("Digite seu sexo (M ou F): ");
            sexo = scString.nextLine().strip().toUpperCase();
            System.out.print("Digite seu salário: ");
            sal = scString.nextLine().strip();
            //SALVA SALÁRIO DE ACORDO COM O SEXO
            if (sexo.equals("M")) {
                salm += Float.parseFloat(sal);
            } else if (sexo.equals("F")) {
                salf += Float.parseFloat(sal);
            }
            System.out.print("\nDeseja continuar? 1 - SIM | 2 - NÃO: ");
            cont = sc.nextInt();
        }

        System.out.println("\nTotal de salário pago aos homens: " + salm);
        System.out.println("Total de salário pago as mulheres: " + salf);
    }
}

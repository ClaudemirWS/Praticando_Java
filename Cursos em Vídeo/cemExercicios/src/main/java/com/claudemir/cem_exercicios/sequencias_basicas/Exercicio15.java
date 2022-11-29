package com.claudemir.cem_exercicios.sequencias_basicas;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dias;
        float total = 0;
        System.out.println("===== SALÁRIO DE UM FUNCIONÁRIO =====");
        System.out.print("Quantos dias o funcionário trabalhou: ");
        dias = sc.nextInt();
        total = (dias*8)*5;
        System.out.println("Salário este mês: R$ " + total);
    }
}

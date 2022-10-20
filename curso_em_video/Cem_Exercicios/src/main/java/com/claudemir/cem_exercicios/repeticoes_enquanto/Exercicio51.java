package com.claudemir.cem_exercicios.repeticoes_enquanto;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Exercicio51 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 1, max = 8, num = 0, maior = 0, menor = 0;
        System.out.println("===== COMPARANDO PREÇOS ====");
        while (cont < max + 1) {
            System.out.print("Digite o " + cont + "º preço: R$");
            num = sc.nextInt();
            if (cont == 1) {
                maior = num;
                menor = num;
            } else if (num > maior) {
                maior = num;
            } else if (num < menor) {
                menor = num;
            }
            cont += 1;
        }
        System.out.println("O maior preço digitado foi R$ " + maior);
        System.out.println("O menor preço digitado foi R$ " + menor);

    }
}

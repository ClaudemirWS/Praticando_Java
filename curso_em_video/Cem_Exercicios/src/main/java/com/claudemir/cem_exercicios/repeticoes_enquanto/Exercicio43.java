package com.claudemir.cem_exercicios.repeticoes_enquanto;

/**
 * @author Claudemir Souza
 */
public class Exercicio43 {

    public static void main(String[] args) {
        int val = 30;
        System.out.println("===== DIVISIVEIS POR 4 DE 30 ATÉ 1 =====");
        while (val > -1) {
            if (val % 4 != 0) {
                System.out.print(val + " -> ");
            } else if (val == 0) {
                System.out.print("Acabou!");
            } else if (val % 4 == 0) {
                System.out.print("[" + val + "] -> ");
            }
            val -= 1;
        }
    }
}

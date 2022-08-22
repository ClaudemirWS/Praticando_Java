package atividade5;

import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Atividade5 {

    public static void main(String[] args) {

        int programa = 0;
        Cardapio cardapio = new Cardapio();

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("\t\t\t===== MENU PRINCIPAL =====");
            System.out.print("1 - Ver Cardapio | 2 - Atualizar Cardápio | 3 - Novo Pedido | 4 - Sair: ");
            programa = sc.nextInt();
            Scanner dados = new Scanner(System.in);
            if (programa == 1) {
                cardapio.listaCardapio();
            } else if (programa == 2) {
                cardapio.atualizaCardapio();
            } else if (programa == 3) {

            } else if (programa == 4) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção incorreta.");
            }

        } while (programa != 4);
    }

}

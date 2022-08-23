package atividade5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Atividade5 {

    public static void main(String[] args) {

        int programa = 0;
        Cardapio cardapio = new Cardapio();
        List<Pedido> Cozinha = new ArrayList<>();

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("\t\t\t===== MENU PRINCIPAL =====");
            System.out.print("1 - Ver Cardapio | 2 - Atualizar Cardápio | 3 - Novo Pedido | 5 - Sair: ");
            programa = sc.nextInt();
            Scanner dados = new Scanner(System.in);
            if (programa == 1) {
                cardapio.listaCardapio();
            } else if (programa == 2) {
                cardapio.atualizaCardapio();
            } else if (programa == 3) {
                Pedido pedido = new Pedido(cardapio.getPizzas(), cardapio.getBebidas());
                pedido.preenchePedido();
                pedido.mostraPedido();
                Cozinha.add(pedido);
            } else if (programa == 4) {
                //ORDEM DE PEDIDOS PARA A COZINHA
            } else if (programa == 5) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção incorreta.");
            }

        } while (programa != 5);
    }

}

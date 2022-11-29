package atividade5;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Atividade5 {

    public static void main(String[] args) {

        //FUNCIONALIDADES DO PROGRAMA 
        int programa = 0, cliente = 0, cozinha = 0;
        Cardapio cardapio = new Cardapio();
        LinkedList<Pedido> Cozinha = new LinkedList<>();

        //INICIA REPETIÇÃO
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("\t\t===== MENU PRINCIPAL =====");
            System.out.print("1 - Acesso Cliente | 2 - Acesso Cozinha | 3 - Sair: ");
            programa = sc.nextInt();
            //ACESSO AO CLIENTE
            if (programa == 1) {
                System.out.println("\t\t===== MENU CLIENTE =====");
                System.out.print("1 - Ver Cardápio | 2 - Fazer Pedido | 3 - Voltar: ");
                cliente = sc.nextInt();
                if (cliente == 1) {
                    cardapio.listaCardapio();
                } else if (cliente == 2) {
                    Pedido pedido = new Pedido(cardapio.getPizzas(), cardapio.getBebidas());
                    pedido.preenchePedido(); //PREENCHE O PEDIDO COM OS ITENS
                    pedido.mostraPedido(); //MOSTRA O PEDIDO REGISTRADO
                    Cozinha.add(pedido); //ADICIONA A LISTA DE PEDIDOS PARA A COZINHA
                }
            //ACESSO DA COZINHA
            } else if (programa == 2) {
                System.out.println("\t\t===== MENU COZINHA =====");
                System.out.print("1 - Atualizar Cardápio | 2 - Preparar Pedido | 3 - Voltar: ");
                cozinha = sc.nextInt();
                if (cozinha == 1) {
                    cardapio.atualizaCardapio(); //ATUALIZA O CARDÁPIO
                } else if (cozinha == 2) {
                    if (!Cozinha.isEmpty()) {
                        for (Pedido p : Cozinha) {
                            p.mostraPedido(); //MOSTRA O PEDIDO A SER FEITO
                            Cozinha.removeFirst(); //REMOVE O PRIMEIRO PEDIDO
                        }
                    } else {
                        System.out.println("Não há pedidos.");
                    }
                }
            } else if (programa == 3) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção incorreta.");
            }

        } while (programa != 3);
    }

}

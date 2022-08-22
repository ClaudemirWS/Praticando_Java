package atividade5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Pedido {

    private Collection<String> pizzasPedido = new ArrayList();
    private Collection<String> bebidasPedido = new ArrayList();
    private int numeroMesa = 0, programa = 0;
    private String nome;

    public Pedido() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número da mesa: ");
        this.numeroMesa = sc.nextInt();
    }

    public void preenchePedido() {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("\t\t\t===== MESA " + numeroMesa + " =====");
            System.out.print("1 - Adicionar Pizza | 2 - Adicionar Bebida | 3 - Voltar: ");
            programa = sc.nextInt();
            Scanner dados = new Scanner(System.in);
            if (programa == 1) {
                System.out.print("Nome da Pizza: ");
                nome = dados.nextLine();
            } else if (programa == 2) {
                System.out.print("Nome da Bebida: ");
                nome = sc.nextLine();
            } else if (programa == 3) {
                System.out.println("voltando...");
            } else {
                System.out.println("Opção incorreta.");
            }
        } while (programa != 3);

    }

}

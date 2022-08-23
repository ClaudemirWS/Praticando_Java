package atividade5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Pedido {

    //RECEBE AS PIZZAS E BEBIDAS DO CARDÁPIO
    private List<Pizza> Pizzas = new ArrayList<>();
    private List<Bebida> Bebidas = new ArrayList<>();
    //VAI ARMAZENAR AS PIZZAS E BEBIDAS DO PEDIDO
    private List<String> pizzasPedido = new ArrayList<>();
    private List<String> bebidasPedido = new ArrayList<>();
    //FUNCIONALIDADES DO PROGRAMA
    private int numeroMesa = 0, programa = 0;
    private String nome;
    private double total;

    //CONSTRUTOR QUE RECEBE OS ITENS DO CARDÁPIO
    public Pedido(List<Pizza> Pizzas, List<Bebida> Bebidas) {
        this.Pizzas = Pizzas;
        this.Bebidas = Bebidas;
    }

    //PREENCHE O PEDIDO COM ITENS
    public void preenchePedido() {
        Scanner sc = new Scanner(System.in); //SCANNER PARA INTEIROS
        System.out.print("Número da mesa: ");
        this.numeroMesa = sc.nextInt();
        do {
            System.out.println("\t\t\t===== MESA " + numeroMesa + " =====");
            System.out.print("1 - Adicionar Pizza | 2 - Adicionar Bebida | 3 - Terminar: ");
            programa = sc.nextInt();
            Scanner dados = new Scanner(System.in); //SCANNER PARA STRINGS
            switch (programa) {
                case 1 -> {
                    //ADICIONA PIZZA AO PEDIDO
                    System.out.print("Nome da Pizza: ");
                    nome = dados.nextLine();
                    for (Pizza p : Pizzas) {
                        if (nome.equalsIgnoreCase(p.getNome())) {
                            pizzasPedido.add(p.getDescricao());
                            total += p.getPreco(); //SOMA AO TOTAL DO PEDIDO
                            System.out.println("Pizza adicionada ao pedido.");
                        }
                    }

                }
                case 2 -> {
                    //ADICIONA BEBIDA AO PEDIDO
                    System.out.print("Nome da Bebida: ");
                    nome = dados.nextLine();
                    for (Bebida b : Bebidas) {
                        if (nome.equalsIgnoreCase(b.getNome())) {
                            bebidasPedido.add(b.getDescricao());
                            total += b.getPreco(); //SOMA AO TOTAL DO PEDIDO
                            System.out.println("Bebida adicionada ao pedido.");
                        }
                    }

                }
                //SAI DO PROGRAMA OU APRESENTA MENSAGEM DE ERRO
                case 3 ->
                    System.out.println("voltando...");
                default ->
                    System.out.println("Opção incorreta.");
            }
        } while (programa != 3);
    }

    public void mostraPedido() {
        System.out.println("\t\t\t===== PEDIDO DA MESA " + numeroMesa + " =====");
        System.out.println("PIZZAS: ");
        for (String p : pizzasPedido) {
            System.out.println(p);
        }
        System.out.println("BEBIDAS: ");
        for (String b : bebidasPedido) {
            System.out.println(b);
        }
        System.out.println("TOTAL DO PEDIDO: R$ " + total);

    }

}

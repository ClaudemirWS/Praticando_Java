package atividade5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Cardapio {

    //LISTA DE ITENS DO CARDÁPIO
    private List<Pizza> Pizzas = new ArrayList<>();
    private List<Bebida> Bebidas = new ArrayList<>();
    //FUNCIONALIDADES DO PROGRAMA
    private String nomePizzaria = "PIZZARIA SENAC";
    private int programa = 0;

    //CONSTRUTOR
    public Cardapio() {

    }

    //VAI ATUALIZAR O CARDÁPIO COM NOVOS ITENS
    public void atualizaCardapio() {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("\t\t===== ATUALIZA CARDÁPIO =====");
            System.out.print("1 - Nova Pizza | 2 - Nova Bebida | 3 - Voltar: ");
            programa = sc.nextInt();
            switch (programa) {
                case 1 -> {
                    //CADASTRA NOVA PIZZA NO CARDÁPIO
                    Pizza pizza = new Pizza();
                    Pizzas.add(pizza);
                }
                case 2 -> {
                    //CADASTRA NOVA BEBIDA NO CARDÁPIO
                    Bebida bebida = new Bebida();
                    Bebidas.add(bebida);
                }
                //VOLTA AO MENU OU APRESENTA MENSAGEM DE ERRO
                case 3 ->
                    System.out.println("voltando...");
                default ->
                    System.out.println("Opção incorreta.");
            }

        } while (programa != 3);
    }

    //LISTA OS ITENS DO CARDÁPIO
    public void listaCardapio() {
        System.out.println("\t===== CARDAPIO "+ nomePizzaria +" ===== ");
        if (!Pizzas.isEmpty() && !Bebidas.isEmpty()) {
            System.out.println("PIZZAS: ");
            for (Pizza p : Pizzas) {
                System.out.println(p.getDescricao());
            }
            System.out.println("BEBIDAS: ");
            for (Bebida b : Bebidas) {
                System.out.println(b.getDescricao());
            }
        }
        else{
            System.out.println("O cardápio está vazio.");
        }
    }

    //RETORNA A LISTA DE PIZZAS DO CARDÁPIO
    public List getPizzas() {
        return Pizzas;
    }

    //RETORNA A LISTA DE BEBIDAS DO CARDÁPIO
    public List getBebidas() {
        return Bebidas;
    }
}

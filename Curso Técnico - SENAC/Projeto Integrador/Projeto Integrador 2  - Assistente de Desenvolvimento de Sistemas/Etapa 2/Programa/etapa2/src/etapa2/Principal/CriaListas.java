package etapa2.Principal;

import etapa2.modeloConteudo.Filme;
import etapa2.modeloConteudo.Serie;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class CriaListas {

    //LISTA DE FILMES E SÉRIES
    private List<Serie> Series = new ArrayList<>();
    private List<Filme> Filmes = new ArrayList<>();
    //FUNCIONALIDADES DO PROGRAMA
    private int programa = 0;

    //VAI ATUALIZAR A LISTA
    public void atualizaListas() {
        //INICIA O SALVAMENTO DE UM NOVO FILME OU SÉRIE
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("\t\t\n===== ADICIONAR NOVO =====");
            System.out.print("1 - Novo Filme | 2 - Nova Serie | 3 - Voltar: ");
            programa = sc.nextInt();
            switch (programa) {
                case 1 -> {
                    //CADASTRA NOVO FILME
                    Filme filme = new Filme();
                    Filmes.add(filme);
                }
                case 2 -> {
                    //CADASTRA NOVA SERIE
                    Serie serie = new Serie();
                    Series.add(serie);
                }
                //VOLTA AO MENU OU APRESENTA MENSAGEM DE ERRO
                case 3 ->
                    System.out.println("voltando...");
                default ->
                    System.out.println("Opção incorreta.");
            }

        } while (programa != 3);
    }

    //LISTA OS FILMES
    public void listaFilmes() {
        System.out.println("\t===== FILMES =====");
        if (!Filmes.isEmpty()) {
            for (Filme f : Filmes) {
                System.out.println(f.getDescricao());
            }
        } else {
            System.out.println("A lista está vazia.");
        }
    }

    //LISTA AS SÉRIES
    public void listaSeries() {
        System.out.println("\t===== SÉRIES =====");
        if (!Series.isEmpty()) {
            for (Serie s : Series) {
                System.out.println(s.getDescricao());
            }
        } else {
            System.out.println("A lista está vazia.");
        }
    }

}

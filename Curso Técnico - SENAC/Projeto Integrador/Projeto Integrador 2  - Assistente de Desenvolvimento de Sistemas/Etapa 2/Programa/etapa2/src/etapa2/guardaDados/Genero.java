package etapa2.guardaDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Claudemir
 */
public class Genero {

    //CRIA LISTA DE GENEROS 
    private List genero = new ArrayList();

    //FUNCIONALIDADES DO PROGRAMA
    private int programa = 0;
    private String escolha = "";

    //SERÃO COLOCADOS EM UM COMBO BOX QUANDO HOUVER INTERFACE
    public void atualizaGenero() {
        genero.add("Ação");
        genero.add("Aventura");
        genero.add("Animação");
        genero.add("Biografia");
        genero.add("Comédia");
        genero.add("Documentário");
        genero.add("Drama");
        genero.add("Esportes");
        genero.add("Fantasia");
        genero.add("Ficção Científica");
        genero.add("Músicais");
        genero.add("Policial");
        genero.add("Romance");
        genero.add("Suspense");
        genero.add("Terror");

    }

    //LISTA GENEROS E RETORNA VALOR ESCOLHIDO NO TECLADO
    public String getGenero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n===== SELECIONE UM GÊNERO =====");
        for (int i = 0; i < genero.size(); i++) {
            System.out.println(i + " = " + genero.get(i));
        }
        System.out.print("Sua escolha: ");
        programa = sc.nextInt();
        escolha = String.valueOf(genero.get(programa));

        return escolha;
    }
}
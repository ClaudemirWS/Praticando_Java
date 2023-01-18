package etapa2.modeloConteudo;

import etapa2.guardaDados.Genero;
import etapa2.guardaDados.Streaming;
import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Serie {

    //ATRIBUTOS DA SERIE
    private String nome, genero, streaming;
    private Streaming nomeStreaming = new Streaming();
    private Genero nomeGenero = new Genero();

    //CONSTRUTOR
    public Serie() {
        recebeDadosSerie();
    }

    private void recebeDadosSerie() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNome da serie: ");
        this.nome = sc.nextLine();
        this.genero = nomeGenero.getGenero();
        this.streaming = nomeStreaming.getStreaming();
    }

    //RETORNA UMA MENSAGEM DESCREVENDO A SERIE 
    public String getDescricao() {
        return ("Serie " + nome + " de " + genero + " está no(a) " + streaming + ".");
    }
}

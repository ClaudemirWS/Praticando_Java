package etapa4.modeloConteudo;

import etapa4.guardaDados.Genero;
import etapa4.guardaDados.Streaming;
import java.util.Scanner;

/**
 * @author Claudemir Souza
 */
public class Filme {

    //ATRIBUTOS DO FILME
    private String nome, genero, streaming;
    private Streaming nomeStreaming = new Streaming();
    private Genero nomeGenero = new Genero();

    //CONSTRUTOR
    public Filme() {
        recebeDadosFilme();
    }

    private void recebeDadosFilme() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNome do filme: ");
        this.nome = sc.nextLine().strip();
        this.streaming = nomeStreaming.getStreaming();
        this.genero = nomeGenero.getGenero();
    }

    //RETORNA UMA MENSAGEM DESCREVENDO O FILME 
    public String getDescricao() {
        return ("Filme " + nome + " de " + genero + " está no(a) " + streaming + ".");
    }
}

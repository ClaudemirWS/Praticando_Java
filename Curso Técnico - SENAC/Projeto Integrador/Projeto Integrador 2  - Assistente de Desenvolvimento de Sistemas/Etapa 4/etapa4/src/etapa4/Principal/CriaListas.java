package etapa4.Principal;

import etapa4.modeloConteudo.Conteudo;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Claudemir Souza
 */
public class CriaListas {

    //CRIA LISTAS
    private static final List<Conteudo> filmes = new ArrayList<>();
    private static final List<Conteudo> series = new ArrayList<>();

    //RETORNA LISTA DE FILMES
    public static List<Conteudo> ListarFilmes() {
        return filmes;
    }

    //RETORNA LISTA DE SERIES
    public static List<Conteudo> ListarSeries() {
        return series;
    }

    //ADICIONA FILME A LISTA
    public static void AdicionarFilme(Conteudo filme) {
        filmes.add(filme);
    }
    
    //ADICIONA SERIE A LISTA
    public static void AdicionarSerie(Conteudo serie) {
        series.add(serie);
    }

}

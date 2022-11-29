package teste2poo;

/**
 * @author Claudemir Souza
 */
public class Episodio extends Video {

    public int episodio;
    public int temporada;

    //ALGUMAS CHAMADAS DA SUPERCLASSE VÍDEO E OUTRAS DA MESMA CLASSE EPISÓDIO
    public Episodio(String _titulo, String _direcao, int _ano, float _duracao, int _episodio, int _temporada) {
        super(_titulo, _direcao, _ano, _duracao);
        this.episodio = _episodio;
        this.temporada = _temporada;
    }

    @Override
    public void tocar() {
        System.out.println("Você está assistindo ao episódio nº" + episodio
                + " da temporada " + temporada
                + " da série " + titulo);
    }
}

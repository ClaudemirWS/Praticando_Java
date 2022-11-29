package teste2poo;

/**
 * @author Claudemir Souza
 */
public class Filme extends Video {

    public String genero;
    public String produtora;

    //ALGUMAS CHAMADAS DA SUPERCLASSE VÍDEO E OUTRAS DA MESMA CLASSE FILME
    public Filme(String _genero, String _produtora, String _titulo, String _direcao, int _ano, float _duracao) {
        super(_titulo, _direcao, _ano, _duracao);
        this.genero = _genero;
        this.produtora = _produtora;
    }

    @Override
    public void tocar() {
        System.out.println("Você está assistindo ao filme " + titulo
                + ", que tem direção de " + direcao
                + ". Este é um filme de " + genero
                + " e durará " + duracao + " minutos.");
    }
}

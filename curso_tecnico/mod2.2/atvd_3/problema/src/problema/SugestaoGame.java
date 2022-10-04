package problema;

/**
 * @author Claudemir Souza
 */
public class SugestaoGame {

    private Esportes gameEsporte;
    private Rpg gameRpg;
    private Modelo fabricaModelo;

    public SugestaoGame(Modelo fabrica) {
        fabricaModelo = fabrica;
    }

    public Esportes getGameEsporte() {
        return gameEsporte;
    }

    public Rpg getGameRpg() {
        return gameRpg;
    }

    public void gerar() {
        gameEsporte = fabricaModelo.getEsportes();
        gameRpg = fabricaModelo.getRpg();
    }
}

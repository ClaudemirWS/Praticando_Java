package problema;

/**
 * @author Claudemir Souza
 */
class FabricaNovos implements Modelo {

    public Esportes getEsportes() {
        return new Corr_Res();
    }

    public Rpg getRpg() {
        return new Corr_Vel();
    }
    
}

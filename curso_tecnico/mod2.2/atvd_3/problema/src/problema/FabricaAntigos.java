package problema;

/**
 * @author Claudemir Souza
 */
class FabricaAntigos implements Modelo {

    public Esportes getEsportes() {
        return new Musc_Res();
    }

    public Rpg getRpg() {
        return new Musc_Vel();
    }
}

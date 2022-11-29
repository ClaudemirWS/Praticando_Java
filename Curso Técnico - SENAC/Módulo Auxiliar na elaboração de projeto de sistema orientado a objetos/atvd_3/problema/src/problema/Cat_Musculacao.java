package problema;

/**
 * @author Claudemir Souza
 */
class Cat_Musculacao implements Modelo {

    public Resistencia getResistencia() {
        return new Musc_Res();
    }

    public Velocidade getVelocidade() {
        return new Musc_Vel();
    }
}

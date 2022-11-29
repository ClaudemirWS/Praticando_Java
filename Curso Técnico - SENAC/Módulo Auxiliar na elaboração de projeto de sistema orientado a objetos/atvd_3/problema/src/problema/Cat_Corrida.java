package problema;

/**
 * @author Claudemir Souza
 */
class Cat_Corrida implements Modelo {

    public Resistencia getResistencia() {
        return new Corr_Res();
    }

    public Velocidade getVelocidade() {
        return new Corr_Vel();
    }
    
}

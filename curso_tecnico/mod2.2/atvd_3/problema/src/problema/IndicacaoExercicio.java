package problema;

/**
 * @author Claudemir Souza
 */
public class IndicacaoExercicio {

    private Resistencia exercResistencia;
    private Velocidade exercVelocidade;
    private Modelo fabricaModelo;

    public IndicacaoExercicio(Modelo fabrica) {
        fabricaModelo = fabrica;
    }

    public Resistencia getResistencia() {
        return exercResistencia;
    }

    public Velocidade getVelocidade() {
        return exercVelocidade;
    }

    public void gerar() {
        exercResistencia = fabricaModelo.getResistencia();
        exercVelocidade = fabricaModelo.getVelocidade();
    }
}

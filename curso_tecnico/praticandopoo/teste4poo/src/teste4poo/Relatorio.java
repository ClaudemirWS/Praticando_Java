package teste4poo;

/**
 * @author Claudemir Souza
 */
public abstract class Relatorio {

    public String nomeEmpresa;
    protected float total;

    public String emiteCabecalho() {
        return nomeEmpresa + "\n-------";
    }

    public String emiteRodape() {
        return "\nTotal:" + total + "\n-------\nEste relatório é confidencial";
    }

    public abstract void emiteRelatorio();
}

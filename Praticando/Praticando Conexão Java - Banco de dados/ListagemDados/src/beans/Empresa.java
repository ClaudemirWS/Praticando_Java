package beans;

/**
 * @author Claudemir
 */
public class Empresa {

    private int id;
    private String nomeempresa;
    private String areaatuacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeempresa() {
        return nomeempresa;
    }

    public void setNomeempresa(String nomeempresa) {
        this.nomeempresa = nomeempresa;
    }

    public String getAreaatuacao() {
        return areaatuacao;
    }

    public void setAreaatuacao(String areaatuacao) {
        this.areaatuacao = areaatuacao;
    }

    @Override
    public String toString() {
        return this.nomeempresa;
    }

    @Override
    public boolean equals(Object objeto) {
        Empresa e = (Empresa) objeto;
        if (this.id == e.getId()) {
            return true;
        } else {
            return false;
        }
    }
}

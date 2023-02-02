package beans;

import java.util.Date;

/**
 *
 * @author Claudemir
 */
public class Funcionario {

    private int id;
    private String nomefunc;
    private Empresa empresaid; // Ao invés de esse atributo ser int, aqui criamos ele do tipo Objeto e fazemos uma associação devido a chave estrangeira
    private Date dataAdmissao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomefunc() {
        return nomefunc;
    }

    public void setNomefunc(String nomefunc) {
        this.nomefunc = nomefunc;
    }

    public Empresa getEmpresaid() {
        return empresaid;
    }

    public void setEmpresaid(Empresa empresaid) {
        this.empresaid = empresaid;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
}

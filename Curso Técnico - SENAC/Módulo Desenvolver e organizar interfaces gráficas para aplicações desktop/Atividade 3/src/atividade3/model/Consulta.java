package atividade3.model;

/**
 * @author Claudemir
 */
public class Consulta {

    private String nome;
    private String cpf;
    private String telefone;
    private String data;
    private String paciente;
    private String consRealizada;
    private String receitaObs;

    //ACESSA E SETA DADOS DO PACIENTE
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }
    
    public String getconsRealizada() {
        return consRealizada;
    }

    public void setconsRealizada(String consRealizada) {
        this.consRealizada = consRealizada;
    }
    
    public String getreceitaObs() {
        return receitaObs;
    }

    public void setreceitaObs(String receitaObs) {
        this.receitaObs = receitaObs;
    }

}

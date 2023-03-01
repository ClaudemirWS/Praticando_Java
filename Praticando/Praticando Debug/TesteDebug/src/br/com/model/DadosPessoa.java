package br.com.model;

/**
 * @author Claudemir
 */

//Classe que estabelece os atributos de um objeto pessoa
public class DadosPessoa {

    private String nome, telefone, cpf;
    private int id, idade;
    private Double peso;

    public DadosPessoa(String nome, String telefone, String cpf, int id, int idade, Double peso) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.id = id;
        this.idade = idade;
        this.peso = peso;
    }

    public DadosPessoa() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
}

package br.com.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalTime;

/**
 * @author Claudemir
 */
@Entity
@Table(name = "podcast")
public class Podcast {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(name = "produtor")
    private String produtor;
    @Column(name = "nomedoepisodio")
    private String nome;
    @Column(name = "numerodoepisodio")
    private Integer numero;
    @Column(name = "duracaoepisodio")
    private LocalTime duracao;
    @Column(name = "urlrepositorio")
    private String url;

    //CONSTRUTOR
    public Podcast() {

    }
    
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the produtor
     */
    public String getProdutor() {
        return produtor;
    }

    /**
     * @param produtor the produtor to set
     */
    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the numero
     */
    public Integer getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    /**
     * @return the duracao
     */
    public LocalTime getDuracao() {
        return duracao;
    }

    /**
     * @param duracao the duracao to set
     */
    public void setDuracao(LocalTime duracao) {
        this.duracao = duracao;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

}

package br.com.senac.persistencia;

import br.com.model.Podcast;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

/**
 * @author Claudemir
 */
public class PodcastDAO {

    public List<Podcast> listar() {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            Query consulta = em.createQuery("SELECT p FROM Podcast p");
            List<Podcast> podcasts = consulta.getResultList();
            return podcasts;
        } finally {
            JPAUtil.closeEtityManager();
        }
    }

    public List<Podcast> listarProdutor(String produtor) {
        EntityManager em = JPAUtil.getEntityManager();
        String pesquisa = ("%" + produtor + "%");
        try {
            Query consulta = em.createQuery("SELECT p FROM Podcast p WHERE p.produtor LIKE :produtor");
            consulta.setParameter("produtor", pesquisa);
            List<Podcast> podcasts = consulta.getResultList();
            return podcasts;
        } finally {
            JPAUtil.closeEtityManager();
        }
    }
}

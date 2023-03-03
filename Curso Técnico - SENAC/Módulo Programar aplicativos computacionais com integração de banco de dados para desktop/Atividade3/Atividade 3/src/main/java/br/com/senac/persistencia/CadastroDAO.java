package br.com.senac.persistencia;

import br.com.model.Podcast;
import jakarta.persistence.EntityManager;

/**
 * @author Claudemir
 */
public class CadastroDAO {

    public void cadastrar(Podcast p) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.closeEtityManager();
        }
    }

    public void excluir(String id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            Podcast p = em.find(Podcast.class, id);
            if (p != null) {
                em.getTransaction().begin();
                em.remove(p);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.closeEtityManager();
        }
    }
}

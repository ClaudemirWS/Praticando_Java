package br.com.senac.financasjpa.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Claudemir
 */
public class ContaDAO {

    public void cadastrar(Receita r) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(r);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.closeEtityManager();
        }
    }

    public List<Conta> listar() {
        EntityManager em = JPAUtil.getEntityManager();
        //resultado será devolvido nesta lista
        //usa import java.util.ArrayList;
        List<Conta> contas = new ArrayList<Conta>();
        try {
            //atenção: import jakarta.persistence.Query;
            Query consulta = em.createQuery("SELECT c FROM Conta c");
            //atenção: import java.util.List;
            contas = consulta.getResultList();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.closeEtityManager();
        }
        return contas;
    }
}

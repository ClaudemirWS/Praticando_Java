package br.com.senac.financasjpa.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * @author Claudemir
 */
public class DespesaDAO {

    public void cadastrar(Despesa d) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(d);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.closeEtityManager();
        }
    }

    public List<Despesa> listar(String filtroDescricao, String dataIni, String dataFim) {
        EntityManager em = JPAUtil.getEntityManager();
        List despesas = null;
        try {
            String textoQuery = "SELECT d FROM Despesa d "
                    + " WHERE (:descricao is null OR d.descricao LIKE :descricao ) "
                    + " AND (:dataInicial is null OR d.data >= :dataInicial)"
                    + " AND (:dataFinal is null OR d.data <= :dataFinal)";

            Query consulta = em.createQuery(textoQuery);

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/y");

            consulta.setParameter("descricao", filtroDescricao.isEmpty() ? null : "%" + filtroDescricao + "%");
            consulta.setParameter("dataInicial", dataIni.isEmpty() ? null : LocalDate.parse(dataIni, formatter));
            consulta.setParameter("dataFinal", dataFim.isEmpty() ? null : LocalDate.parse(dataFim, formatter));

            despesas = consulta.getResultList();
        } finally {
            JPAUtil.closeEtityManager();
        }
        return despesas;
    }

    public Despesa obter(int id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.find(Despesa.class, id);
        } finally {
            JPAUtil.closeEtityManager();
        }
    }

    public void atualizar(Despesa d) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(d);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.closeEtityManager();
        }
    }

    public void excluir(int id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            Despesa d = em.find(Despesa.class, id);
            if (d != null) {
                em.getTransaction().begin();
                em.remove(d);
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

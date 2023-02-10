package br.com.senac.financasjpa;

import br.com.senac.financasjpa.gui.Principal;
import br.com.senac.financasjpa.persistencia.Conta;
import br.com.senac.financasjpa.persistencia.ContaDAO;
import br.com.senac.financasjpa.persistencia.Despesa;
import br.com.senac.financasjpa.persistencia.DespesaDAO;
import br.com.senac.financasjpa.persistencia.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import java.time.LocalDate;
import java.util.List;

/**
 * @author Claudemir
 */
public class FinancasJPA {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    public static void InsereDados() {
        EntityManagerFactory fabricaEntidade = Persistence.createEntityManagerFactory("Financas");
        EntityManager manager = fabricaEntidade.createEntityManager();

        Despesa gasto = new Despesa();
        gasto.setDescricao("Primeira despesa");
        gasto.setValor(10.50);
        gasto.setData(LocalDate.of(2022, 5, 30));

        manager.getTransaction().begin();
        manager.persist(gasto);
        manager.getTransaction().commit();

        manager.close();
        fabricaEntidade.close();
    }

    public static void exemploFind() {
        EntityManagerFactory fabricaEntidade = Persistence.createEntityManagerFactory("Financas");
        EntityManager manager = fabricaEntidade.createEntityManager();

        Despesa gasto = manager.find(Despesa.class, 1);
        System.out.println(gasto.getDescricao());

        manager.close();
        fabricaEntidade.close();
    }

    public static void atualizaDados() {
        EntityManagerFactory fabricaEntidade = Persistence.createEntityManagerFactory("Financas");
        EntityManager manager = fabricaEntidade.createEntityManager();

        Despesa gasto = manager.find(Despesa.class, 1);
        manager.getTransaction().begin();
        gasto.setDescricao("Despesa atualizada");
        manager.getTransaction().commit();

        manager.close();
        fabricaEntidade.close();
    }

    public static void atualizaMerge() {
        EntityManagerFactory fabricaEntidade = Persistence.createEntityManagerFactory("Financas");
        EntityManager manager = fabricaEntidade.createEntityManager();

        Despesa gasto = new Despesa();
        gasto.setId(1);
        gasto.setDescricao("Atualizado com Merge");
        gasto.setData(LocalDate.of(2022, 5, 30));

        manager.getTransaction().begin();
        manager.merge(gasto);
        manager.getTransaction().commit();

        manager.close();
        fabricaEntidade.close();
    }

    public static void removeDados() {
        EntityManagerFactory fabricaEntidade = Persistence.createEntityManagerFactory("Financas");
        EntityManager manager = fabricaEntidade.createEntityManager();

        Despesa gasto = manager.find(Despesa.class, 1);
        manager.getTransaction().begin();
        manager.remove(gasto);
        manager.getTransaction().commit();

        manager.close();
        fabricaEntidade.close();
    }

    public static void cadastraDAO() {
        //CADASTRA ATRAVES DO DATA ACESS OBJECT DespesaDAO
        DespesaDAO despesaDao = new DespesaDAO();

        Despesa d = new Despesa();
        d.setDescricao("Compras de mercado");
        d.setValor(165.70);
        d.setData(LocalDate.of(2022, 11, 15));

        despesaDao.cadastrar(d);
    }

    public static void consultaDados() {
        EntityManager em = JPAUtil.getEntityManager();

        //buscando todo os registros de Despesa
        Query consulta1 = em.createQuery("select desp from Despesa desp");
        List<Despesa> despesas = consulta1.getResultList();
        for (Despesa d : despesas) {
            System.out.println(d.getDescricao());
        }

        //buscando especificamente a Despesa de id 1
        TypedQuery<Despesa> consulta2 = em.createQuery("SELECT d FROM Despesa d WHERE id = 4", Despesa.class);
        Despesa item = consulta2.getSingleResult();
        System.out.println(item.getDescricao());
    }
}

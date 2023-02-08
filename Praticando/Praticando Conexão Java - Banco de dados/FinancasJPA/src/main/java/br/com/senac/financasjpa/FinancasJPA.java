package br.com.senac.financasjpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.time.LocalDate;

/**
 * @author Claudemir
 */
public class FinancasJPA {

    public static void main(String[] args) {

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
}

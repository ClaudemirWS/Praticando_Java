package br.com.senac.persistencia;

import br.com.model.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

/**
 * @author Claudemir
 */
public class UsuarioDAO {

    public static Usuario validarUsuario(Usuario usuario) {

        Usuario usuarioEncontrado = null;
        
        EntityManager em = JPAUtil.getEntityManager();
        try {
            Query query = em.createQuery("SELECT u FROM Usuario u WHERE u.login = :login AND u.senha = :senha");
            query.setParameter("login", usuario.getLogin());
            query.setParameter("senha", usuario.getSenha());
            usuarioEncontrado = (Usuario)query.getSingleResult();
        } 
        catch (Exception ex) {
            System.out.println("Sintaxe de comando invalida");
        }

        return usuarioEncontrado;
    }

}

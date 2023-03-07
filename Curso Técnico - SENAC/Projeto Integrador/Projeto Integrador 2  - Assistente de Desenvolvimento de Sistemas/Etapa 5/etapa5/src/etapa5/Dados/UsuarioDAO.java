package etapa5.Dados;

import etapa5.Principal.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Claudemir
 */
public class UsuarioDAO {

    public static Usuario validarUsuario(Usuario usuario) {
        Usuario usuarioEncontrado = null;

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mystream", "root", "admin");
            PreparedStatement st = conn.prepareStatement("SELECT * FROM usuario WHERE login = ? AND senha = ?");

            // Atribuindo os valores na consulta
            st.setString(1, usuario.getLogin());
            st.setString(2, usuario.getSenha());
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                usuarioEncontrado = new Usuario();
                usuarioEncontrado.setId(rs.getInt("id"));
                usuarioEncontrado.setNome(rs.getString("nome"));
                usuarioEncontrado.setLogin(rs.getString("login"));
                usuarioEncontrado.setSenha(rs.getString("senha"));
            }
        } catch (SQLException ex) {
            System.out.println("Sintaxe de comando invalida");
        }

        return usuarioEncontrado;
    }

    public static int novoUsuario(Usuario usuario) {
        int status;

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mystream", "root", "admin");
            PreparedStatement st = conn.prepareStatement("INSERT INTO usuario(nome, login, senha) VALUES(?,?,?)");

            // Atribuindo os valores na consulta
            st.setString(1, usuario.getNome());
            st.setString(2, usuario.getLogin());
            st.setString(3, usuario.getSenha());
            status = st.executeUpdate();
            return status; //retornar 1

        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
            return ex.getErrorCode();
        }

    }
}

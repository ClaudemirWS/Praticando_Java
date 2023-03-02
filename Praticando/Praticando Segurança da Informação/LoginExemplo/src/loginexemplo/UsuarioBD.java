package loginexemplo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Claudemir
 */
public class UsuarioBD {

    // MÉTODO SEGURO!!!
    public static Usuario validarUsuarioSeguro(Usuario usuario) {
        // Criando consulta parametrizada
        String sql = "SELECT * FROM usuario WHERE login = ? AND senha = ?";
        Usuario usuarioEncontrado = null;

        try {
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_exemplo", "root", "admin");
            PreparedStatement statement = conexao.prepareStatement(sql);

            // Atribuindo os valores na consulta
            statement.setString(1, usuario.getLogin());
            statement.setString(2, usuario.getSenha());
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                usuarioEncontrado = new Usuario();
                usuarioEncontrado.setId(rs.getInt("id"));
                usuarioEncontrado.setNome(rs.getString("nome"));
                usuarioEncontrado.setLogin(rs.getString("login"));
                usuarioEncontrado.setSenha(rs.getString("senha"));
                usuarioEncontrado.setTipo(rs.getString("tipo"));
            }
        } catch (SQLException ex) {
            System.out.println("Sintaxe de comando invalida");
        }

        return usuarioEncontrado;
    }

    // MÉTODO INSEGURO!!!
    public static Usuario validarUsuarioInseguro(Usuario usuario) {
        String sql = "SELECT * FROM usuario WHERE login = " + usuario.getLogin() + " AND senha = " + usuario.getSenha();
        Usuario usuarioEncontrado = null;

        try {
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_exemplo", "root", "admin");
            PreparedStatement statement = conexao.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                usuarioEncontrado = new Usuario();
                usuarioEncontrado.setId(rs.getInt("id"));
                usuarioEncontrado.setNome(rs.getString("nome"));
                usuarioEncontrado.setLogin(rs.getString("login"));
                usuarioEncontrado.setSenha(rs.getString("senha"));
                usuarioEncontrado.setTipo(rs.getString("tipo"));
            }
        } catch (SQLException ex) {
            System.out.println("Sintaxe de comando invalida");
        }

        return usuarioEncontrado;
    }
}

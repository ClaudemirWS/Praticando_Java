
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * @author Claudemir
 */
public class conectaDAO {

    public Connection connectDB() {
        Connection conn = null;

        try {

            conn = DriverManager.getConnection("jdbc:mysql://localhost/uc11?user=root&password=admin");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ConectaDAO" + erro.getMessage());
        }
        return conn;
    }

}

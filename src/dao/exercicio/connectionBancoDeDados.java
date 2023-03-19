package dao.exercicio;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class connectionBancoDeDados {
    public Connection conectar() {
        Connection conn = null;
        try {
            String servidor = "jdbc:mysql://localhost/tudodebombd?user=root&password=root";
            conn = DriverManager.getConnection(servidor);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de Conexao: " + e.getMessage());
        }
        return conn;
    }
}
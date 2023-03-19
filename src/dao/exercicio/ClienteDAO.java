package dao.exercicio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClienteDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<Cliente> lista = new ArrayList<>();

    public void cadastrarCliente(Cliente objcliente) {
        String query = "insert into cliente (nome, cpf) values (?, ?)";
        conn = new connectionBancoDeDados().conectar();
        try {
            pstm = conn.prepareStatement(query);
            pstm.setString(1, objcliente.getNome());
            pstm.setString(2, objcliente.getCpf());
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cliente DAO Cadastrar: " + e);
        }
    }

    public ArrayList<Cliente> listarCliente() {
        String query = "select * from cliente";
        conn = new connectionBancoDeDados().conectar();
        try {
            pstm = conn.prepareStatement(query);
            rs = pstm.executeQuery();
            while(rs.next()) {
                Cliente objcliente = new Cliente();
                objcliente.setId(rs.getInt("id"));
                objcliente.setNome(rs.getString("nome"));
                objcliente.setCpf(rs.getString("cpf"));
                lista.add(objcliente);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ClienteDAO Listar: " + e);
        }
        return lista;
    }

    public void atualizarCliente(Cliente objcliente) {
        String query = "update cliente set nome = ?, cpf = ? where id = ?";
        conn = new connectionBancoDeDados().conectar();
        try {
            pstm = conn.prepareStatement(query);
            pstm.setString(1, objcliente.getNome());
            pstm.setString(2, objcliente.getCpf());
            pstm.setInt(3, objcliente.getId());
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ClienteDAO Atualizar: " + e);
        }
    }

    public void removerCliente(Cliente objcliente) {
        String query = "delete from cliente where id = ?";
        conn = new connectionBancoDeDados().conectar();
        try {
            pstm = conn.prepareStatement(query);
            pstm.setInt(1, objcliente.getId());
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ClienteDAO Remover: " + e);
        }
    }
}


package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Cliente;

public class ClienteDAO {
    private java.sql.Connection connection;

    public ClienteDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adicionar(Cliente cliente) {
        try {
            String sql = "insert into tbcliente" +
                         "(nomeCliente, rgCliente, cpfCliente, dataNasc, endereco, numero, cep, bairro, cidade, estado )" +
                         "values (?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, cliente.getNomeCliente());
            stmt.setString(2, cliente.getRgCliente());
            stmt.setString(3, cliente.getCpfCliente());
            stmt.setInt(4, cliente.getDataNasc());
            stmt.setString(5, cliente.getEndereco());
            stmt.setString(6, cliente.getNumero());
            stmt.setString(7, cliente.getCep());
            stmt.setString(8, cliente.getBairro());
            stmt.setString(9, cliente.getCidade());
            stmt.setString(10, cliente.getEstado());
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            System.out.println("Erro: " + e);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // consulta
    public List<Cliente> getLista() throws SQLException {
        try {
            List<Cliente> clientes = new ArrayList<>();

            PreparedStatement stmt = this.connection.prepareStatement("select * from tbcliente");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setIdCliente(rs.getInt(1));
                cliente.setNomeCliente(rs.getString(2));
                cliente.setRgCliente(rs.getString(3));
                cliente.setCpfCliente(rs.getString(4));
                cliente.setDataNasc(rs.getInt(5));
                cliente.setEndereco(rs.getString(6));
                cliente.setNumero(rs.getString(7));
                cliente.setCep(rs.getString(8));
                cliente.setBairro(rs.getString(9));
                cliente.setCidade(rs.getString(10));
                cliente.setEstado(rs.getString(11));

                clientes.add(cliente);
            }

            rs.close();
            stmt.close();

            return clientes;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            connection.close();
        }
    }

    // alterar
    public void alterar(Cliente cliente) {
        String sql = "update tbcliente set nomeCliente=?, rgCliente=?, cpfCliente=?, dataNasc=?, endereco=?, numero=?, cep=?, bairro=?, cidade=?, estado=?  where idCliente = ?";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cliente.getNomeCliente());
            stmt.setString(2, cliente.getRgCliente());
            stmt.setString(3, cliente.getCpfCliente());
            stmt.setInt(4, cliente.getDataNasc());
            stmt.setString(5, cliente.getEndereco());
            stmt.setString(6, cliente.getNumero());
            stmt.setString(7, cliente.getCep());
            stmt.setString(8, cliente.getBairro());
            stmt.setString(9, cliente.getCidade());
            stmt.setString(10, cliente.getEstado());
            stmt.setInt(11, cliente.getIdCliente());

            stmt.execute();
            stmt.close();
            System.out.println("Dados alterados com sucesso!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // excluir
    public void excluir(Cliente cliente) throws SQLException {
        String sql = "delete from tbcliente where idCliente = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, cliente.getIdCliente());
            stmt.execute();
            stmt.close();
            System.out.println("Dados excluídos com sucesso!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

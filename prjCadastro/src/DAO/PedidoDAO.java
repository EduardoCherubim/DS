package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Pedido;

public class PedidoDAO {
    private java.sql.Connection connection;

    public PedidoDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adicionar(Pedido pedido) {
        try {
            String sql = "insert into tbpedido" +
                         "(ProdutoPedido, qtdeProduto, clientePedido, dataPedido, dataEntrega, valorEntrega)" +
                         "values (?,?,?,?,?)";

            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, pedido.getProdutoPedido());
            stmt.setInt(2, pedido.getQtdeProduto());
            stmt.setString(3, pedido.getClientePedido());
            stmt.setInt(4, pedido.getDataPedido());
            stmt.setInt(5, pedido.getDataEntrega());
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
    public List<Pedido> getLista() throws SQLException {
        try {
            List<Pedido> pedidos = new ArrayList<>();

            PreparedStatement stmt = this.connection.prepareStatement("select * from tbpedido");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Pedido pedido = new Pedido();
                pedido.setIdPedido(rs.getInt(1));
                pedido.setProdutoPedido(rs.getString(2));
                pedido.setQtdeProduto(rs.getInt(3));
                pedido.setClientePedido(rs.getString(4));
                pedido.setDataPedido(rs.getInt(5));
                pedido.setDataEntrega(rs.getInt(6));
                pedido.setValorEntrega(rs.getDouble(7));

                pedidos.add(pedido);
            }

            rs.close();
            stmt.close();

            return pedidos;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            connection.close();
        }
    }

    // alterar
    public void alterar(Pedido pedido) {
        String sql = "update tbpedido set ProdutoPedido= ?,	qtdeProduto= ?,	clientePedido= ?, dataPedido= ?, dataEntrega= ?, valorEntrega= ? where idPedido = ?";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, pedido.getProdutoPedido());
            stmt.setInt(2, pedido.getQtdeProduto());
            stmt.setString(3, pedido.getClientePedido());
            stmt.setInt(4, pedido.getDataEntrega());
            stmt.setDouble(5, pedido.getValorEntrega());
            stmt.setInt(6, pedido.getIdPedido());

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
    public void excluir(Pedido pedido) throws SQLException {
        String sql = "delete from tbpedido where idPedido = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, pedido.getIdPedido());
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

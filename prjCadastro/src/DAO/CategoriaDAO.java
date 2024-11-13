package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Categoria;

public class CategoriaDAO {
    private java.sql.Connection connection;

    public CategoriaDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adicionar(Categoria categoria) {
        try {
            String sql = "insert into tbcategoria" +
                         "(nomeCategoria)" +
                         "values (?";

            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, categoria.getNomeCategoria());
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
    public List<Categoria> getLista() throws SQLException {
        try {
            List<Categoria> categorias = new ArrayList<>();

            PreparedStatement stmt = this.connection.prepareStatement("select * from tbcategoria");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Categoria categoria = new Categoria();
                categoria.setIdCategoria(rs.getInt(1));
                categoria.setNomeCategoria(rs.getString(2));

                categorias.add(categoria);
            }

            rs.close();
            stmt.close();

            return categorias;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            connection.close();
        }
    }

    // alterar
    public void alterar(Categoria categoria) {
        String sql = "update tbcategoria set nomeCategoria=?, DescCategoria=?, valorCategoria=?, Marca=?, Fornecedor=? where idCategoria = ?";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, categoria.getNomeCategoria());
            stmt.setInt(6, categoria.getIdCategoria());

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
    public void excluir(Categoria categoria) throws SQLException {
        String sql = "delete from tbcategoria where idCategoria = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, categoria.getIdCategoria());
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

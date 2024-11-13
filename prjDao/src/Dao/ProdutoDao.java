package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Produto;

public class ProdutoDao {
	private java.sql.Connection connection;
	
	public ProdutoDao() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	//adicionar
	public void adicionar(Produto produto) {
		
		try {
			String sql = "insert into tbproduto"+
						"(produto,valorProduto)"+
						"values (?,?)";
			
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1,produto.getProduto());
			stmt.setDouble(2,produto.getValorProduto());
			stmt.execute();
			stmt.close();
			
		}
		catch(SQLException e) {
			System.out.println("Erro :"+e);
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	//consulta
	public List<Produto> getLista() throws SQLException{
		try {
			List<Produto> produtos = new ArrayList<Produto>();
			
			PreparedStatement stmt = this.connection.prepareStatement("select * from tbproduto");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				Produto produto = new Produto();
				produto.setIdProduto(rs.getInt(1));
				produto.setProduto(rs.getString(2));
				produto.setValorProduto(rs.getDouble(3));
				
				produtos.add(produto);
			}
			
			rs.close();
			stmt.close();
			
			return produtos;
		}
		catch(SQLException e) {
			throw new RuntimeException();
		}
		finally {
			connection.close();
		}
	}
	//alterar
	public void alterar(Produto produto) {
		
		String sql = "update tbproduto set produto=?, valorProduto=? where idProduto = ?";
			
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, produto.getProduto());
			stmt.setDouble(2,produto.getValorProduto());
			stmt.setInt(3, produto.getIdProduto());
			
			stmt.execute();
			stmt.close();
			System.out.println("Dados alterados com sucesso!");
		}
		catch(SQLException e) {
			throw new RuntimeException();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
	//excluir
	public void excluir(Produto produto) throws SQLException{
		String sql = "delete from tbproduto where idProduto = ?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, produto.getIdProduto());
			stmt.execute();
			stmt.close();
			System.out.println("Dados excluidos com sucesso!");
		}
		catch(SQLException e) {
			throw new RuntimeException();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Produto;

public class ProdutoDAO {
	private java.sql.Connection connection;
	
	public ProdutoDAO() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	
	public void adicionar(Produto cliente) {
		
		try {
			String sql = "insert into tbcliente"+
						"(nomeProduto,DescProduto,valorProduto,Marca,Fornecedor)"+
						"values (?,?,?,?,?)";
			
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1,cliente.getNomeProduto());
			stmt.setString(2,cliente.getDescProduto());
			stmt.setDouble(3,cliente.getValorProduto());
			stmt.setString(4,cliente.getMarca());
			stmt.setString(5,cliente.getFornecedor());
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
			List<Produto> clientes = new ArrayList<Produto>();
			
			PreparedStatement stmt = this.connection.prepareStatement("select * from tbcliente");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				Produto cliente = new Produto();
				cliente.setIdProduto(rs.getInt(1));
				cliente.setNomeProduto(rs.getString(2));
				cliente.setDescProduto(rs.getString(3));
				cliente.setValorProduto(rs.getDouble(4));
				cliente.setMarca(rs.getString(5));
				cliente.setFornecedor(rs.getString(6));
				
				clientes.add(cliente);
			}
			
			rs.close();
			stmt.close();
			
			return clientes;
		}
		catch(SQLException e) {
			throw new RuntimeException();
		}
		finally {
			connection.close();
		}
	}
	//alterar
	public void alterar(Produto cliente) {
		
		String sql = "update tbcliente set nomeProduto=?, DescProduto=?,valorProduto=?,Marca=?,Fornecedor=? where idProduto = ?";
			
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, cliente.getNomeProduto());
			stmt.setString(2,cliente.getDescProduto());
			stmt.setDouble(3, cliente.getValorProduto());
			stmt.setString(4, cliente.getMarca());
			stmt.setString(5,cliente.getFornecedor());
			stmt.setInt(6, cliente.getIdProduto());
			
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
	public void excluir(Produto cliente) throws SQLException{
		String sql = "delete from tbcliente where idProduto = ?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, cliente.getIdProduto());
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
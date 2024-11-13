import java.sql.SQLException;
import java.util.List;

import Dao.ProdutoDao;
import Model.Produto;
import java.util.Scanner;
public class App {

	public static void main(String[] args) throws SQLException {
		Scanner in = new Scanner(System.in);
		Produto produto = new Produto();
		ProdutoDao produtoDao = new ProdutoDao();
		int valor, valorP, id; 
		String nome, r;
		do {
		System.out.println("O que deseja fazer?");
		System.out.println("1- inserir produto");
		System.out.println("2- alterar produto");
		System.out.println("3- deletar produto");
		System.out.println("4- consultar produtos");
		valor = in.nextInt();
		switch(valor) {
		case 1:
			System.out.println("Entre com o nome do produto");
			nome = in.next();
			
			System.out.println("Entre com o valor do produto");
			valorP = in.nextInt();
			
			produto.setProduto(nome);
			produto.setValorProduto(valorP);
			produtoDao.adicionar(produto);
			break;
		case 2:
			System.out.println("Entre com o novo nome do produto");
			nome = in.next();
			
			System.out.println("Entre com o novo valor do produto");
			valorP = in.nextInt();
			
			System.out.println("Entre com o id do produto");
			id = in.nextInt();
			
			produto.setIdProduto(id);
			produto.setProduto(nome);
			produto.setValorProduto(valorP);
			produtoDao.alterar(produto);
			break;
		case 3:
			System.out.println("Entre com o id do produto");
			id = in.nextInt();
			
			produto.setIdProduto(id);
			produtoDao.excluir(produto);
			break;
		case 4:
			List<Produto> produtos = new ProdutoDao().getLista();
			
			for(Produto pro: produtos) {
				System.out.println(pro.getIdProduto()+" "+pro.getProduto()+" "+pro.getValorProduto());
			}
			break;
		}
		System.out.println("Deseja repetir s=sim n=não");
		r = in.next();
		}while(r == "s");
	}

}
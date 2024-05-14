package prjCadastro;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		Pessoa p = new Pessoa();
		String nome;
		int idade;
		double peso;
		String email;
		
		System.out.println("Entre com o nome:");
		nome = in.nextLine();
		System.out.println("Entre com o email:");
		email = in.nextLine();
		System.out.println("Entre com idade:");
		idade = in.nextInt();
		System.out.println("Entre com o peso:");
		peso = in.nextDouble();
		
		p.cadastrarPessoa1(nome, email, idade, peso);
		p.exibirPessoa1();
		
		p.cadastrarPessoa2();
	}

}

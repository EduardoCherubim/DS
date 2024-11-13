package prjCadastro;
import java.util.Scanner;
public class Pessoa {
	Scanner in = new Scanner(System.in);
	String nome;
	int idade;
	double peso;
	String email;
	
	public void cadastrarPessoa1(String n, String e, int i, double p) {
		nome = n;
		email= e;
		idade = i;
		peso = p;
	}
	
	public void cadastrarPessoa2() {
		System.out.println("Entre com o nome:");
		nome = in.nextLine();
		System.out.println("Entre com o email:");
		email = in.nextLine();
		System.out.println("Entre com idade:");
		idade = in.nextInt();
		System.out.println("Entre com o peso:");
		peso = in.nextDouble();
	}
	
	public void exibirPessoa1() {
		System.out.println("Nome: "+nome);
		System.out.println("email: "+email);
		System.out.println("idade: "+idade);
		System.out.println("peso: "+peso);
	}
	
	public String exibirPessoa2() {
		String exibir = nome+""+email+""+idade+""+peso;
		
		return exibir;
	}

}
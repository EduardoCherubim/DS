package prjFatorial;

import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		Fatorial f = new Fatorial();
		double resultado;
		double valor;
		
		System.out.println("Entre com o número que voce quer ter o fatorial");
		valor = in.nextDouble();
		
		resultado = f.fazerFatorial(valor);
		System.out.println("O resultado do fatorial e: "+resultado);
		
		in.close();
	}

}

package prjMatematica;
import java.util.Scanner;
public class Aplicacao {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Calculos c = new Calculos();
		System.out.println("fatorial");
		System.out.println("digite o numero que deseja saber o fatorial");
    	int valor = in.nextInt();
		int fatorial = c.fatorial(valor);
		System.out.println(fatorial);
		
		System.out.println("Tabuada");
		c.tabuada();
		
		System.out.println("Triangulo");
		System.out.println("ente com a base:");
		double b = in.nextDouble();
		System.out.println("Entre com a altura:");
		double h = in.nextDouble();
		c.areaTriangulo(h, b);

	}

}

package prjTrianhgulo;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		Triangulo t = new Triangulo ();
		
		System.out.println("Entre com o primeiro valor do triangulo");
		t.valor1 = in.nextDouble();
		System.out.println("Entre com o segundo valor do triangulo");
		t.valor2 = in.nextDouble();
		System.out.println("Entre com o terceiro valor do triangulo");
		t.valor3 = in.nextDouble();
		
		if(t.verificarTriangulo(t.valor1, t.valor2, t.valor3)) {
			System.out.println("É um triangulo");
		}else {
			System.out.println("Não é um triangulo");
		}
		
		in.close();
	}

}

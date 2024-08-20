package prjFiguras;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int figura;
		int resposta = 0;
		
		do {
		System.out.println("Escolha a forma geometrica");
		System.out.println("Quadrado =  1");
		System.out.println("Circulo =  2");
		System.out.println("Triangulo =  3");
		System.out.println("Retangulo =  4");
		
		figura = in.nextInt();
		
		switch(figura) {
			case 1:
				Quadrado q = new Quadrado();
				q.calcularArea();
				break;
				
			case 2:
				Circulo c = new Circulo();
				c.calcularArea();
				break;
				
			case 3:
				Triangulo t = new Triangulo();
				t.calcularArea();
				if(t.eUmTriangulo()) {
					System.out.println("E um triangulo");
				}else {
					System.out.println("Nao e um triangulo");
				}
				break;
				
			case 4:
				Retangulo r = new Retangulo();
				System.out.println("Entre com a base");
				double base = in.nextDouble();
				r.setBase(base);
				System.out.println("Entre com a base");
				double altura = in.nextDouble();
				r.setAltura(altura);
				r.calcularArea();
				System.out.println("O perimetro dele e "+r.calcularPerimetro());
				break;
		}
		
		System.out.println("Deseja repetir?");
		System.out.println("sim = 1");
		System.out.println("nao = 0");
		resposta = in.nextInt();
		}
		while(resposta == 1);
		
		
		in.close();
	}

}

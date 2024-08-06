package prjFiguras;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		FiguraGeometrica figura = new FiguraGeometrica();
		int fg;
		
		System.out.println("Escolha a forma geometrica");
		System.out.println("Quadrado =  1");
		System.out.println("Circulo =  2");
		System.out.println("Triangulo =  3");
		System.out.println("Retangulo =  4");
		
		fg = in.nextInt();
		
		switch(fg) {
			case 1:
				Quadrado q = new Quadrado();
				
				System.out.println("Entre com a altura");
				double altura = in.nextDouble();
				figura.setAltura(altura);
				
				System.out.println("Entre com a base");
				double base = in.nextDouble();
				figura.setBase(base);
				
				q.calcularArea();
				break;
				
			case 2:
				Circulo c = new Circulo();
				
				System.out.println("Entre com o raio");
				double raio = in.nextDouble();
				c.setRaio(raio);
				
				c.calcularArea();
				break;
				
			case 3:
				Triangulo t = new Triangulo();
				System.out.println("Entre com a altura");
				double alturaT = in.nextDouble();
				figura.setAltura(alturaT);
				
				System.out.println("Entre com a base");
				double baseT = in.nextDouble();
				figura.setBase(baseT);
				
				t.calcularArea();
				
				System.out.println("Entre com os lados");
				double lado1 = in.nextDouble();
				figura.setLado1(lado1);
				
				double lado2 = in.nextDouble();
				figura.setLado2(lado2);
				
				double lado3 = in.nextDouble();
				figura.setLado3(lado3);
				
				if(t.eUmTriangulo()) {
					System.out.println("E um triangulo");
				}else {
					System.out.println("Nao e um triangulo");
				}
				break;
				
			case 4:
				Retangulo r = new Retangulo();
				
				System.out.println("Entre com a altura");
				double alturaR = in.nextDouble();
				figura.setAltura(alturaR);
				
				System.out.println("Entre com a base");
				double baseR = in.nextDouble();
				figura.setBase(baseR);
				
				r.calcularArea();
				System.out.println("O perimetro dele e "+r.calcularPerimetro());
				break;
		}
		
		in.close();
	}

}

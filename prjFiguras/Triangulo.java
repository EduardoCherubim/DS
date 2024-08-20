package prjFiguras;

import java.util.Scanner;

public class Triangulo extends FiguraGeometrica {
	
	public void calcularArea() {
		Scanner in = new Scanner(System.in);
		System.out.println("Entre com a base:");
		double base = in.nextDouble();
		System.out.println("Entre com a altura:");
		double altura = in.nextDouble();
		double area = base*altura;
		System.out.println("A area dele e "+area);
		in.close();
	}
	
	public boolean eUmTriangulo() {
		Scanner in = new Scanner(System.in);
		System.out.println("Entre com os lados:");
		double lado1 = in.nextDouble();
		double lado2 = in.nextDouble();
		double lado3 = in.nextDouble();
		in.close();
		if (lado1+lado2<lado3 || lado1+lado3<lado2 || lado2+lado3<lado1) {
			return true;
		}else {
			return false;
		}
	}
}

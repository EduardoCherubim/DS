package prjFiguras;

import java.util.Scanner;

public class Triangulo extends FiguraGeometrica {
	private double lado1;
	private double lado2;
	private double lado3;
	
	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	public void calcularArea() {
		Scanner in = new Scanner(System.in);
		System.out.println("Entre com a base:");
		double base = in.nextDouble();
		System.out.println("Entre com a altura:");
		double altura = in.nextDouble();
		double area = (base*altura)/2;
		System.out.println("A area dele e "+area);
		in.close();
	}

	public boolean eUmTriangulo() {;
	if (getLado1()+getLado2()>getLado3() || getLado1()+getLado3()>getLado2() || getLado2()+getLado3()>getLado1()) {
			return true;
		}else {
			return false;
		}
	}
}

package prjFiguras;
import java.util.Scanner;

public class Quadrado extends FiguraGeometrica {
	
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
}

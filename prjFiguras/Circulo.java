
package prjFiguras;
import java.util.Scanner;

public class Circulo extends FiguraGeometrica{
	
	public void calcularArea() {
		Scanner in = new Scanner(System.in);
		System.out.println("Entre com o raio:");
		double raio = in.nextDouble();
		double PI = 3.14;
		double area = PI*(raio*raio);
		System.out.println("A area dele é "+area);
		in.close();
	}
}

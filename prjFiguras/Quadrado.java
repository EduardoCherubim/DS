package prjFiguras;

public class Quadrado extends FiguraGeometrica {
	
	public void calcularArea() {
		r = getBase()*getAltura();
		System.out.println("A area dele é "+r);
		
	}
}

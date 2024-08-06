package prjFiguras;

public class Quadrado extends FiguraGeometrica {
	
	public void calcularArea() {
		setResposta(getBase()*getAltura());
		System.out.println("A area dele e "+getResposta());
	}
}

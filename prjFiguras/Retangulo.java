package prjFiguras;

public class Retangulo extends FiguraGeometrica{
	
	private double p;
	
	public void calcularArea() {
		setResposta(getBase()*getAltura());
		System.out.println("A area dele é "+getResposta());
	}
	
	public double calcularPerimetro() {
		p = 2*(getBase()+getAltura());
		return p;
	}
}

package prjFiguras;

public class Circulo extends FiguraGeometrica{
	private double PI=3.14;
	private double raio;
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double getRaio () {
		return this.raio;
	}
	
	public void calcularArea() {
		setResposta(PI*(getRaio()*getRaio()));
		System.out.println("A area dele é "+getResposta());
	}
}

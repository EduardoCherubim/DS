package prjFiguras;

public class Retangulo extends FiguraGeometrica{
	private double base;
	private double altura;
	
	public void calcularArea() {
		double base = getBase();
		double altura = getAltura();
		double area = base*altura;
		System.out.println("A area dele e "+area);
	}
	
	public double calcularPerimetro() {
		double p = 2*(getBase()+getAltura());
		return p;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
}

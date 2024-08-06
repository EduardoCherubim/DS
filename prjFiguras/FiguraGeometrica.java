package prjFiguras;

public class FiguraGeometrica {
	
	private double base;
	private double altura;
	private double l1,l2,l3;
	private double r;
	
	
	public void setAltura (double altura) {
		this.altura = altura;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public void setLado1 (double l1) {
		this.l1 = l1;
	}
	
	public void setLado2 (double l2) {
		this.l2 = l2;
	}
	public void setLado3 (double l3) {
		this.l3 = l3;
	}
	
	public double getBase() {
		return base;
	}

	public double getAltura() {
		return this.altura;
	}
	
	public double getLado1() {
		return this.l1;
	}
	
	public double getLado2() {
		return this.l2;
	}
	
	public double getLado3() {
		return this.l3;
	}
	
	
	public void calcularArea(){
		
	}

	
	
	public void setResposta(double r) {
		this.r = r;
	}
	
	public double getResposta() {
		return this.r;
	}

}
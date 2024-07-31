package prjFiguras;

public class FiguraGeometrica {
	
	private double base;
	private double altura;
	private double l1,l2,l3,l4;
	private double r;
	
	
	public void setAltura (double altura) {
		this.altura = altura;
	}
	
	public void setLados (double l1,double l2, double l3, double l4) {
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
		this.l4 = l4;
	}
	
	public double getBase() {
		return base;
	}

	
	public double getAltura() {
		return this.altura;
	}
	
	public double getL1() {
		return this.l1;
	}
	
	public double getL2() {
		return this.l2;
	}
	
	public double getL3() {
		return this.l3;
	}
	
	public double getL4() {
		return this.l4;
	}
	
	public void calcularArea(){
		
	}

	
	public void setBase(double base) {
		this.base = base;
	}
}

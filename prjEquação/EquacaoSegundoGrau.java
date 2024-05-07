package prjEquação;

public class EquacaoSegundoGrau {
	double delta;
	
	public void calcularDelta(double a, double b, double c) {
		delta = (b*b) - 4*a*c;
	}
	
	public void calcularBhaskara1(double a, double b, double c, double d) {
		double x = -b + Math.sqrt(d)/ 2*a;
		System.out.println("O valor de x e: "+x);
	}
	
	public void calcularBhaskara2(double a, double b, double c, double d) {
		double x1 = -b + Math.sqrt(d)/ 2*a;
		double x2 = -b - Math.sqrt(d)/ 2*a;
		
		System.out.println("O valor de x1 e: "+x1);
		System.out.println("O valor de x2 e: "+x2);
		
	}
}

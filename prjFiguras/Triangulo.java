package prjFiguras;

public class Triangulo extends FiguraGeometrica {
	
	public void calcularArea() {
		setResposta(getBase()*getAltura()/2);
		System.out.println("A area dele é "+getResposta());
	}
	
	public boolean eUmTriangulo() {
		if(getLado1()+getLado2()<getLado3() || getLado1()+getLado3()<getLado2() || getLado2()+getLado3()<getLado1()) {
			return true;
		}else {
			return false;
		}
	}
}

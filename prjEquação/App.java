package prjEquação;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		EquacaoSegundoGrau e = new EquacaoSegundoGrau();
		double a,b,c;
		
		System.out.println("Entre com o valor de A");
		a = in.nextDouble();
		System.out.println("Entre com o valor de B");
		b = in.nextDouble();
		System.out.println("Entre com o valor de C");
		c = in.nextDouble();
		
		e.calcularDelta(a, b, c);
		
		if(e.delta>0) {
			e.calcularBhaskara2(a, b, c, e.delta);
		}else if (e.delta < 0){
			System.out.println("Não existem valores x");
		}else {
			e.calcularBhaskara1(a, b, c, e.delta);
		}
		
		in.close();
	}

}

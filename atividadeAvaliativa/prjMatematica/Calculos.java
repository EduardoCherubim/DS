package prjMatematica;
import java.util.Scanner;
public class Calculos {
	int fatorial;
	Scanner in = new Scanner(System.in);
	

    public int fatorial(int valor){
    	for(int i=valor;i>=2;i--) {
    		valor = valor*i;
    		fatorial = valor;
    	}
    
    return fatorial;
    }
    
	public void tabuada() {
		
		System.out.println("digite o número que dese ja saber a tabuada");
		int x = in.nextInt();
		
		for(int i=0;i<11;i++) {
			 int resultado = x*i;
			 System.out.println(x+" x "+i+" = "+resultado);
			 resultado = 0;
		}
	}
	
	public void areaTriangulo(double h, double b) {
		
		double area = (b*h)/2;
		System.out.println("A area do triangulo é: "+area);
		
	}
	
	
	
}

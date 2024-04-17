package prjTrianhgulo;
public class Triangulo {
	double valor1;
	double valor2;
	double valor3;
	boolean r;
	
	public boolean verificarTriangulo(double a,double b, double c) {
    	 if(a<b+c || b<a+c ||  c<a+b) {
    		 return true;
    	 }else {
    		 return false;
    	 }

    	 
     	}

		
	
	
	
}
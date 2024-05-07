package prjFatorial;
	
public class Fatorial {
	double fatorial;
	
	public double fazerFatorial(double valor) {
		fatorial = 1;
		for(int i=1;i<=valor;i++) {
			fatorial = fatorial * i;
		}
		return fatorial;
	}
	
}

package prjCalculadora;

import java.util.Scanner;
public class Calculadora {
	Scanner in = new Scanner (System.in);
	double num1,num2;
	char op;
	double r = 0;
	
	public void lerValores(){
		System.out.println("Entre com o primeiro n�mero");
		num1 = in.nextDouble();
		System.out.println("Qual opera��o deseja: +,-,*,/");
		op = in.next().charAt(0); 
		System.out.println("Entre com o segundo valor");
		num2 = in.nextDouble();
	}
	
	public void Soma() {
		r = num1 + num2; 
	}
	
	public void Subtracao() {
		r = num1 - num2; 
	}
	
	public void Multiplicacao() {
		r = num1 * num2; 
	}
	
	public void Divisao() {
		r = num1 / num2; 
	}

}

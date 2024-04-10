package prjCalculadora;

import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Calculadora c = new Calculadora();
		String resposta;
		
		do {
			
			c.lerValores();
			
			if(c.op=='+') {
				
				c.Soma();
				System.out.println(c.r);
				
			}else if(c.op=='-') {
				
				c.Subtracao();
				System.out.println(c.r);
				
			}else if(c.op=='*') {
				
				c.Multiplicacao();
				System.out.println(c.r);
				
			}else if(c.op=='/') {
				
				c.Divisao();
				System.out.println(c.r);
				
			}else {
				
				System.out.println("Não foi possivel fazer a conta");
				
			}
			
			System.out.println("Deseja repetir S/N?");
			resposta = in.nextLine();
			
		}while(resposta.equalsIgnoreCase("S"));
		
		in.close();
	}

}

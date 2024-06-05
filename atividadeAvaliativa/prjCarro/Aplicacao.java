package prjCarro;
import java.util.Scanner;
public class Aplicacao {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Carro c = new Carro();
		
		System.out.println("Entre com o modelo do carro:");
		c.setModelo(in.nextLine());
		System.out.println("Entre com o fabricante do carro:");
		c.setFabricante(in.nextLine());
		System.out.println("Entre com o ano de fabricação do carro:");
		c.setAnoFabricacao(in.nextInt());
		
		System.out.println("Modelo: "+c.getModelo());
		System.out.println("Fabricante: "+c.getFabricante());
		System.out.println("Ano de Fabricação: "+c.getAnoFabricacao());
		
		in.close();
	}

}

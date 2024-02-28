import java.util.Scanner;
public class MatrizPares {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int pa = 0, im = 0, a[][] = new int [3] [3];
		
		System.out.println("Digite os valores de A");
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				a[i][j] = in.nextInt();
				if(a[i][j] % 2 == 0) {
					pa = pa + 1;
				}else {
					im = im + 1;
				}
			}
		}
				
		System.out.println("São "+pa+" numeros pares, e "+im+" numeros impares.");
		
		in.close();
	}

}

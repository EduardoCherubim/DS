import java.util.Scanner;
public class Matriz33 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
				
		int a[][] = new int [3][3];
		
		System.out.println("Digite os numeros de A");

		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				
				a[i][j] = in.nextInt();
						
			}
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {

				System.out.print(a[i][j]+" ");
			}
			
			System.out.println( );
			
		}
		in.close();
	}

}

import java.util.Scanner;

public class ImparParFor {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n1 = 0;
		int par = 0;
		int impar = 0;
		
		
		
		
		
		
		for( int i = 0; i <= 10; i++) {
			System.out.println("Digite um N�mero");
			n1 = ler.nextInt();
			
			if(n1 %2 == 0) {
				
				par++;
				System.out.println("� PAR !!\n" + par);
				
				} 
			else if(n1 %2 == 1) {
				
				impar++;
					System.out.println("� �MPAR !!" + impar);
				}
			
   		    }
	    }
     }

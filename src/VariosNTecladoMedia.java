import java.util.Scanner;

public class VariosNTecladoMedia {

	public static void main(String[] args) {
		
Scanner ler = new Scanner(System.in);
		


 				int n1, soma = 0, media = 0;
 				int cont = 0;
 				int resultado;


 				do {
	
 					System.out.println("Digite o primeiro número: " );
 					n1 = ler. nextInt();
	
 					resultado = n1 % 3;
		
 					if (resultado == 0) {
 						soma += n1;
 						cont++;
						}
 					}
			
 					while(n1 != 0);
	
 						media = soma / cont;

					System.out.println("\nA média dos números múltiplos de 3 é de: "  + media);

						}


			}



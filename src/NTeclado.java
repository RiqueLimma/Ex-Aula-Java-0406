import java.util.Scanner;

/*
 * Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)
*/
public class NTeclado {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n1;
		int soma = 0;
		
		do {
			
			System.out.println("Informe um n�mero: ");
			n1 = ler.nextInt();
			soma+=n1;
			
		} while( n1 != 0);
		
		System.out.println("Resultado da Soma = " + soma);
	}

}

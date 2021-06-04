import java.util.Scanner;

/*
 * Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)
*/
public class NTeclado {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n1;
		int soma = 0;
		
		do {
			
			System.out.println("Informe um número: ");
			n1 = ler.nextInt();
			soma+=n1;
			
		} while( n1 != 0);
		
		System.out.println("Resultado da Soma = " + soma);
	}

}

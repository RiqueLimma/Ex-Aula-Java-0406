/*
 * Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)
 */
import java.util.Scanner;

public class ExIdadeRepeticao {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade = 0, c21 = 0, c51 = 0;
		
		idade = ler.nextInt();
		
		while (idade != -99) {
			System.out.println("Digite -99 Pra Finalizar");
			idade = ler.nextInt();
			idade ++;
			if(idade == -99) {
				System.out.println("Finalizar !!");
				}if (idade < 21) {
					c21++;
				}
				else if (idade > 50) {
					c51++;
				}
		}
		System.out.println("Menores de 21 anos: " + c21);
		System.out.println("Menores de 21 anos: " + c51);
		System.out.println("Menores de 21 anos: " + idade);
		
		
		

	}

}

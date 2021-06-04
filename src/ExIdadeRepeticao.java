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


import java.util.Scanner;

public class ExPessoasWhile {
	
	public static void main(String[] args) {
		
		int temperamento = 0,idade = 0, sexo = 0, pCalmas = 0,oCalmos = 0, pNMais40 = 0, pCalmaMenos18 = 0,
				mNervosas = 0, hAgressivos = 0;
		int i = 0;
		

		Scanner ler = new Scanner(System.in);
		

		while (i <= 6) {

			System.out.println("Digite sua idade: ");
			idade = ler.nextInt();

			System.out.println("Digite seu sexo: 1 = feminino, 2 = masculino e 3 = outros");
			sexo = ler.nextInt();
			
			System.out.println("Digite seu temperamento: 1 = calmo, 2 = nervoso, 3 = agressivo");
			temperamento = ler.nextInt();

			if (temperamento == 1) {
				pCalmas++;
			}
			if (temperamento == 2 && sexo == 1) {
				mNervosas++;
			}
			if (temperamento == 3 && sexo == 2) {
				hAgressivos++;
			}
			if (sexo == 3 && temperamento == 1) {
				oCalmos++;
			}
			if (idade >= 40 && temperamento == 2) {
				pNMais40++;
			}

			if (idade <= 18 && temperamento == 1) {
				pCalmaMenos18++;
			}
			
			i++;
			
			}
		System.out.println("O número de pessoas calmas é: " + pCalmas);
		System.out.println("\nO número de mulheres nervosas é de: " + mNervosas);
		System.out.println("\nO número de pessoas agressivas é de: " + hAgressivos);
		System.out.println("\nO número de outros calmos é de: " + oCalmos);
		System.out.println("\nO número de pessoas nervosas com mais de 40 anos é de: " + pNMais40);
		System.out.println("\nO número de pessoas calmas com menos de 18 anos é de: " + pCalmaMenos18);
	}
}
	

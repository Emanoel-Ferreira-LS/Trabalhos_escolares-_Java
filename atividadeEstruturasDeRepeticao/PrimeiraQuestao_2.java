package atividadeEstruturasDeRepeticao;

import java.util.Scanner;

public class PrimeiraQuestao_2 {

	public static void main(String[] args) {
		/*
		 * Crie um algoritmo que leia uma quantidade indeterminada de valores,
		 * um de cada vez, após isso, conte quantos deles estão em cada um dos
		 * intervalos [0,10], [11,20], [21,30], [31,50] [0,10] = a [11,20] = b
		 * [21,30] = c [31,50] = d .
		 */

		Scanner leia = new Scanner(System.in);
		int num = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;

		do {
			System.out.println("Informe um número:   (para sair digite -1)");

			num = leia.nextInt();
			if ((num >= 0) && (num <= 10)) {
				a++;
			} else if ((num >= 11) && (num <= 20)) {
				b++;
			} else if ((num >= 21) && (num <= 30)) {
				c++;
			} else if ((num >= 31) && (num <= 50)) {
				d++;
			} else {
				System.out.println("Número fora dos intervalos!");
			}
		} while (num != -1);

		System.out.println("........................................................");
		System.out.println("Intervalo de 0 à 10: " + a + " números");
		System.out.println("Intervalo de 11 à 20: " + b + " números");
		System.out.println("Intervalo de 21 à 30: " + c + " números");
		System.out.println("Intervalo de 31 à 50: " + d + " números");

		leia.close();
	}

}

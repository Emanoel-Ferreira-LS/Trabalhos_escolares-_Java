package atividade05_02_julho;

import java.util.Scanner;

public class MaiorMenorNumero_Q4 {

	public static void main(String[] args) {
		/*
		 * Crie um algoritmo que solicite 20 números inteiros e informe qual o
		 * maior e o menor deles.
		 */

		Scanner leia = new Scanner(System.in);

		int contador = 0;
		int numero = 0;
		int posicao = 2;

		System.out.println("MAIOR E MENOR NÚMERO");
		System.out.println("............................");
		System.out.println("Digite 20 números inteiros:");

		System.out.println("Informe o 1º número:");
		numero = leia.nextInt();
		int menor = numero;
		int maior = numero;

		while (contador < 19) {
			System.out.println("Informe o " + posicao + "º número:");
			numero = leia.nextInt();
			posicao++;
			contador++;

			if (numero < menor) {// armazenamento do menor número
				menor = numero;
			}

			if (numero > maior) {// armazenamento do maior número
				maior = numero;

			}
		}
		System.out.println("O menor número é " + menor);
		System.out.println("E maior é " + maior);
	}

}

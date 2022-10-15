package atividade05_02_julho;

import java.util.Scanner;

public class MediaDasIdades_Q3 {

	public static void main(String[] args) {
		/*
		 * Crie um algoritmo em Java que solicite ao usuário um número
		 * indeterminado de idades. Você só deverá parar de solicitar idade
		 * quando o usuário digitar “0” (zero). Calcule a média das idades
		 * informadas.
		 */
		Scanner leia = new Scanner(System.in);

		System.out.println("MÉDIA DAS IDADES");
		System.out.println("......................");
		System.out.println("Para sair digite '0'");
		int posicao = 1;// contador
		int idade = 1;
		int somaIdade = 0;
		int quantIdade = 0;// contador das idades

		while (idade > 0) {
			System.out.println("Informe a " + posicao + "º Idade:");
			idade = leia.nextInt();
			if (idade > 0) {
				somaIdade += idade;// somaIdade = somaIdade + idade;
				posicao++;
				quantIdade++;
			}
		}
		// quantIdade = quantIdade -1;//o -1 serve pra compensar a adiçao de uma
		// quantIdade
		System.out.println("A média das idades é de " + somaIdade / quantIdade + " anos");
	}

}

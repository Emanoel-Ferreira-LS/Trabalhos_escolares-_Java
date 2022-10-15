package atividade05_02_julho;

import java.util.Scanner;

public class LerQuantNumerosNumIntervalo_Q5 {

	public static void main(String[] args) {
		/*
		 * Escrever um algoritmo que leia um número indefinido de inteiros e
		 * calcule quantos desses números estão no intervalo entre 150 e 200. A
		 * execução é encerrada quando o usuário digitar um número negativo.
		 */

		Scanner leia = new Scanner(System.in);

		System.out.println("NÚMEROS ENTRE 150 E 200");
		System.out.println("..........................");

		int contador = 0;// contador dos numeros entre 150 e 200
		int numero = 1;
		int quontador = 0;// contador dos numeros em geral

		while (numero >= 0) {
			System.out.println("Informe o " + (quontador + 1) + "º número:");
			numero = leia.nextInt();
			if (numero > 150 && numero < 200) {
				contador++;
			}
			quontador++;
		}
		System.out.println("............................................................");
		System.out.println(contador + " dos " + quontador + " informados estão entre 150 e 200");
	}

}

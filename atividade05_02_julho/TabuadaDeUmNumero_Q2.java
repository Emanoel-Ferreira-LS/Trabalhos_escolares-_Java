package atividade05_02_julho;

import java.util.Scanner;

public class TabuadaDeUmNumero_Q2 {

	public static void main(String[] args) {
		/*
		 * Escreva um programa que leia um número de 1 a 10, e mostre a tabuada
		 * desse número. Se o número informado não pertencer a esse intervalo,
		 * imprima uma mensagem informando “Número inválido!”
		 */

		Scanner leia = new Scanner(System.in);

		System.out.println("TABUADA DOS NÚMEROS ENTRE 1 E 10");
		System.out.println(".................................");
		System.out.println("Informe o Número desejado:");
		int numero = leia.nextInt();
		int posicao = 0;// contador

		if (numero < 11) {
			while (posicao < 11) {
				System.out.println(numero + "*" + posicao + "=" + numero * posicao);
				posicao++;
			}
		} else {
			System.out.println("Número inválido!");
		}

	}

}

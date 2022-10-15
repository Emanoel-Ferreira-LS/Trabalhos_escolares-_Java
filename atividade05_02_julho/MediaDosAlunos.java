package atividade05_02_julho;

import java.util.Scanner;

public class MediaDosAlunos {

	public static void main(String[] args) {
		/* Escreva um programa que leia 10 notas e informe a média dos alunos */

		Scanner leia = new Scanner(System.in);
		int posicao = 1;// contador
		double nota = 0;
		double somaNota = 0;
		double notaFinal = 0;

		System.out.println("MÉDIAS DE NOTAS");
		System.out.println("...............................");

		while (posicao < 11) {
			System.out.println("Informe a " + posicao + "º nota: ");
			posicao++;
			nota = leia.nextDouble();
			somaNota = nota + somaNota;
		}

		notaFinal = somaNota / 10;

		System.out.println("A média das notas dos alunos é " + notaFinal);
	}

}

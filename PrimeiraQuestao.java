package atividade01Programacao1;

import java.util.Scanner;

public class PrimeiraQuestao {

	public static void main(String[] args) {

		/*Escreva um algoritmo que leia dois numeros inteiros, calcule
		 e mostre na tela a soma deles com uma mensagem informando a opera��o
		  realizada.
		 */
			   System.out.println("SOMA DE DOIS ALGARISMOS INTEIROS");
			   System.out.println("--------------------------------------");
			   System.out.println("Ola, informe um numero inteiro:");
		       Scanner leia = new Scanner(System.in);//objeto de entrada
		       int a;//variavel 1
			   a = leia.nextInt();//leia
		       System.out.println("Informe outro numero:");
		       int b;//variavel 2
			   b = leia.nextInt();//leia
			   System.out.println("A soma de "+a+"+"+b+"="+(a+b));
	}

}

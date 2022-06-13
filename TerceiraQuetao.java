package atividade01Programacao1;

import java.util.Scanner;

public class TerceiraQuetao {

	public static void main(String[] args) {

		/*
		Escreva um algoritmo que leia 4 variaveis (a, b, c, e d), calcule e 
		mostre na tela o resultado da diferença do produto de a e b pelo 
		produto de c e d. Confira os exemplos abaixo.
		 DIFERENCA = (a * b - c * d).
		 */
				System.out.println("DIFERENçA DE PRODUTOS");
				System.out.println("-----------------------------");
				System.out.println("Insira o valor das variaveis abaixo:");
				Scanner leia;//objeto de entrada
				leia = new Scanner(System.in);//objeto de entrada
				
				System.out.println("a:");
				double a;//variavel 
				a = leia.nextDouble();//leia(a)
				
				System.out.println("b:");
				double b;//variavel 
				b = leia.nextDouble();//leia(b)
				
				System.out.println("c:");
				double c;//variavel 
				c = leia.nextDouble();//leia(c)
				
				System.out.println("d:");
				double d;//variavel 
				d = leia.nextDouble();//leia(d)
				
				double resultado;
				resultado = a * b - c * d;
				System.out.printf("O resultado de ("+a+")*("+b+")-("+c+")*("+d+") = "+resultado);
		
		
	}

}

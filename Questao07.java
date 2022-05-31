package atividade02programacao;

import java.util.Scanner;

public class Questao07 {

	public static void main(String[] args) {
/*Crie um algoritmo que leia dois valores informados pelo usuário e 
também qual operação ele deseja executar (soma, subtração, divisão, 
multiplicação). Realize o cálculo e imprima o resultado na tela.
 */
		Scanner leia = new Scanner(System.in);
		System.out.println("OPERAÇOES DE CALCULO");
		System.out.println("---------------------------------");
		System.out.println("Informe o primeiro numero:");
		double a = leia.nextDouble();
		System.out.println("Informe o segundo numero:");
		double b = leia.nextDouble();
		System.out.println("Qual a operaçao?");
		System.out.println("soma: '+' ;subtraçao: '-' ;Divisao: '/'    ;Multiplicaçao  '*'     ");
		char operacao = leia.next().charAt(0);
		double resultado = 0;
		
		if (operacao=='+') {
			System.out.println(a+"+"+b+" = "+(a+b));
		}else if (operacao=='-') {
			System.out.println(a+"-"+b+" = "+(a-b));
		}else if (operacao=='*') {
			System.out.println(a+"*"+b+" = "+(a*b));
		}else if (operacao=='/') {
			System.out.println(a+"/"+b+" = "+(a/b));
		}
		
	}

}

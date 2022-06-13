package atividade01Programacao1;

import java.util.Scanner;

public class QuartaQuestao {

	public static void main(String[] args) {
/*Escreva um algoritmo que leia o nome de um funcionário, número de 
horas trabalhadas e o valor que ele recebe por hora. Calcule e
mostre na tela o nome do funcionário e o valor
do seu salário com duas casas decimais.
 */
		System.out.println("CALCULO DE SALARIO DE FUNCIONARIO");
		System.out.println("---------------------------------------");
		System.out.println("Qual o nome do funcionario?");
		
		Scanner leia = new Scanner(System.in);//objeto de entrada 
		String nome = leia.nextLine();//criada variavel = leia variavel
	    
		System.out.println("Qual valor recebido por hora trabalhada?");
		double valorHora = leia.nextDouble();
		
		System.out.println("Qual total de horas trabalhadas?");
		double horaTrabalhada = leia.nextDouble();
		
		double resultado = valorHora*horaTrabalhada;
		
		System.out.print("Salario final do funcionário "+nome+":  ");
		System.out.printf("%.2f %n",resultado);
		
	}
	
}

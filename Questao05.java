package atividade02programacao;

import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {
/*Crie um algoritmo que receba um número de ponto flutuante e calcule 
o seu cubo usando a classe Math.
 */
		Scanner leia =  new Scanner(System.in);//Objeto de entrada
		
		System.out.println("CLASSE MATH(Cubo do numero");
		System.out.println("--------------------------------");
		System.out.println("Digite um numero:");
		double numero = leia.nextDouble();
	    double cuboDoNumero;
	    
	    cuboDoNumero = Math.pow(numero,3);
	    
	    System.out.println(+numero+"^3 =  "+cuboDoNumero);
	    
	}

}

package atividade01Programacao1;

import java.util.Locale;
import java.util.Scanner;

public class SegundaQuestao {

	public static void main(String[] args) {
/*Escreva um algoritmo que leia o valor do raio de um circulo, calcule
e mostre na tela o valor da Area desse circulo utilizando 4 casas 
decimais.
 -Formula da area: area = pi . raio2
 -Considere o valor de pi = 3.14159 
 */
		System.out.println("AREA DO CIRCULO");
		System.out.println("---------------------------");
		System.out.println("Informe o raio do circulo:");
		
		Locale.setDefault(Locale.US);//Padrao que o java deve seguir
		
        Scanner leia = new Scanner(System.in);//objeto de entrada
	       double raio;
	       raio = leia.nextDouble();//leia
	       
	       double pi;
	       pi= 3.14159;
	       
	       double resultado;
	       resultado=pi*(raio*raio) ;
	       System.out.println("");
	       System.out.printf("A area do circulo e = %.4f %n",resultado);//%.4f:limitar numero de casas decimais
	       //%n : quebra linha
	       
	}

}



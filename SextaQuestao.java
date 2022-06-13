package atividade01Programacao1;

import java.util.Scanner;

public class SextaQuestao {

	public static void main(String[] args) {
/*Escreva um algoritmo que leia três valores de ponto flutuante: A, B e C. 
Após isso, calcule e mostre na tela os resultados dos seguintes cálculos:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
 */
	Scanner leia = new Scanner(System.in);//Objeto de entrada
	
	System.out.println("CALCULOS A,B e C");	
	System.out.println("-----------------------------");
	System.out.println("Informe os valores de ;");
	System.out.println("A: ");
	double a = leia.nextDouble();
	
	System.out.println("B: ");
	double b = leia.nextDouble();
	
	System.out.println("c: ");
	double c = leia.nextDouble();
	
	double questaoA = (a*c)/2;
	     
	      double pi =3.14159; 
	
	double questaoB = pi*(Math.pow(c,2));//Math.pow=eleva um numero à uma potência
	
	double questaoC = ((a+b)*c)/2;
	
	double questaoD = Math.pow(b,2);
	
	double questaoE = a*b;
	
	System.out.println("A) a área do triângulo é :"+questaoA);

	System.out.println("B) a área do círculo é :"+questaoB);
	
	System.out.println("B) a área do trapézio é :"+questaoC);

	System.out.println("B) a área do quadrado é :"+questaoD);

	System.out.println("B) a área do retângulo é :"+questaoE);

	
			
	
	
	
	
		
		
		
	}

}

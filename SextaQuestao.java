package atividade01Programacao1;

import java.util.Scanner;

public class SextaQuestao {

	public static void main(String[] args) {
/*Escreva um algoritmo que leia tr�s valores de ponto flutuante: A, B e C. 
Ap�s isso, calcule e mostre na tela os resultados dos seguintes c�lculos:
a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
b) a �rea do c�rculo de raio C. (pi = 3.14159)
c) a �rea do trap�zio que tem A e B por bases e C por altura.
d) a �rea do quadrado que tem lado B.
e) a �rea do ret�ngulo que tem lados A e B.
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
	
	double questaoB = pi*(Math.pow(c,2));//Math.pow=eleva um numero � uma pot�ncia
	
	double questaoC = ((a+b)*c)/2;
	
	double questaoD = Math.pow(b,2);
	
	double questaoE = a*b;
	
	System.out.println("A) a �rea do tri�ngulo � :"+questaoA);

	System.out.println("B) a �rea do c�rculo � :"+questaoB);
	
	System.out.println("B) a �rea do trap�zio � :"+questaoC);

	System.out.println("B) a �rea do quadrado � :"+questaoD);

	System.out.println("B) a �rea do ret�ngulo � :"+questaoE);

	
			
	
	
	
	
		
		
		
	}

}

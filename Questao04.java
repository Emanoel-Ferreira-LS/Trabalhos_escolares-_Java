package atividade02programacao;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
/*Elabore um algoritmo que solicite ao usu�rio o seu sexo (M ou F) e 
armazene em uma vari�vel do tipo char. Imprima na tela �Masculino�, 
caso ele(a) tenha informado M, e �Feminino�, caso ele(a) tenha 
informado F.
 */
	
	Scanner leia=new Scanner(System.in);//Objeto de entrada
	
	System.out.println("MASCULINO OU FEMININO");
	System.out.println("---------------------------");
	System.out.println("Informe o sexo (M ou F) : ");
	char sexo = leia.next().charAt(0);
	
	if (sexo=='M') {
       System.out.println("Masculino");
	}else if (sexo=='F') {
		System.out.println("Feminino");
	}else if ((sexo!='M') && (sexo!='F')) {
		System.out.println("Digite o sexo corretamente! ( M ou F )");
	}	
		
	}
}

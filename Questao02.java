package atividade02programacao;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
/*Crie um algoritmo que solicite ao usuário que informe seu nome 
completo e sua idade.Imprima na tela usando um único sysout uma 
mensagem informando seu nome e idade. Ex:“<nome completo> possui 
<idade> anos de idade”
 */
	Scanner leia=new Scanner(System.in);//Objeto de entrada
		
	System.out.println("NOME E IDADE");
	System.out.println("--------------------");
	System.out.println("Informe seu nome completo:");
	String nome = leia.nextLine();
	System.out.println("Informe sua idade:");
	int idade=leia.nextInt();
	
	System.out.println(nome+" possui "+idade+" anos de idade.");
	
	
	}

}

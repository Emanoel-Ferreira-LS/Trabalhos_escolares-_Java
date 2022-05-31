package atividade02programacao;

import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
/*Escreva um programa que receba o nome e o sexo do usuário e, de 
acordo com o sexo, imprima "Olá, Senhor <Nome>" ou "Olá, Senhora 
<Nome>".
 */
		Scanner leia = new Scanner(System.in);//Objeto de entrada
		
		System.out.println("NOME DO USUARIO E SEXO");
		System.out.println("----------------------------");
		System.out.println("Qual seu nome?");
		String nome = leia.nextLine();
		System.out.println("Qual seu sexo? M (para masculino) ou F (para feminino):");
        char sexo = leia.next().charAt(0);
        String resposta = "Ocorreu um problema: SEXO INVALIDO!DIGITE CORRETAMENTE, ";//armazena "senhor" ou "senhora"
        
        if (sexo=='M') {
        	resposta="senhor";
        }else if (sexo=='F') {
        	resposta="senhora";
        }
        
        System.out.println("Olá, "+resposta+" "+nome);
        
	}

}

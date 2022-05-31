package atividade02programacao;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
/*Crie um algoritmo que solicite ao usuário três números inteiros. 
Imprima na tela qual é o maior e o menor.
*/
		
	Scanner leia = new Scanner(System.in);//Objeto de entrada
	
	System.out.println("MAIOR E MENOR NUMERO");
	System.out.println("-------------------------");
	System.out.println("informe um numero inteiro:");
	int a = leia.nextInt();
	System.out.println("informe outro numero:");
	int b = leia.nextInt();
	System.out.println("informe outro numero:");
    int c = leia.nextInt();
    
    int maior = 0;
    int menor = 0;
    
    //MAIOR NUMERO
    if (a>b) {
    	maior=a;
    }else if (b>c) {
    	maior=b;
    }else if (c>a) {
    	maior=c;
    }
    
    //MENOR NUMERO
    if (a<b){
    	menor=a;
    }else if (b<c) {
    	menor=b;
    }else if (c<a) {
    	menor=c;
    }
    //RESPOSTA
    System.out.println(".................................");
    System.out.println("O maior número é: "+maior);
    System.out.println("O menor número é: "+menor);
        
    
	}
}

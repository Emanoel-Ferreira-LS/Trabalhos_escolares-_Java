package atividadeEstruturasDeRepeticao;

import java.util.Scanner;

public class OitavaQuestao_2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int  num=-1;
		int pares=0;
		int impares=0;
		int mediaPares=0;
		int media=0;
		int somaPares=0;
		int somaImpares =0;
		
		while(num!=0) {
			
		System.out.println("Informe um numero positivo:");
		num = leia.nextInt();
		if (num!= 0) {
			
		if (num%2 == 0){
			pares++;
		somaPares = somaPares + num;
		}
		
		else if (num%2 == 1) {
			impares++;
		somaImpares = somaImpares + num;
	}
	  }
		}
		System.out.println("A quantidade de numeros pares é:"+pares);
		System.out.println("A quantidade de numeros impares é:"+impares);
		
		mediaPares = (somaPares/pares);
		System.out.println("A media dos pares: "+(mediaPares));
		
		media = (somaPares + somaImpares)/(impares+pares);
		System.out.println("A media geral dos numeros que foram inseridos é: "+(media));
		
		
		}

	

	}



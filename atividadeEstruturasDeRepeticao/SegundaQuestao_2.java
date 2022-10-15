package atividadeEstruturasDeRepeticao;

import java.util.Scanner;


public class SegundaQuestao_2 {
	
	public static void main(String[] args) {
		



				/*
				 * Faça um algoritmo que leia tantos números quanto o usuário desejar e
				 * imprima a soma e média deles.
				 */
				
				Scanner leia = new Scanner(System.in);

				System.out.println("SOMA E MEDIA");
				System.out.println("............................");

				int num = 1;
				int soma = 0;
				int cont = 0;
				double media = 0;

				while (num != 0) {
						System.out.println("Informe um numero desejado:  (para sair imprima 0)");		
					num = leia.nextInt();
					soma = soma + num;
					if (num==0)break;
					cont++;
				}
	      
	
				media =(double) soma / cont;

				System.out.println("A soma dos números é: " + soma);
				System.out.println("A média dos números é: " + media);

	
	
	}
}

package atividadeEstruturasDeRepeticao;

import java.util.Scanner;

public class QuartaQuestao_2 {

	public static void main(String[] args) {
		
     Scanner imput = new Scanner (System.in);
				double fatorial = 1;
		
        System.out.println("Informe o valor de A:");
		int num = imput.nextInt();
		
		for (int i = 1; i <= num; i ++) {
			
			fatorial = fatorial + i;
		}		
       System.out.println("Fatorial de"+ num +" e igual a "+fatorial);
		}
	
	
	}

	
	

	



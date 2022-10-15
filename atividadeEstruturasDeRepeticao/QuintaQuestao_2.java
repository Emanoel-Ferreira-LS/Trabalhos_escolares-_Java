package atividadeEstruturasDeRepeticao;

import java.util.Scanner;

public class QuintaQuestao_2 {

	public static void main(String[] args) {
/*Faça um programa que leia vários conjuntos de três valores reais e mostre para 
 cada conjunto: sua soma, seu produto e sua média. O programa para quando um dos 
três valores informados for maior que 300.*/ 

		Scanner leia = new Scanner(System.in);
		
		
		int a = 0;
		int b = 0;
		int c = 0;
		int soma= 0 ;
		int media = 0;
		int result = 0;
		
		while ((a <= 300)&& (b <= 300)&& (c <= 300)){
//NUMEROS	
System.out.println("Insira um numero:");
		a = leia.nextInt();
		if (a <= 300) {
			
System.out.println("Insira um numero:");
		b = leia.nextInt();
		if (b <= 300) {
		 
System.out.println("Insira um numero:");
		c = leia.nextInt();
		if (c <= 300) {
		
        soma = a + b + c;     
System.out.println("Soma dos numeros :"+soma);
    	     
       result = soma*2;
System.out.println("Produto dos numeros:"+result);

       media = (soma/3);
System.out.println("A media dos numeros que foram inseridos é:"+(media));	
       if (media <= 299) {

    	   continue;
      
       
       }
        }
		}
}
		}
		
	}

}

package atividadeEstruturasDeRepeticao;

import java.util.Scanner;

public class TerceiraQuestao_2 {

	public static void main(String[] args) {

/*Crie um algoritmo para calcular e escrever a soma dos cubos dos números pares
compreendidos entre B e A (B > A). B e A são lidos pelo teclado.*/
	
	Scanner leia = new Scanner(System.in);
	
    int a = 0;
    int b = 0;
    
    System.out.println("Informe o numero inicial do intervalo:");
    a = leia.nextInt();
    System.out.println("Informe o numero final:");
    b = leia.nextInt();
    
    int num = 0;
    int soma = 0;
    
    for (int i = a+1; i>a && i<b ; i++){//a+1: porque a condição é que i>a 
    	//System.out.println(i);
    if (i%2==0){
    	num = i;
    	//System.out.println("i:"+i);
    	num =  (int) Math.pow(i,3);
    	soma = soma + num;
    	//System.out.println("num: "+num);
    	//System.out.println("soma: "+soma);
    }
    }
    
    System.out.println("A soma dos cubos dos números pares entre "+a+" e "+b+" é: "+soma);

    
	}
}

package atividadeExtra;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		/*Crie um algoritmo que leia uma vari�vel e some 10 caso seja
par ou some 5 caso seja �mpar, ap�s isso, imprima o resultado desta 
opera��o
*/ 
		Scanner leia = new Scanner(System.in);
	
	System.out.println("PAR OU IMPAR");
	System.out.println("----------------------");
	System.out.println("Informe um n�mero inteiro:");
	int n1 = leia.nextInt();
	
	if (n1%2==0){
		int par=n1+10;
    	System.out.println("Resultado: "+par);
    }else {
    	int impar=n1+5;
    	System.out.println("Resultado: "+impar);
    }
    	
    	
		

	}

}

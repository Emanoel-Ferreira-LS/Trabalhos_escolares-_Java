package atividadeExtra;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		/*Escreva um algoritmo que leia uma vogal informada pelo 
usuário e imprima na tela três nomes próprios de sua escolha que 
iniciam com essa letra. Utilize a estrutura switch.
*/ 
	Scanner leia = new Scanner(System.in);
	
	System.out.println("NOMES DE PESSOAS QUE COMEÇA COM VOGAL");
	System.out.println("---------------------------------------------");
	System.out.println("Informe uma vogal:");
	char vogal = leia.next().charAt(0);
	
//switch só trabalha com variaveis do tipo int conversiveis, strings ou enum
	
	switch (vogal) {   //switch só trabalha com variaveis do tipo
	case 'A': 
	case 'a':System.out.println("Ana \nAlice \nArtur");break;
	case 'E':
	case 'e':System.out.println("Emanuel \nEsther \nEmily");break;
	case 'I':
	case 'i':System.out.println("Isabela \nIsac \nIsmael");break;
	case 'O':
	case 'o':System.out.println("Oswaldo \nOtavio \nOrlando");break;
	case 'U':
	case 'u':System.out.println("Urias \nUlly \nUrsula");break;
	default:System.out.println("!!! \nInvalido!Digite uma vogal");
	} 	
		
	}

}

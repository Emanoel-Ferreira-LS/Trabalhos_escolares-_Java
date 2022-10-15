package atividadeEstruturasDeRepeticao;

import java.util.Scanner;

public class SetimaQuestao_2 {

	public static void main(String[] args) {
/*Digitados dois números (base e expoente – b^e), calcule o resultado utilizando 
apenas multiplicações;
 */
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o um numero:");
		int num = leia.nextInt();
		System.out.println("informe o expoente:");
		int exp = leia.nextInt();
		
		int i = 1;
		int result =0;
		
		int n = num;
		
		while(i<=exp){
			n = n * i;
			i++;
		}

		 System.out.println(num+"^"+exp+"="+n);

	}

}

package atividadeEstruturasDeRepeticao;

import java.util.Scanner;

public class SextaQuestao_2 {

	public static void main(String[] args) {
/*Em um concurso de miss IFSertãoPE, os jurados precisam digitar o nome das 16
candidatas e suas respectivas notas (0 a 10). Crie um programa que leia estas 
informações e que, ao final do programa, apresente apenas o nome e a nota da 
vencedora.*/ 
        
		Scanner leia = new Scanner(System.in);
		
		int nota = 0;
		int maior = 0;
		int cont = 0;
		String vencedora = null;
		
		
		
	       while (cont < 10){
			
			System.out.println("Nome da candidata:");
			String nome = leia.next();
			System.out.println("Nota:");
			nota = leia.nextInt();
			
			cont++;
			
			if (cont == 0)maior = nota;
			
			if (nota>maior){
				maior = nota;
				vencedora = nome;
			}
		}
		
		System.out.println(" A VENCEDORA é: "+vencedora+" !!");
		System.out.println("Nota: "+maior);
	}

}

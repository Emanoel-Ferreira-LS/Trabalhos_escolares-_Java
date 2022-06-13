package atividadeExtra;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		/*Faça um algoritmo que calcule o número de pontos acumulados 
por um time de futebol em um campeonato, dada a quantidade de vitórias
e a quantidade de empates que o time tem até o momento. Considere que 
uma vitória vale 3 pontos e um empate vale 1 ponto.
*/
		Scanner leia = new Scanner(System.in);//objeto de entrada
		
	System.out.println("PONTOS DO TIME");
	System.out.println("--------------------");
	System.out.println("Informe o número de vitorias do time:");
	int vitorias = leia.nextInt();
	System.out.println("Qual a quantidade de empates do time?");
	int empates = leia.nextInt();
	
	int pontos = (vitorias*3)+(empates*1);
	System.out.println("...........................................");
	System.out.println("A quantidade de pontos acumulados é "+pontos);
	
		
		
	}

}

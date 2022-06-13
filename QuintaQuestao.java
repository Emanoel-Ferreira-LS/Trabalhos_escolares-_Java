package atividade01Programacao1;

import java.util.Scanner;

public class QuintaQuestao {

	public static void main(String[] args) {
/*Escreva um algoritmo que leia o nome, valor unitário e a quantidade
comprada de dois produtos. Calcule e mostre na tela o valor total a 
ser pago pela compra, informando também os detalhes dos produtos 
comprados.
 */
	System.out.println("VALOR TOTAL DA COMPRA");
	System.out.println("----------------------------");
	
//Dados do primeiro produto
	System.out.println("Qual o nome do primeiro produto?");
	
	Scanner leia = new Scanner(System.in);//Objeto de entrada
	String primeiroProduto = leia.nextLine();
	
	System.out.println("Valor unitário do produto:");
	double valorProduto1 = leia.nextDouble();
	
	System.out.println("Quantidade comprada:");
	int quantidade = leia.nextInt();

//Dados do segundo produto
    System.out.println("Qual o nome do segundo produto?");
	String segundoProduto = leia.next();
	
	
	System.out.println("Valor unitário do produto:");
	double valorProduto2 = leia.nextDouble();
	
	System.out.println("Quantidade comprada:");
	int quantidade2 = leia.nextInt();
	
//Resultado
	double valorTotal = valorProduto1*quantidade+valorProduto2*quantidade2;
	
	System.out.println("DADOS DA COMPRA :");
	System.out.println("-----------------------------");
	System.out.println(primeiroProduto);
	System.out.println(quantidade+" unidades");
	System.out.printf("Valor unitário: R$ %.2f %n",valorProduto1);
	System.out.println("");
	System.out.println(segundoProduto);
	System.out.println(quantidade2+" unidades");
	System.out.printf("Valor unitário: R$ %.2f %n",valorProduto2);
	System.out.println("");
	System.out.printf("Valor total: R$ %.2f ",valorTotal);
	
			
	}

}

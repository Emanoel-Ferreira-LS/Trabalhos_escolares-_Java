package atividade02programacao;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
/*
Escreva um algoritmo em Java que solicite ao usu�rio o c�digo do produto e com base nesse
c�digo, imprima onde ele foi fabricado, de acordo com a tabela abaixo:
 c�digo 1 : Salgueiro
 c�digo 2 : Serrita
 c�digo 3 : Recife
 c�digo 4 : Cabrob�
 c�digo 5 ou 6 : Petrolina
 c�digo 7, 8 ou 9 : Santa Maria da Boa Vista
 c�digo 10 : Oroc�
 c�digo 11 : Lagoa Grande
Observa��o: Se o c�digo informado n�o corresponder a nenhum dos apresentados acima, o
produto foi fabricado na China.
 */
		Scanner leia=new Scanner(System.in);
		
		System.out.println("Informe o c�digo do produto:");
		int codigo = leia.nextInt();
		
		String fabricacao = null;
		
		if (codigo==1){
			fabricacao="Salgueiro";
		}else if (codigo==2){
		    fabricacao = "Serrita";
		}else if (codigo==3) {
			fabricacao = "Recife";
		}else if (codigo==4) {
			fabricacao = "Cabrob�";
		}else if((codigo==5) || (codigo==6)) {
			fabricacao = "Petrolina";
		}else if((codigo==7)||(codigo==8)||(codigo==9)) {
			fabricacao = "Santa Maria da Boa Vista";
		}else if (codigo==10) {
			fabricacao = "Oroc�";
		}else if (codigo==11) {
			fabricacao = "Lagoa grande";
		}else if (codigo>11){
			fabricacao = "China";
		}
		
		System.out.println("Made in "+fabricacao);
	}

} 

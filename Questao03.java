package atividade02programacao;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
/*
Escreva um algoritmo em Java que solicite ao usuário o código do produto e com base nesse
código, imprima onde ele foi fabricado, de acordo com a tabela abaixo:
 código 1 : Salgueiro
 código 2 : Serrita
 código 3 : Recife
 código 4 : Cabrobó
 código 5 ou 6 : Petrolina
 código 7, 8 ou 9 : Santa Maria da Boa Vista
 código 10 : Orocó
 código 11 : Lagoa Grande
Observação: Se o código informado não corresponder a nenhum dos apresentados acima, o
produto foi fabricado na China.
 */
		Scanner leia=new Scanner(System.in);
		
		System.out.println("Informe o código do produto:");
		int codigo = leia.nextInt();
		
		String fabricacao = null;
		
		if (codigo==1){
			fabricacao="Salgueiro";
		}else if (codigo==2){
		    fabricacao = "Serrita";
		}else if (codigo==3) {
			fabricacao = "Recife";
		}else if (codigo==4) {
			fabricacao = "Cabrobó";
		}else if((codigo==5) || (codigo==6)) {
			fabricacao = "Petrolina";
		}else if((codigo==7)||(codigo==8)||(codigo==9)) {
			fabricacao = "Santa Maria da Boa Vista";
		}else if (codigo==10) {
			fabricacao = "Orocó";
		}else if (codigo==11) {
			fabricacao = "Lagoa grande";
		}else if (codigo>11){
			fabricacao = "China";
		}
		
		System.out.println("Made in "+fabricacao);
	}

} 

package atividade05_02_julho;

import java.util.Scanner;

public class VerificarSenha_Q6 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que receba uma senha formada de quatro números
		 * inteiros, verifique se a senha está correta e, caso não esteja,
		 * solicite novamente a senha. Se a senha entrada for a correta, deverá
		 * ser apresentada a mensagem “Senha Correta”, caso contrário, “Senha
		 * Incorreta”. Continue solicitando a senha até que a mesma esteja
		 * correta.
		 */

		Scanner leia = new Scanner(System.in);

		int senha = 0;
		int senhaDigitada = 0;

		System.out.println("JESUS TE AMA");
		System.out.println("Atos 17:24,25,26,27,30,31 para sua meditação");
		System.out.println("...............................");

		System.out.println("Digite uma senha de 4 caracteres:");
		senha = leia.nextInt();
		System.out.println("..................................");
		System.out.println("");

		while (senhaDigitada != senha) {
			System.out.println("Informe a senha para o acesso:");
			senhaDigitada = leia.nextInt();
			if (senhaDigitada == senha) {
				System.out.println("Senha Correta");
			} else {
				System.out.println("Senha Incorreta");
			}
		}

	}

}

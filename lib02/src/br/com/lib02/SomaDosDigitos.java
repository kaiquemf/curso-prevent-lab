package br.com.lib02;

import java.util.Scanner;

public class SomaDosDigitos {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um número inteiro:");
		int numero = input.nextInt();
		int soma = 0;
		while (numero > 0) {
			int numeroDigitado = numero % 10;
			soma += numeroDigitado;
			numero /= 10;
		}
		System.out.println("A soma dos dígitos é " + soma + ".");
		input.close();
	}
}

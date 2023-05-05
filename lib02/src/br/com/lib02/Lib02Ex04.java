package br.com.lib02;

import java.util.Scanner;

public class Lib02Ex04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite uma string: ");
		String texto = input.nextLine();
		String textoInvertido = "";

		for (int i = texto.length() - 1; i >= 0; i--) {
			textoInvertido += texto.charAt(i);
		}

		System.out.println("String invertida: " + textoInvertido);
	}
}

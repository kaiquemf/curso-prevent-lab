package br.com.lab02;

import java.util.Scanner;

public class InverseStringEx04 {
	public static void main(String[] args) {
		InverseString();
	}

	public static void InverseString() {
		System.out.println("Digite a palavra ou frase que deseja inverter: ");

		Scanner input = new Scanner(System.in);
		String typedString = input.nextLine();
		input.close();
		String inversedString = "";

		boolean capitalizeNext = true;
		for (int i = typedString.length() - 1; i >= 0; i--) {
			char c = typedString.charAt(i);
			
			if (Character.isWhitespace(c)) {
				capitalizeNext = true;
			} else if (capitalizeNext) {
				c = Character.toUpperCase(c);
				capitalizeNext = false;
			} else {
				c = Character.toLowerCase(c);
			}
					
			inversedString += c;
		}
		System.out.println("Sua string inversa é: " + inversedString);
	}
}

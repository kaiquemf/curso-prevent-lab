package br.com.lib02;

import java.util.Scanner;

public class Lib02Ex02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite um número:");

		int numDigitado = input.nextInt();
		
		if(numDigitado % 2 == 0) {
			System.out.println("Seu número é par!");
		} else {
			System.out.println("Seu número é impar!");
		}
		
		input.close();
	}
}

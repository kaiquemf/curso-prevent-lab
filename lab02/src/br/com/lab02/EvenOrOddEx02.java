package br.com.lab02;

import java.util.Scanner;

public class EvenOrOddEx02 {
	public static void main(String[] args) {
		EvenOrOdd();
	}

	public static void EvenOrOdd() {
		System.out.println("Digite um número: ");
		Scanner input = new Scanner(System.in);
		int typedNumber = input.nextInt();
		input.close();
		if (typedNumber % 2 == 0) {
			System.out.println("Esse número é par!");
		} else {
			System.out.println("Esse número é impar!");
		}

	}
}

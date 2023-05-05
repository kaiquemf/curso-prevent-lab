package br.com.lab02;

import java.util.Scanner;

public class SerialPrinterEx03 {
	public static void main(String[] args) {
		SerialPrinter();
	}

	public static void SerialPrinter() {
		int starterNumber = 1;
		int increment = 0;
		
		System.out.println("Digite a quantidade de casas desejadas: ");
		Scanner input = new Scanner(System.in);
		int serialPrinter = input.nextInt();
		input.close();
		

		for (int i = 0; i <= serialPrinter; i++) {
			starterNumber += increment;
			++increment;
			if (i < serialPrinter) {
				System.out.print(starterNumber + ", ");
			} else {
				System.out.print(starterNumber + ".");
			}

		}
	}
}

package br.com.lib02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidacaoSenha {
	public static void main(String[] args) {
		int senhaCorreta = 1234;

		System.out.println("Digite a senha correta:");
		Scanner input = new Scanner(System.in);

		int primeiraTentativa = input.nextInt();

		try {
			primeiraTentativa = input.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("A senha deve ser um número inteiro!");
			System.exit(0);
		}

		if (primeiraTentativa == senhaCorreta) {
			System.out.println("Senha Correta!");
		} else {
			int senhaDigitada;
			do {
				System.out.println("Senha incorreta, tente novamente:");
				senhaDigitada = input.nextInt();
			} while (senhaDigitada != senhaCorreta);
			System.out.println("Senha Correta!");
			input.close();
		}

	}
}
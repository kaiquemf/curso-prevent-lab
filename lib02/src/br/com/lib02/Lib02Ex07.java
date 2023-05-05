package br.com.lib02;

import java.util.Scanner;

public class Lib02Ex07 {
	public static void main(String[] args) {
		/* Exercicio 07 */
		Scanner input = new Scanner (System.in);
		
		System.out.println("Digite o texto original:");
		String textoOriginal = input.nextLine();
		
		System.out.println("Digite a palavra que quer alterar:");
		String palavraOriginal = input.nextLine();
		
		System.out.println("Digite a nova palavra:");
		String novaPalavra = input.nextLine();
		input.close();
		String textoSubstituido = substituirPalavra(textoOriginal, palavraOriginal, novaPalavra);

		System.out.println("Texto original: " + textoOriginal);
		System.out.println("Palavra a ser substituída: " + palavraOriginal);
		System.out.println("Nova palavra: " + novaPalavra);
		System.out.println("Texto com substituição: " + textoSubstituido);
	}

	public static String substituirPalavra(String texto, String palavraOriginal, String novaPalavra) {
		String[] palavras = texto.split(" ");

		for (int i = 0; i < palavras.length; i++) {
			if (palavras[i].equals(palavraOriginal)) {
				palavras[i] = novaPalavra;
			}
		}

		return String.join(" ", palavras);
	}

}

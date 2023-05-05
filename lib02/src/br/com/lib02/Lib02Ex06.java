package br.com.lib02;

public class Lib02Ex06 {
	public static String converterCamelCase(String texto) {
		String textoConvertido = "";

		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);

			if (Character.isUpperCase(c)) {
				textoConvertido += " ";
			}

			textoConvertido += c;
		}

		return textoConvertido.trim();
	}
}

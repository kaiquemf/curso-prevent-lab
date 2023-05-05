package br.com.lib02;

public class Lib02Ex05 {

    public static int contarVogais(String texto) {
        int contador = 0;

        texto.toLowerCase();
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }

        return contador;
    }
}

package br.com.lib02;

import java.util.Scanner;

public class ContadorDeVogais {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String palavra;
        while (true) {
            System.out.println("Digite uma palavra (ou 'sair' para encerrar):");
            palavra = input.nextLine().toLowerCase();
            if (palavra.equals("sair")) {
                break;
            }
            int contador = 0;
            for (int i = 0; i < palavra.length(); i++) {
                char letra = palavra.charAt(i);
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    contador++;
                }
            }
            System.out.println("A palavra '" + palavra + "' possui " + contador + " vogais.\n");
        }
        System.out.println("Programa encerrado.");
        input.close();
    }
}

package br.com.lib02;

import java.util.Scanner;

public class MediaNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma série de números (digite -1 para parar):");
        int numero = input.nextInt();
        int soma = 0;
        int contador = 0;
        while (numero != -1) {
            soma += numero;
            contador++;
            numero = input.nextInt();
        }
        double media = 0.0;
        if (contador > 0) {
            media = (double) soma / contador;
        }
        System.out.println("A média dos números digitados é " + media + ".");
        input.close();
    }
}

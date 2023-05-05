package br.com.lib02;

import java.util.Scanner;

public class NumerosPares {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int n = input.nextInt();

        int i = 0;
        do {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= n);

        input.close();
    }
}

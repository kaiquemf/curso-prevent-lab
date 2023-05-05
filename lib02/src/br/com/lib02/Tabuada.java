package br.com.lib02;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe um valor entre 1 e 10: ");
        int num = input.nextInt();
        while (num < 1 || num > 10) {
            System.out.println("Valor inválido. Informe novamente: ");
            num = input.nextInt();
        }
        System.out.println("Tabuada de multiplicação de " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        input.close();
    }
}


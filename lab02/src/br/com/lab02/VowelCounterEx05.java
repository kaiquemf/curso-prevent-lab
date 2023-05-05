package br.com.lab02;

import java.util.Scanner;

public class VowelCounterEx05 {
    public static void main(String[] args) {
        int numberOfVowels = VowelCounter();
        System.out.println("O número de vogais na string é: " + numberOfVowels);
    }

    public static int VowelCounter() {
        System.out.println("Digite a string que deseja contar as vogais: ");

        Scanner input = new Scanner(System.in);
        String typedString = input.nextLine();
        input.close();

        typedString = typedString.toLowerCase(); // atribui a string em minúsculas de volta à variável
        int numberOfVowels = 0;

        for (int i = 0; i < typedString.length(); i++) { // corrige o operador <= para <
            char letters = typedString.charAt(i);
            if (letters == 'a' || letters == 'e' || letters == 'i' || letters == 'o' || letters == 'u') {
                numberOfVowels++;
            }
        }
        return numberOfVowels;
    }
}

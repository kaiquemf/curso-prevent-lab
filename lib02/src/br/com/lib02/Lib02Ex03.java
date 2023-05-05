package br.com.lib02;

import java.util.Scanner;

public class Lib02Ex03 {
	public static void main(String[] args) {
        int numero = 1;
        int incremento = 0;
        
        System.out.println("Digite quantas casas deseja:");
        Scanner input = new Scanner(System.in);
        int maximoI = input.nextInt();
        input.close();

//      System.out.print(numero + ", ");
        for (int i = 0; i <= maximoI; i++) {
            numero += incremento;
            ++incremento;
            if(i < maximoI) {
            	System.out.print(numero + ", ");            	
            } else {
            	System.out.println(numero + ".");
            }
        }
	}
}

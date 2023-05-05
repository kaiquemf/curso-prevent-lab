package br.com.forms0305;

public class Ex03 {
	public static void main(String[] args) {
		Integer num1 = new Integer(10);
		Integer num2 = new Integer(10);
		
		System.out.println(num1 == num2);
		//false
		System.out.println(num1.equals(num2));
		//true
	}
}

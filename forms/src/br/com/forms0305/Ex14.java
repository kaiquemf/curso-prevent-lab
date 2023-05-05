package br.com.forms0305;

public class Ex14 {
	public static void main(String[] args) {
		final int x = 5;
		final Integer y = 5;
		final double z = 5.0;
		System.out.println(x == y);
		//true
		System.out.println(x == y.doubleValue());
		//true
		System.out.println(y == z);
		//true
		System.out.println(y.doubleValue() == z);
		//true
	}
}

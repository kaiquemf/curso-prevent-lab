package br.com.forms0305;

public class Ex15 {
	public static void main(String[] args) {
		int x = 5;
		final Integer y = 5;
		final double z = 5.0;
		
		System.out.println(x = 10);
//		y = 10;
		// Exception
		
		System.out.println(x == y);
		//false
		System.out.println(x == y.doubleValue());
		//false
		System.out.println(y.intValue() == z);
		//true
		System.out.println(y.doubleValue() == z);
		//true
	}
}

	
package br.com.forms0305;

public class Ex10 {
	public static void main(String[] args) {
		final int     x = 5;
		final Integer y = 5;
		
		System.out.println(x == y);
		//true
		System.out.println(x == y.intValue());
		//true
//		System.out.println(x.equals(y));
		// Exception
	}
}

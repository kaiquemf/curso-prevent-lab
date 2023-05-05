package br.com.forms0305;

public class Ex12 {
	public static void main(String[] args) {
		final Integer x = 500;
		final Integer y = 500;
		
		System.out.println(x == y);
		//false
		System.out.println(x.equals(y));
		//true
		
		final Double xd = 0.1 + 0.2;
		final Double yd = 0.3;
		
		System.out.println(xd == yd);
		//false
		System.out.println(xd.equals(yd));
		//false
	}
}

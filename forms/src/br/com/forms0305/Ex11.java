package br.com.forms0305;

public class Ex11 {
	public static void main(String[] args) {
		final double x = 0.1 + 0.2;
		final Double y = 0.3;
		
		System.out.println(x == y);
		//false
		System.out.println(x == y.doubleValue());
        //false		
//		System.out.println(x.equals(y));
		//Exception
	}
}

package br.com.forms0305;

public class Ex06 {
	public static void main(String[] args) {
		String str1 = "foo";
		String str2 = "FOO";

		System.out.println(str1 == str2);
		// false
		System.out.println(str1.equals(str2));
		// false
		System.out.println(str1.equalsIgnoreCase(str2));
		// true
	}
}

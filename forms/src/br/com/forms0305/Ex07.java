package br.com.forms0305;

public class Ex07 {
	public static void main(String[] args) {
		String str1 = "foo";
		String str2 = null;
		
		System.out.println(str1 == str2);
		//false
		System.out.println(str1.equals(str2));
		//false
	}
}

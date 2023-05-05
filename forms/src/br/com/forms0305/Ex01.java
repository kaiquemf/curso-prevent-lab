package br.com.forms0305;

public class Ex01 {
	public static void main(String[] args) {
		String srt1 = new String("foo");
		String srt2 = new String("foo");

		System.out.println(srt1 == srt2);
		//false
		System.out.println(srt1.equals(srt2));
		//true

	}
}

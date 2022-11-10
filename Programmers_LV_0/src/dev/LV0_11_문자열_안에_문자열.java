package dev;

public class LV0_11_문자열_안에_문자열 {

	public static void main(String[] args) {

		String str1 = "ab6CDE443fgh22iJKlmn1o";
		String str2 = "6CD";
		
		if(str1.contains(str2))System.out.println("1");
		else System.out.println("2");
	}

}

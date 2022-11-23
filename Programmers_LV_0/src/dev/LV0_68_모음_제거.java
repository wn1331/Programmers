package dev;

public class LV0_68_모음_제거 {

	public static void main(String[] args) {
		String my_string = "nice to meet you";
		
		my_string = my_string.replaceAll("a", "");
		my_string = my_string.replaceAll("e", "");
		my_string = my_string.replaceAll("i", "");
		my_string = my_string.replaceAll("o", "");
		my_string = my_string.replaceAll("u", "");
		System.out.println(my_string);
	}

}

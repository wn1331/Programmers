package dev;

public class LV0_24_대문자와_소문자 {

	public static void main(String[] args) {
		String my_string = "cccCCC";
		char[] ch = my_string.toCharArray();
		for(int i = 0;i<ch.length;i++) {
			if(ch[i]<97)ch[i] = Character.toLowerCase(ch[i]);
			else ch[i] = Character.toUpperCase(ch[i]);
		}
		String answer = String.valueOf(ch);
		System.out.println(answer);
	}

}

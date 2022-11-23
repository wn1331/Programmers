package dev;

public class LV0_61_문자_반복_출력하기 {

	public static void main(String[] args) {
		String my_string = "hello";
		int n = 3;
		String answer="";
		String[] ar = my_string.split("");
		
		for(String a : ar) {
			for(int i = 0; i<n;i++) answer+=a;
		}
		
		
		
	}

}

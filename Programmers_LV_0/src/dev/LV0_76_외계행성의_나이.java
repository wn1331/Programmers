package dev;

public class LV0_76_외계행성의_나이 {

	public static void main(String[] args) {
		int age = 100;
		char[] arr = Integer.toString(age).toCharArray();
		String answer = "";
		for(int i = 0; i<arr.length;i++) {
			answer+=Character.toString(((int)arr[i]+49));
		}
		System.out.println(answer);
		
		
	}

}

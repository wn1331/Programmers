package dev;

public class LV0_55_문자열_뒤집기 {

	public static void main(String[] args) {
		String my_string = "jaron";
		String[] arr = my_string.split("");
		String answer = "";
		for(int i=arr.length-1;i>=0;i--)answer+=arr[i];
		
		System.out.println(1);
		
	}

}

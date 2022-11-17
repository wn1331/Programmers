package dev;

public class LV0_25_암호_해독 {

	public static void main(String[] args) {
		String cipher = "dfj ard std      detck d a c  ccc degk"; 
		int code = 4;
		String answer = "";
		String[] arr = cipher.split("");
		// 0 3 7 11 ....
		// 0 4 8 12 ....
		for(int i=code-1;i<arr.length;i+=code) {
			answer+=arr[i];
			
		}
		System.out.println(answer);
	}

}

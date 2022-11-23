package dev;

public class LV0_80_팩토리얼 {

	public static void main(String[] args) {
		int n = 10;
		int answer = 0;
		
		while(true) {
			answer++;
			if(factorial(answer)>n)break;
		}
		
	}
	
	static int factorial(int num) {
		if(num==1)return 1;
		return num*factorial(num-1);
	}

}

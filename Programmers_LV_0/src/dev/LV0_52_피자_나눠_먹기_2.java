package dev;

public class LV0_52_피자_나눠_먹기_2 {

	public static void main(String[] args) {
		int answer = 0;
		int n = 10;
		//n과 6의 최소공배수 구하는 문제. 구하고 6나눔.
		int i = 1;
		while(true) {
			answer = n*i;
			if(answer%6==0)break;
			i++;
		}
		
		System.out.println(answer/6);
		
		
	}

}

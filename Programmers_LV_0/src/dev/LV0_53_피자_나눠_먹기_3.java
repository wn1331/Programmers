package dev;

public class LV0_53_피자_나눠_먹기_3 {

	public static void main(String[] args) {
		int slice = 7, n = 10;
		int answer = 0;
		if(n<slice)answer = 1;
		else {
			if(n%slice==0) answer=n/slice;
			else answer=n/slice+1;
		}
		
	}

}

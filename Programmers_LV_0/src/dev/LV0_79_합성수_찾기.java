package dev;

public class LV0_79_합성수_찾기 {

	public static void main(String[] args) {
		int n = 15;
		int count;
		int answer = 0;
		
		for(int i = 1; i<=n;i++) {
			count = 0;
			for(int j = 1;j<=i;j++) {
				if(i%j==0)count++;
			}
			if(count>=3)answer++;
			
		}
		System.out.println(answer);
		
	}

}

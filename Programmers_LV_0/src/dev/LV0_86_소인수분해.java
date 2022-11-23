package dev;

import java.util.ArrayList;

public class LV0_86_소인수분해 {

	public static void main(String[] args) {
		//소인수분해방법.
		//숫자하나 주어지고, 2부터 그 수까지 탐색, 나머지 연산.
		int n = 420;
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 2;i<=n;i++) {
			//소수인지확인
			int primeNumberCount=0;
			for(int j = 2;j<i;j++) if(i%j==0)primeNumberCount++;
			if(n%i==0&&primeNumberCount==0) {
				n/=i;
				if(!arr.contains(i))arr.add(i);
			}
		}
		int[] answer = arr.stream().mapToInt(i -> i).toArray();		
		
		for(int ans : answer)System.out.println(ans);
	}

}

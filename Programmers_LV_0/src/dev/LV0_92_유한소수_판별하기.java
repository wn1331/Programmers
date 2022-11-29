package dev;

import java.util.ArrayList;
import java.util.Arrays;

public class LV0_92_유한소수_판별하기 {

	public static void main(String[] args) {
		int a = 30, b = 120;
		//유한소수의 조건 : 기약분수로 나타내었을 때, 분모의 소인수가 2와 5만 존재해야 함.
		int gongyaksoo = 0;
		//a와 b의 최대공약수를 구하는 코드작성(유클리드 호제법 이용해도 됨.)
		for(int i = 1; i<=a;i++) if(a%i==0) for (int j = 1; j <= b; j++) if(b%j==0) if(i==j) gongyaksoo=i;
		System.out.println("for문을 이용한 최대공약수 : "+gongyaksoo);
		System.out.println("유클리드 호제법을 이용한 최대공약수 : "+gcd(a,b));
		//b를 최대공약수로 나눈다.(최대공약수로 나눌 시 기약분수의 분모가 됨)
		b/=gongyaksoo;
		if(b==1){
			System.out.println(1);
			System.exit(1);
		}
		//b의 소인수를 탐색. 2와 5만 존재할 경우를 찾는다.
		int[] primeFactor = prime_factor(b);
		String pf_str = "";
		Arrays.sort(primeFactor);
		for(int pf : primeFactor)pf_str+=pf;
		if(pf_str.equals("2")||pf_str.equals("5")||pf_str.equals("25")) System.out.println(1);
		else System.out.println(2);

	}
	//소인수분해해서 소인수 배열 리턴.(중복x)
	static int[] prime_factor(int n){
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
		return arr.stream().mapToInt(i -> i).toArray();
	}
	//유클리드 호제법. 최대공약수 코드.
	public static int gcd(int p, int q)
	{
		if (q == 0) return p;
		return gcd(q, p%q);
	}
}

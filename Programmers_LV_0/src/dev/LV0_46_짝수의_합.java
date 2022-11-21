package dev;

public class LV0_46_짝수의_합 {

	public static void main(String[] args) {
		int answer=0;
		int n = 10;
		for(int i = 0;i<=n;i++)if(i%2==0)answer+=i;
		System.out.println(answer);
	}

}

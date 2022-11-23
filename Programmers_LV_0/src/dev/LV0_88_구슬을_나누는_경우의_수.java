package dev;

public class LV0_88_구슬을_나누는_경우의_수 {

	public static void main(String[] args) {
		int balls = 30, share = 15;
		double ball = (double)balls;
		double shar = (double)share;
		double answer = 1;
		//서로다른 구슬 M개 중 N개를 고르는 경우의 수 nCr
		//n!/(r!*(n-r)!)
		//테스트 케이스 오류 : int,long범위초과. factorial 함수를 사용하면 오버플로우.
		for(int i = 0;i<shar;i++) answer*=(ball-i);
		for(int i = 0;i<shar;i++) answer/=(shar-i);
		
		
		System.out.println((int)answer);
		
		

	}

}

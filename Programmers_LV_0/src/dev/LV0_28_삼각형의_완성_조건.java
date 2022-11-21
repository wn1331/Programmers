package dev;

import java.util.Arrays;

public class LV0_28_삼각형의_완성_조건 {

	public static void main(String[] args) {
		int[] sides = {1,2,3};
		int sum = 0;
		//가장 긴 변 구하기
		Arrays.sort(sides);
		int max_Index = sides.length-1;
		System.out.println(sides[max_Index]);
		
		for(int i= 0; i<max_Index;i++)sum+=sides[i];
		if(sum>sides[max_Index])System.out.println("1");
		else System.out.println("2");
		
	}

}

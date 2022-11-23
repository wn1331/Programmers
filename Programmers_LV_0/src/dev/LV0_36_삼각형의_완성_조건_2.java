package dev;

import java.util.Arrays;

public class LV0_36_삼각형의_완성_조건_2 {

	public static void main(String[] args) {
		int[] sides = {11,7};
		int count = 0;
		//나머지 한 변을 n이라 가정.
		Arrays.sort(sides);

		//sides[1]이 가장 긴 변일 경우. -> sides[1]<sides[0]+n
		for(int i = 1; i<sides[1];i++) {//i가 1~3 , 2~4, 3~5, 
			if(sides[0]+i>sides[1]) {
				System.out.println("sides[1]이 제일 길고 남은한변 : "+i);
				count++;
			}
		}
		//모르는 한 변이 가장 긴 변일 경우.->n<sides[0]+sides[1]
		for(int i = 1; i<sides[0]+sides[1];i++) {
			if(i>=sides[0]&&i>=sides[1]) {
				count++;
				System.out.println("i가 제일 길고 남은 한변 : "+i);
			}
		}
		System.out.println(count);
	}
	

}

package dev;

public class LV0_49_머쓱이보다_키_큰_사람 {

	public static void main(String[] args) {
		
		int[] array = {149, 180, 192, 170};
		int height = 167;
		
		int answer = 0;
		for (int ar : array)if(ar>height)answer++;
		
	}

}

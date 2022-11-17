package dev;

public class LV0_18_가장_큰_수_찾기 {

	public static void main(String[] args) {
		int[] array = {1,8,3};
		
		int[] answer = new int[2];
		int max = 0;
		int max_index = 0;
		for(int i=0;i<array.length;i++) {
			if(max<array[i]) {
				max=array[i];
				max_index = i;
			}
		}
		answer[0] = max;
		answer[1] = max_index;
	}

}

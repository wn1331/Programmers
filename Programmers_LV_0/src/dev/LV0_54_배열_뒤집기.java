package dev;

public class LV0_54_배열_뒤집기 {

	public static void main(String[] args) {
		int[] num_list = {1,2,3};
		int temp = 0;
		int[] answer = new int[num_list.length];
		for(int i = 0; i<num_list.length/2;i++) {
			temp = num_list[i];
			num_list[i] = num_list[num_list.length-i-1];
			num_list[num_list.length-i-1] = temp; 
		}
		
		
	}

}

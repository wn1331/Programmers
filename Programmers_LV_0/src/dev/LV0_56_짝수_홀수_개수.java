package dev;

public class LV0_56_짝수_홀수_개수 {

	public static void main(String[] args) {
		int[] num_list = {1,2,3,4,5};
		int[] answer = {0,0};
		for(int i = 0;i<num_list.length;i++) {
			if(num_list[i]%2==0)answer[0]++;
			else answer[1]++;
		}
		
		
	}

}

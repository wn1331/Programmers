package dev;

public class LV0_83_진료순서_정하기 {

	public static void main(String[] args) {
		int[] emergency = {30, 10, 23, 6, 100};
		int[] answer = new int[emergency.length];
		int min = emergency[0];
		for(int i = 0; i<emergency.length;i++) {
			int count=1;
			for(int j = 0; j<emergency.length;j++) {
				if(emergency[i]<emergency[j]) {
					min=emergency[i];
					count++;
				}
				
			}
			answer[i] = count;
		}
		
		
	}

}

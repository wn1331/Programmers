package dev;

public class LV0_77_배열_회전시키기 {

	public static void main(String[] args) {
		int[] numbers = {4, 455, 6, 4, -1, 45, 6};
		String direction = "left";
		int[] answer = new int[numbers.length];
		if(direction.equals("right")) {
			for(int i = 0;i<numbers.length;i++) {
				if(i==numbers.length-1) answer[0] = numbers[numbers.length-1];
				else answer[i+1] = numbers[i];
			}
		}
		else {//left
			for(int i = numbers.length-1;i>=0;i--) {
				if(i==0) answer[numbers.length-1] = numbers[0];
				else answer[i-1] = numbers[i];
			}
		}

		for(int num : answer)System.out.println(num);
	}

}

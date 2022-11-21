package dev;

import java.util.Arrays;

public class LV0_35_등수_매기기 {

	public static void main(String[] args) {
		int[][] score = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};

		int[] answer = new int[score.length];
		Arrays.fill(answer, score.length);
		
		for(int i = 0; i<score.length;i++) {
			for(int j = 0; j<score.length;j++) {
				if(i!=j&&score[i][0]+score[i][1]>=score[j][0]+score[j][1]) {
					answer[i]--;
					System.out.println("score"+i+"번째가 "+j+"번째보다 작거나 같습니다. 하나뺌");
				}
			}
			
		}
		
		for(int ans : answer)System.out.print(" " + ans);
		System.out.println();
		
	}

}

package dev;

public class LV0_82_2차원으로_만들기 {

	public static void main(String[] args) {
		int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
		int n = 2;
		int[][] answer = new int[num_list.length/n][n];
		int count = 0;
		for(int i = 0; i<num_list.length;i++) {
			for(int j = 0; j<n;j++) {
				if(count<num_list.length) {
					answer[i][j] = num_list[count];
				}
			}
		}
		
		
	}

}

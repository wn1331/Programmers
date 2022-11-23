package dev;

public class LV0_91_직사각형_넓이_구하기 {

	public static void main(String[] args) {
		int[][] dots = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};
		
		int x = dots[0][0];
		int y = dots[0][1];
		int width = 0;
		int height = 0;

		for (int i=1; i<dots.length; i++) {
			if (x != dots[i][0]) {
				width = Math.abs(x - dots[i][0]);
			}
			if (y != dots[i][1]) {
				height = Math.abs(y - dots[i][1]);
			}
		}
		System.out.println(width*height);

	}

}

package dev;

public class LV0_26_369게임 {

	public static void main(String[] args) {
		
		int order = 29423;
		int answer = 0;
		String[] str = Integer.toString(order).split("");
		for(String s : str) {
			if(s.equals("3")||s.equals("6")||s.equals("9"))answer++;
		}
		System.out.println(answer);
	}

}

package dev;

public class LV0_74_개미_군단 {

	public static void main(String[] args) {
		int hp = 23;
		int answer = hp/5;
		hp = hp%5;
		answer+=hp/3;
		hp = hp%3;
		answer+=hp%1;
		System.out.println(answer);
		
	}

}

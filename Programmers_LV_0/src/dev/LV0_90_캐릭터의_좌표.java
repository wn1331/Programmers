package dev;

public class LV0_90_캐릭터의_좌표 {

	public static void main(String[] args) {
		String[] keyinput = {"left", "right", "up", "right", "right"};
		int[] board = {11,11};
		int[] result = {0,0};
		//가로최대 : (board[0]-1)/2
		//세로최대 : (board[1]-1)/2
		
		for(String st : keyinput) {
			if(st.equals("left")&&result[0]>-(board[0]-1)/2) result[0]-=1;
			if(st.equals("right")&&result[0]<(board[0]-1)/2) result[0]+=1; 
			if(st.equals("up")&&result[1]<(board[1]-1)/2) result[1]+=1; 
			if(st.equals("down")&&result[1]>-(board[1]-1)/2) result[1]-=1; 
		}
		System.out.println(result[0] + " " + result[1]);
	}

}

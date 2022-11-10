package dev;

public class LV0_12_OX_퀴즈 {

	public static void main(String[] args) {
		String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"};
		String temp = "";
		int isTrue = 0;
        String[] answer = new String[quiz.length];
        for(int i=0;i<quiz.length;i++){
        	temp = quiz[i];
            String[] arr = temp.split(" ");
            if(arr[0].equals("-")) {
            	isTrue = Integer.parseInt(arr[0])-Integer.parseInt(arr[2]);
            }
            else isTrue = Integer.parseInt(arr[0])+Integer.parseInt(arr[2]);
     	
            if(isTrue==Integer.parseInt(arr[4])) {
            	answer[i] = "O";
            }else answer[i] = "X";
        }
        
		for(int i = 0;i<answer.length;i++) {
			System.out.println(answer[i]);
		}
	}

}

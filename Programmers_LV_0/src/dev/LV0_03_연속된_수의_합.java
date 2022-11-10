package dev;

public class LV0_03_연속된_수의_합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	}

}
class Solution_03 {
    public int[] solution(int num, int total) {
        int[] answer = {};
        int ex=0;
		//num=3일때 x,x+1,x+2 -> 3x+3
		//num=4일때 -> 4x + 6
		//num = 5일때 -> 5x + 10
		//ax+b라고 가정,a = num이고 b = 1부터num-1까지의 합.
		
        int[] answer_ex = new int[num];
		for(int i=1;i<num;i++) {
				ex+=i;//여기서 ex가 b값이 되겠다.
			}
        //ax+b = total
        //ax = total-b
        //x = (total-b)/a
        //x = (total-ex)/num
		int result_Answer = (total - ex)/num;
		for(int i=0;i<num;i++) {
			answer_ex[i] = result_Answer++;
		}
        answer= answer_ex;
        return answer;
    }
}
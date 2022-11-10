package dev;

public class LV0_09_세균_증식 {

	public static void main(String[] args) {
		
		
	}

}
class Solution_09{
    public int solution(int n, int t) {
        int answer = 0;
        for(int i=1;i<=t;i++){
            n*=2;
        }
        answer = n;
        return answer;
    }
}

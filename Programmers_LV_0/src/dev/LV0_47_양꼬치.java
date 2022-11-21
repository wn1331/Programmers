package dev;

public class LV0_47_양꼬치 {

	public static void main(String[] args) {
		class Solution {
		    public int solution(int n, int k) {
		        k-=n/10;
		        int answer = (12000*n) + (2000*k);
		        return answer;
		    }
		}
	}

}

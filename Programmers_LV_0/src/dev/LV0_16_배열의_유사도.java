package dev;

public class LV0_16_배열의_유사도 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class Solution {
	    public int solution(String[] s1, String[] s2) {
	        int answer = 0;
	        for(String st1:s1){
	            for(String st2:s2){
	                if(st1.equals(st2))answer++;
	            }
	        }
	        return answer;
	    }
	}
}

package dev;

public class LV0_44_각도기 {

	public static void main(String[] args) {
		class Solution {
		    public int solution(int angle) {
		        if(angle>0&&angle<90)return 1;
		        else if(angle==90)return 2;
		        else if(angle<180)return 3;
		        else return 4;
		    }
		}
	}

}

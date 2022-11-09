package dev;

public class 다음에_올_숫자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution_02 {
    public int solution(int[] common) {
        int answer = 0;
        for(int i=0;i<common.length;i++){
            //등차수열인 경우
            if(common[0]-common[1]==common[1]-common[2]){
                answer = common[common.length-1]+common[1]-common[0];
            }
            else{
                answer = common[common.length-1]*common[1]/common[0];
            }
        }
        
        return answer;
    }
}
package dev;

public class LV0_14_n의_배수_구하기 {

	public static void main(String[] args) {
		
		
	}

}
class Solution_14{
    public int[] solution(int n, int[] numlist) {
        //아마 빈 배열이 되었을때가 런타임 에러인것 같다
        int[] answer = {};
        int count = 0;
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i<numlist.length;i++){
            if(numlist[i]%n==0){
                count++;
                sb.append(Integer.toString(numlist[i])+" ");      
            }
        }
        if(count==0)return answer;
        answer = new int[count];
        String str = sb.toString();
        String[] str_arr = str.split(" ");
        for(int i = 0;i<str_arr.length;i++){
            answer[i] = Integer.parseInt(str_arr[i]);
        }
        
        return answer;
    }
}

package dev;
import java.util.Arrays;
public class LV0_04_문자열_밀기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Solution_04 {
    public int solution(String A, String B) {
		int answer = 0;
        String temp = "";
        int count = 0;
        String[] arr = A.split("");
        //길이-1번 수행.
        String[] result = B.split("");
        if(A.equals(B))return 0;
        for(int i=0;i<arr.length;){
            for(int j = 0;j<arr.length;j++){
                temp = arr[j];
                arr[j] = arr[arr.length-1-i];
                arr[arr.length-1-i] = temp;
            }

            count++;
            if(count>arr.length*(arr.length-1))return -1;
            
            String arr2 = Arrays.toString(arr);
            String result2 = Arrays.toString(result);
            if(arr2.equals(result2)) {
            	return count;
            }
            
        }
         answer = -1;
		
         return answer;
    
    }
}

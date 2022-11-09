package dev;

public class 잘라서_배열로_저장하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution_05 {
    public String[] solution(String my_str, int n) {
        //스트링을 배열로 변환하고 길이측정
        //길이를 n으로 나눈 몫과 나머지를 구하기
        //반복문을 돌려서 0부터 길이-1만큼 반복. 
        //i가 n값-1이 될 때 까지의 값들을 스트링값에 저장하고 배열에 대입.
        //i가 n값에서부터 2n-1값 이 될 때 까지의 값들을 스트링값에 저장하고 배열에 대입.
        //i가 ?값에서부터 몫*n-1값이 될 때 까지의 값들을 스트링값에 저장하고 배열에 대입.
        //i가 길이값-나머지부터 길이값-1까지 될 때 까지의 값들을 스트링값에 저장하고 배열에 대입.
        String[] arr = my_str.split("");
        int len = arr.length;
        int mok = (len-1)/n;
        String[] answer = new String[mok+1];
        int count=1;
        int namuji = (len-1)%n;
        String temp = "";
        for(int i = 0; i<len-1;i++){
            if(i==(count*n-1)){
                answer[count-1] = temp;
                temp="";
                count+=1;
            }
            
            temp.concat(arr[i]);
            
        }
        
        
        return answer;
    }
}
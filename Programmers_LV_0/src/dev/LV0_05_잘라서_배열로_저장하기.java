package dev;

public class LV0_05_잘라서_배열로_저장하기 {

	public static void main(String[] args) {
		String my_str = "asdasvnakjsvnaskee";
		int n = 4;
		String[] arr = my_str.split("");
		int len = arr.length;
		int mok = (len-1)/n;
		String[] answer = new String[mok+1];
		int count=1;
		String temp = "";
		StringBuilder sb = new StringBuilder(n);
        for(int i = 0; i<len;i++){
            if(i==(count*n)){
            	temp = sb.toString();
                answer[count-1] = temp;
                sb = new StringBuilder(n);
                System.out.println(temp);
                count+=1;
            }
            if(count==mok+1) {
            	temp = sb.toString();
                answer[count-1] = temp;
                System.out.println(temp);
            }
            //System.out.print(arr[i]);
            sb.append(arr[i]);
        }
        
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
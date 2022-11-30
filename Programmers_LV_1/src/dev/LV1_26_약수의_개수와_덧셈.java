package dev;

public class LV1_26_약수의_개수와_덧셈 {
    public static void main(String[] args) {
        int left = 13, right = 17;
        int p_count = 0, answer = 0;
        //left부터 right까지 for문.
        for(int i = left; i<=right;i++){
            //1부터 i 까지 for문. i의 약수의 개수 구하기.
            for(int j = 1; j<=i;j++){
                //나머지연산 -> 약수인지 확인. 개수 증감식
                if(i%j==0)p_count++;
            }
            //약수의 개수가 짝수개면 i를 합연산
            if(p_count%2==0)answer+=i;
            //약수의 개수가 짝수개면 i를 차연산
            else answer-=i;
            //약수의 개수 초기화
            p_count = 0;

        }
        System.out.println(answer);



    }
}

package dev;

public class LV0_94_저주의_숫자3 {

    public static void main(String[] args) {
        int n = 40;
        int answer = 0;
        for(int i = 1;i<=n;i++,answer++){
            while(answer%3==0||Integer.toString(answer).contains("3")){
                answer++;
            }
            System.out.println(i+"번째 인덱스의 값 answer : "+answer);
        }
        System.out.println(answer);

    }
}

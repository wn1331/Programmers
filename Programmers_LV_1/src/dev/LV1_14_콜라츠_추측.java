package dev;

public class LV1_14_콜라츠_추측 {

    public static void main(String[] args) {
        int num = 626331;
        long num_long = num;
        int answer = 0;
        //1-1. 입력된 수가 짝수라면 2로 나눕니다.
        //1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
        //2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
        while(num_long!=1) {
            if (num_long % 2 == 0) num_long /= 2;
            else  num_long = (num_long * 3) + 1;
            answer++;
            if(answer==500)break;
            System.out.println("n의  값 : "+num_long+" 수행횟수 : "+answer);
        }
        if(answer==500) System.out.println(-1);
        else System.out.println(answer);
    }

}

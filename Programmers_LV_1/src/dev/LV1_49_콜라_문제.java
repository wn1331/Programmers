package dev;

public class LV1_49_콜라_문제 {
    public static void main(String[] args) {
        //빈 병 a개를 가져다주면 콜라 b병을 주는 마트가 있을 때, 빈 병 n개를 가져다주면 몇 병을 받을 수 있는지
        int a = 2, b = 1, n = 20;
        //정답 = 19;
        System.out.println(getBottle(2,1,20));

    }
    public static int getBottle(int a, int b, int n){
        if(n<a) return 0;
        int left = n%a;
        int get = n/a*b;
        //a,b는 고정. 재귀함수 사용해서 나머지와 얻은병들로 함수를 다시 돌린다.
        return get + getBottle(a,b,left + get);
    }
}

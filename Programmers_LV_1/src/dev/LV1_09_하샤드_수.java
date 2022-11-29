package dev;

public class LV1_09_하샤드_수 {
    public static void main(String[] args) {
        int x = 10;
        int sum = 0;
        //1. 자릿수의 합 구하기
        String[] str_arr = Integer.toString(x).split("");
        for(String str : str_arr)sum+=Integer.parseInt(str);
        //2. x로 나누기
        if(x%sum==0) System.out.println(true);
        else System.out.println(false);

    }
}

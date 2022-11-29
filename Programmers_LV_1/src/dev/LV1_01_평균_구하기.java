package dev;

public class LV1_01_평균_구하기 {
    public static void main(String[] args) {
        double answer = 0;
        double[] arr = {1,2,3,4,5};

        for(double ar : arr)answer+=ar;
        System.out.println(answer/arr.length);


    }
}

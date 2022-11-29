package dev;

import java.util.ArrayList;
import java.util.Arrays;

public class LV1_17_나누어_떨어지는_숫자_배열 {
    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        ArrayList<Integer> int_arr = new ArrayList<>();
        for(int ar : arr)if(ar%divisor==0)int_arr.add(ar);
        if(int_arr.isEmpty()) int_arr.add(-1);
        int[] answer = int_arr.stream().mapToInt(i -> i).toArray();
        Arrays.sort(answer);
        System.out.println(answer);





    }
}

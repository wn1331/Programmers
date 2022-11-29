package dev;

import java.util.Arrays;
import java.util.Comparator;

public class LV1_11_정수_내림차순으로_배치하기 {
    public static void main(String[] args) {
        long n = 118372;
        String[] arr = Long.toString(n).split("");
        Arrays.sort(arr, Comparator.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(String ar : arr)sb.append(ar);
        long answer = Long.parseLong(sb.toString());


    }
}

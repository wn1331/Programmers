package dev;


import java.util.Arrays;

public class LV1_24_문자열_내림차순으로_배치하기 {
    public static void main(String[] args) {
        String s = "asvaGasSDcwJKqij";
        char[] c_arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int[] i_arr = new int[c_arr.length];
        for (int i = 0; i < c_arr.length; i++) i_arr[i] = c_arr[i];//아스키로
        for(int i : i_arr) System.out.print(i+" ");
        Arrays.sort(i_arr);
        System.out.println();
        for(int i : i_arr) System.out.print(i+" ");

        for (int i = 0; i < c_arr.length; i++) sb.append((char)i_arr[i_arr.length-1-i]);//뒤집기
        System.out.println(sb);


    }
}

package dev;

import java.util.ArrayList;
import java.util.Stack;

public class LV1_32_이상한_문자_만들기 {
    public static void main(String[] args) {
        String s = "   A   a    AaAaAaAaA     aAaAaAa     ";
        //연속된 공백을 하나로 만드는 정규식

        System.out.println(s);
        String[] s_arr = s.split("");
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i = 0;i<s_arr.length;i++){
            if(s_arr[i].equals(" ")){
                count=0;
                sb.append(s_arr[i]);
                continue;
            }
            if(count%2==0)sb.append(s_arr[i].toUpperCase());
            else sb.append(s_arr[i].toLowerCase());
            count++;
        }

        System.out.println(sb.toString());
    }
}

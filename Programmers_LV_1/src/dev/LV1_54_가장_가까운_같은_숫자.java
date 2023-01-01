package dev;

import java.util.Arrays;

public class LV1_54_가장_가까운_같은_숫자 {
    public static void main(String[] args) {
        String s = "banana";

        int[] answer = new int[s.length()];
        String[] s_arr = s.split("");
        for(int i = 0;i<s.length();i++){
            String ex = s.substring(0,i);
            System.out.println(ex);
            //sb에 존재하지 않으면 answer에 해당 인덱스의 값을 -1로
            if(!ex.contains(s_arr[i]))answer[i]=-1;
            else {
                answer[i] = i-ex.lastIndexOf(s_arr[i]);
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}

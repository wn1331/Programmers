package dev;

import java.util.Arrays;

public class LV1_38_문자열_내_마음대로_정렬하기 {
    public static void main(String[] args) {
        String[] strings = {"sunday", "bedroom", "carbon"};
        int n = 3;

        for(int i = 0; i<strings.length;i++) strings[i] =strings[i].charAt(n)+strings[i];

        Arrays.sort(strings);
        for(int i = 0; i< strings.length;i++) strings[i] = strings[i].substring(1, strings[i].length()  - 1 );

        System.out.println(Arrays.toString(strings));
    }
}

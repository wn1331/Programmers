package dev;

import java.util.Arrays;

public class LV1_34_예산 {
    public static void main(String[] args) {
        int[] d = {1,2,3,4,5};//12345
        int budget = 9;
        int answer = 0, sum = 0;
        Arrays.sort(d);
        for(int i : d){
            sum+=i;
            if( sum <= budget ) answer+=1;
            else break;
        }
        System.out.println(answer);
    }
}

package dev;

import java.util.*;

public class LV1_42_두_개_뽑아서_더하기 {
    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1};

        List<Integer> answer_L = new ArrayList();
        int i = 0;
        for(int m = 0; m< numbers.length;m++){
            for(int n = m+1; n< numbers.length;n++){
                int ex = numbers[m] + numbers[n];
                if(!answer_L.contains(ex))answer_L.add(ex);
            }
        }
        //변환
        int[] answer = new int[answer_L.size()];
        for(int e = 0;e<answer.length;e++)answer[e] = answer_L.get(e);
        Arrays.sort(answer);



    }
}

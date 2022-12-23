package dev;

import java.util.HashSet;

public class LV1_41_삼총사 {
    public static void main(String[] args) {
        //재귀함수를 이용한 풀이와 3중 for문을 사용한 풀이가 탐색 속도가 같다.
        int[] number = {-3, -2, -1, 0, 1, 2, 3};
        int answer = 0;
        for(int i = 0; i<number.length;i++){
            for( int j = i+1; j< number.length;j++){
                for(int k = j+1;k< number.length;k++){
                    if(number[i]+number[j]+number[k]==0){
                        answer++;
                        System.out.println(number[i]+" "+number[j]+" "+number[k]);
                    }
                }
            }
        }
        System.out.println(answer);
    }



}

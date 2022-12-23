package dev;

import java.util.*;

public class LV1_51_로또의_최고_순위와_최저_순위 {
    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        //등수 배열 생성
        int[] level = {6, 6, 5, 4, 3, 2, 1};
        int[] answer = new int[2];
        int max_cor = 0;
        int min_cor = 0;
        //lottos의 0의 개수 구하기.
        for(int l : lottos)if(l==0)max_cor++;
        //당첨번호랑 몇개 일치하는지 구하기.
        for(int i = 0;i<6;i++){
            for(int j = 0;j<6;j++){
                if(lottos[i]==win_nums[j]){
                    max_cor++;
                    min_cor++;
                }
            }
        }
        answer[0] = level[max_cor];
        answer[1] = level[min_cor];

        System.out.println(Arrays.toString(answer));
    }
}

package dev;

import java.util.Arrays;

public class LV1_36_최소직사각형 {
    public static void main(String[] args) {

        int x = 0;
        int y = 0;
        int[][] sizes = {{10,7},{12,3},{8,15},{14,7},{5,15}};
        //2차원 배열이 주어지는데 인덱스끼리 정렬.
        for(int[] s : sizes)Arrays.sort(s);
        //정렬했을 때, 0번째 인덱스의 최대값 * 1번째 인덱스의 최대값.
        for(int i = 0; i< sizes.length;i++){
            if(x<sizes[i][0])x=sizes[i][0];
            if(y<sizes[i][1])y=sizes[i][1];
        }
        System.out.println(x*y);
    }
}

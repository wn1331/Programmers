package dev;

import java.util.Arrays;

public class LV1_37_비밀지도 {
    public static void main(String[] args) {
        int[] arr1 = {9, 20, 28, 18, 11}, arr2 = {30, 1, 21, 17, 28};
        int n = 5;


        String[] str_arr1 = new String[n];
        String[] str_arr2 = new String[n];
        String[] answer = new String[n];
        //이진수 변환 -> 정수로 변환 -> 앞자리에 0 채워넣음
        //진수변환. 앞자리 0들이 짤림(   0채워넣는 부분    )(     정수로 변환   )(         이진수변환             )
        //str_arr1[i] = String.format("%0"+n+"d",Integer.parseInt(Integer.toString(arr1[i],2)));
        for(int i=0;i<n;i++){
            str_arr1[i] = String.format("%0"+n+"d",Long.parseLong(Integer.toString(arr1[i],2)));
            str_arr2[i] = String.format("%0"+n+"d",Long.parseLong(Integer.toString(arr2[i],2)));
        }


        //출력
        System.out.println(Arrays.toString(str_arr1));
        System.out.println(Arrays.toString(str_arr2));
        for(int i = 0; i<n;i++){
            String[] ex1 = str_arr1[i].split("");
            String[] ex2 = str_arr2[i].split("");
            StringBuilder sb = new StringBuilder();
            for(int j = 0;j<n;j++) {
                if (Integer.parseInt(ex1[j]) + Integer.parseInt(ex2[j]) >= 1) sb.append("#");
                else sb.append(" ");
            }
            answer[i] = sb.toString();
            sb.delete(0,n);
        }
        System.out.println(Arrays.toString(answer));

    }
}

package dev;

import java.util.Arrays;

public class LV1_37_비밀지도 {
    public static void main(String[] args) {
        int[] arr1 = {9, 20, 28, 18, 11}, arr2 = {30, 1, 21, 17, 28};
        int n = 5;

        String[] str_arr1 = jinsoo(arr1);
        String[] str_arr2 = jinsoo(arr2);
        String[] answer = new String[n];
        //진수변환 메소드를 사용하면 안된다.(맨앞자리 0일시 짤림)


        System.out.println(Arrays.toString(str_arr1));
        System.out.println(Arrays.toString(str_arr2));
//        for(int i = 0; i<n;i++){
//            String[] ex1 = str_arr1[i].split("");
//            String[] ex2 = str_arr2[i].split("");
//            StringBuilder sb = new StringBuilder();
//            for(int j = 0;j<n;j++) {
//                if (Integer.parseInt(ex1[j]) + Integer.parseInt(ex2[j]) >= 1) sb.append("#");
//                else sb.append(" ");
//            }
//            sb.delete(0,4);
//        }


    }
    static String[] jinsoo(int[] arr){
        String[] answer = new String[arr.length];
        for(int i = 0; i<arr.length;i++) {
            StringBuilder sb = new StringBuilder();
            int n = arr[i];
            //2진수로 변환

            for(int j = 0; j<arr.length;j++){
                
            }
            answer[i] = sb.toString();
        }
        return answer;
    }
}

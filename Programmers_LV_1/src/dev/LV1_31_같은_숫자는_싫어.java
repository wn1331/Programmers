package dev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LV1_31_같은_숫자는_싫어 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        ArrayList<Integer> arr_Alist = new ArrayList<>();
        arr_Alist.add(arr[0]);
        for(int i = 1;i<arr.length;i++){
            if(!arr_Alist.get(arr_Alist.size()-1).equals(arr[i]))arr_Alist.add(arr[i]);
        }


        //stream을 사용하지 않고 ArrayList를 int[]로 변환
        int[] answer = new int[arr_Alist.size()];
        for (int i = 0; i < answer.length; i++) answer[i] = arr_Alist.get(i);

        for (Integer ar : answer) System.out.print(ar + " ");

    }
}

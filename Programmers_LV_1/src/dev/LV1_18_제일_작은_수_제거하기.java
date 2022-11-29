package dev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class LV1_18_제일_작은_수_제거하기 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        //int[] to ArrayList
        ArrayList<Integer> integerArray = (ArrayList<Integer>) Arrays.stream(arr).boxed().collect(Collectors.toList());

        integerArray.remove(Collections.min(integerArray));
        if(integerArray.isEmpty())integerArray.add(-1);

        //ArrayList to int[]
        int[] answer = integerArray.stream().mapToInt(i -> i).toArray();
    }
}

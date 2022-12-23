package dev;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LV1_44_폰켓몬 {
    public static void main(String[] args) {
        int[] nums = {3,3,3,2,2,4};
        int answer = nums.length/2;
        Set<Integer> set = new HashSet<>();
        for(int i = 0;i< nums.length;i++)set.add(nums[i]);
        int[] nums_d = new int[set.size()];
        int i = 0;
        Iterator<Integer> it = set.iterator(); // set을 Iterator 안에 담기

        while(it.hasNext()) nums_d[i++] = it.next();

        if(nums_d.length < nums.length/2) answer = nums_d.length;

        System.out.println(answer);
    }
}

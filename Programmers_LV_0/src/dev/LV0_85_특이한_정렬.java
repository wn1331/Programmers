package dev;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.Math.abs;

public class LV0_85_특이한_정렬 {

	public static void main(String[] args) {
		int[] numlist = {10000,20,36,47,40,6,10,7000};
		List<Integer> n_arr = new ArrayList<>();
		int n = 30;
		for(int i=0;i<numlist.length;i++)numlist[i]-=n;
		for(int N : numlist)n_arr.add((abs(N)));
		System.out.println(n_arr);
	}
}

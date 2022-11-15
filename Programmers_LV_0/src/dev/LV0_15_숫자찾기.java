package dev;

public class LV0_15_숫자찾기 {

	public static void main(String[] args) {
		int num = 232443;
		int k = 4;
		int result = -1;
		int count = 1;
		String str = Integer.toString(num);
		String K = Integer.toString(k);
		String[] arr = str.split("");
		for(int i=0;i<str.length();i++) {
			if(arr[i].equals(K)) {
				result = count;
				break;
			}else count ++;
			
		}
		System.out.println(result);
		for(String st : arr)System.out.println(st);
	}

}

package dev;

public class LV0_13_자릿수_더하기 {

	public static void main(String[] args) {
		int n = 123456789;
		String n_str = Integer.toString(n);
		
		String[] arr = n_str.split("");
		int sum = 0;
		for(int i = 0;i<arr.length;i++) {
			sum+=Integer.parseInt(arr[i]);
		}
		System.out.println(sum);
	}

}

package dev;

public class LV0_32_이진수_더하기 {

	public static void main(String[] args) {
		String bin1 = "1001", bin2 = "1111";
		int result = Integer.valueOf(bin1,2) + Integer.valueOf(bin2,2);
		String answer = Integer.toBinaryString(result);
		
	}

}

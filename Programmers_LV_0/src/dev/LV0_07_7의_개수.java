package dev;

public class LV0_07_7의_개수 {

	public static void main(String[] args) {
		//7의 개수 구하기.
		int[] arr = {7,12,77,175};
		//result = 7의 개수
		int result = 0;
		//StringBuffer 객체 생성.
		StringBuffer sb = new StringBuffer();
		//arr의 요소들을 String으로 변환.(int배열이 String배열로 바뀜)
		arr.toString();
		//StringBuffer에 요소들 합치기.
		for(int i=0;i<arr.length;i++) {
			sb.append(arr[i]);
		}
		//StringBuffer을 String으로 변환.
		String result_String = sb.toString();
		//변환한 String을 다시 String 배열로 변환.
		String[] arr_String = result_String.split("");
		//7인 요소 찾아서 개수찾기.
		for(int i=0;i<arr_String.length;i++) {
			if(arr_String[i].equals("7")) {
				result++;
			}
		}
	}

}

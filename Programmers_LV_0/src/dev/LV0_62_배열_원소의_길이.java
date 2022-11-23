package dev;

public class LV0_62_배열_원소의_길이 {

	public static void main(String[] args) {
		
		String[] strList = {"We", "are", "the", "world!"};
		int[] answer = new int[strList.length];
		
		for(int i=0;i<strList.length;i++)answer[i] = strList[i].length();
		
		
	}

}

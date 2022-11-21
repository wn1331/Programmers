package dev;

import java.util.ArrayList;
import java.util.Iterator;

public class LV0_31_A로_B_만들기 {

	public static void main(String[] args) {
		//after를 객체리스트에 저장.
		//before의 배열 요소가 after 배열 요소에 존재한다면, after배열의 해당 요소를 제거.
		ArrayList<String> result = new ArrayList();
		String before = "olleh", after = "hello";
		String[]bef = before.split("");
		String[]aft = after.split("");
		for(String a : aft)result.add(a);
		
		for(int i = 0; i<bef.length;i++) {
			int count = 0;
			for(int j = 0; j<aft.length;j++) {
				System.out.println(++count+"번째 실행");
				if(bef[i].equals(aft[j])) {
					result.remove(aft[j]);
					for(String ar : result)System.out.print(ar);
					System.out.println();
					break;
				}
			}
		}
		if(result.isEmpty())System.out.println(1);
		else System.out.println(0);;
		
	}

}

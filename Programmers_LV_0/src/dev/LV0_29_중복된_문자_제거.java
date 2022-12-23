package dev;

import java.util.*;

public class LV0_29_중복된_문자_제거 {

	public static void main(String[] args) {
		String my_string = "We are the world";
		String answer = "";
		String[] arr = my_string.split("");
		List<String> list = new ArrayList<>(Arrays.asList(arr));
		for(int i = 0; i<list.size();i++){
			for(int j = i+1;j<list.size();j++){
				if(list.get(i).equals(list.get(j)))list.set(j,"");
			}
		}
		System.out.println(list);
		for(String st : list)answer+=st;
		
		System.out.println(answer);
	}

}

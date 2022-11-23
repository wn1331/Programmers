package dev;

public class LV0_73_가위_바위_보 {

	public static void main(String[] args) {
		String rsp = "205";
		String[] arr = rsp.split("");
		String answer = "";
		for(String ar : arr) {
			if(ar.equals("0"))answer+="5";
			if(ar.equals("2"))answer+="0";
			if(ar.equals("5"))answer+="2";
		}
	
	}

}

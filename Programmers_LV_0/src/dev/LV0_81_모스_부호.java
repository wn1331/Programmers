package dev;

public class LV0_81_모스_부호 {

	public static void main(String[] args) {
		String letter = ".... . .-.. .-.. ---";
		String[] arr = letter.split(" ");
		String answer = "";
		for(String ar : arr) {
			ar = convert(ar);
			answer+=ar;
		}
		System.out.println(answer);
		
		
	}

	static String convert(String mos) {
		if(mos.equals(".-"))return "a";
		if(mos.equals("-..."))return "b";
		if(mos.equals("-.-."))return "c";
		if(mos.equals("-.."))return "d";
		if(mos.equals("."))return "e";
		if(mos.equals("..-."))return "f";
		if(mos.equals("--."))return "g";
		if(mos.equals("...."))return "h";
		if(mos.equals(".."))return "i";
		if(mos.equals(".---"))return "j";
		if(mos.equals("-.-"))return "k";
		if(mos.equals(".-.."))return "l";
		if(mos.equals("--"))return "m";
		if(mos.equals("-."))return "n";
		if(mos.equals("---"))return "o";
		if(mos.equals(".--."))return "p";
		if(mos.equals("--.-"))return "q";
		if(mos.equals(".-."))return "r";
		if(mos.equals("..."))return "s";
		if(mos.equals("-"))return "t";
		if(mos.equals("..-"))return "u";
		if(mos.equals("...-"))return "v";
		if(mos.equals(".--"))return "w";
		if(mos.equals("-..-"))return "x";
		if(mos.equals("-.--"))return "y";
		if(mos.equals("--.."))return "z";
		else return "";
	}

}

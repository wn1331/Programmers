package dev;

public class 옹알이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Solution_01 {
    public int solution(String[] babbling) {
        int answer = 0;
        String new_String = "";
        for(int i=0;i<babbling.length;i++){
        	new_String = babbling[i];
            if(babbling[i].contains("aya")) new_String = new_String.replaceAll("aya"," ");
            if(babbling[i].contains("ye")) new_String = new_String.replaceAll("ye"," ");
            if(babbling[i].contains("woo")) new_String = new_String.replaceAll("woo"," ");
            if(babbling[i].contains("ma"))  new_String = new_String.replaceAll("ma"," ");
            new_String = new_String.replaceAll(" ", "");
            if(new_String.equals(""))answer+=1;
        }
        
        return answer;
    }
}

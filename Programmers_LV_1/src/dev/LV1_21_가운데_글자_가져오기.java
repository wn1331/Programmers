package dev;

public class LV1_21_가운데_글자_가져오기 {
    public static void main(String[] args) {
        String str = "abcde";
        //길이가 짝수면 2개 반환
        if(str.length()%2==0) System.out.println(str.substring(str.length()/2-1,str.length()/2+1));
        //길이가 홀수면 1개 반환
        else System.out.println(str.substring(str.length()/2,str.length()/2+1));


    }
}

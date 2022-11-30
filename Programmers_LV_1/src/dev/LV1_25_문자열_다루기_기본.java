package dev;

public class LV1_25_문자열_다루기_기본 {
    public static void main(String[] args) {
        String s = "1234";

        char[] c_arr = s.toCharArray();
        //문자열에 문자가 포함일 경우
        for(char c : c_arr){
            if((int)c<48||(int)c>57) {
                System.out.println("문자 탐색으로 인한 "+false);
                System.exit(1);
            }
        }
        //문자열에 숫자가 포함이지 않지만 길이가 4나 6이 아닐 경우
        System.out.println(s.length());
        if(s.length()==4) System.out.println(true);
        if(s.length()==6) System.out.println(true);

        System.out.println(false);

    }
}

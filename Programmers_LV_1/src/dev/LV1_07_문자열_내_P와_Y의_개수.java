package dev;

public class LV1_07_문자열_내_P와_Y의_개수 {
    public static void main(String[] args) {
        String s = "pPoooyY";

        int p_count = 0, y_count = 0;

        String[] s_arr = s.split("");
        for(String str : s_arr){
            if(str.equals("p")||str.equals("P"))p_count++;
            else if(str.equals("y")||str.equals("Y"))y_count++;
        }
        if(p_count==y_count) System.out.println(true);
        else System.out.println(false);



    }
}

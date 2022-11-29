package dev;

public class LV1_04_자릿수_더하기 {
    public static void main(String[] args) {
        int n = 123;
        int answer = 0;
        String[] str_arr = Integer.toString(n).split("");
        for(String str : str_arr)answer+=Integer.parseInt(str);
        System.out.println(answer);

    }
}

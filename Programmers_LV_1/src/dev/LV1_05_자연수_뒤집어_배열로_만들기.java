package dev;

public class LV1_05_자연수_뒤집어_배열로_만들기 {
    public static void main(String[] args) {
        long n = 12345;
        String[] str_arr = Long.toString(n).split("");
        int[] answer = new int[str_arr.length];
        for(int i = answer.length-1; i>=0;i--) answer[i] = Integer.parseInt(str_arr[answer.length-i-1]);

        for(int ans : answer) System.out.println(ans);
    }
}

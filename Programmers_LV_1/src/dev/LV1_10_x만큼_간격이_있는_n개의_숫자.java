package dev;

public class LV1_10_x만큼_간격이_있는_n개의_숫자 {
    public static void main(String[] args) {
        int x = 2, n = 5;
        long[] answer = new long[n];

        for(int i=0;i<n;i++)answer[i] = (long)x+(long)(i*x);



        for(long ans : answer) System.out.print(ans+" ");


    }
}

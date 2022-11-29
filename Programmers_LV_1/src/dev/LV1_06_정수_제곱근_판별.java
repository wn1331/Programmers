package dev;

public class LV1_06_정수_제곱근_판별 {
    public static void main(String[] args) {
        long n = 25000000000000L;
        double k = Math.sqrt(n);
        //정수인지 소수인지 판별.
        if((k-(int)k)==0.0) System.out.println((int)((k+1)*(k+1)));
        else System.out.println(-1);

    }
}

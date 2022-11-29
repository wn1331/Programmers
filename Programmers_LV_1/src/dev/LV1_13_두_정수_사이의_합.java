package dev;

public class LV1_13_두_정수_사이의_합 {
    public static void main(String[] args) {

        int a = -10000000,b = 10000000;
        long answer = 0L;
        if(a<=b) for(long i = a; i<=b;i++)answer+=i;
        else for(long i = b; i<=a;i++)answer+=i;

        System.out.println(answer);
    }
}

package dev;

public class LV1_02_약수의_합 {
    public static void main(String[] args) {
        int n = 12;

        int answer = 0;
        for(int i=1;i<=n; i++)if(n%i==0)answer+=i;

        System.out.println(answer);
    }
}

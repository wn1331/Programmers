package dev;

public class LV1_30_최대공약수와_최소공배수 {
    public static void main(String[] args) {
        int n = 3, m = 12;
        //최대공약수 = 유클리드 호제법 사용
        //최소공배수 = 두 수의 곱을 최대공약수로 나눈 값

        //return new int[]{gcd(n, m), (n * m) / gcd(n, m)};


    }

    //유클리드 호제법 -> 최대공약수 구하는 알고리즘(재귀법을 사용한다)
    public static int gcd(int p, int q) {
        if (q == 0) return p;
        return gcd(q, p%q);
    }

}

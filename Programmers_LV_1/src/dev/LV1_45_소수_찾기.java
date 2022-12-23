package dev;

public class LV1_45_소수_찾기 {
    public static void main(String[] args) {
        //에라토스테네스의 체 문제.

        int n = 5;
        int answer = 0;
        int[] numbers = new int[n+1];
        for (int i = 0; i <= n; i++) numbers[i] = i;

        //2부터 n 전까지 순회.
        for (int i = 2; i <= n; i++) {
            //인덱스 i의값이 1이면 건너 뜀.
            if (numbers[i] == 1) continue;
            answer++;
            for (int j = 2 * i; j <= n; j += i) {
                numbers[j] = 1; // x가 소수였을 경우, x의 배수들을 전부 1로 초기화. 에라토스테네스의 체 알고리즘의 핵심. (채로 거른다)
            }

        }
        System.out.println(answer);
    }

}

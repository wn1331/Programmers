package dev;

import java.util.ArrayList;

public class LV1_33_3진법_뒤집기 {
    public static void main(String[] args) {
        int n = 45;//3진법으로 바꿨을 때 1200
        int answer = 0;
        int count = 1;
        ArrayList<Integer> arr = new ArrayList<>();
        //1.3진법으로 표기 후 ArrayList에 저장.
        while (n != 0) {
            arr.add(n % 3);
            n /= 3;
        }
        //2.뒤집으면서 10진법으로.
        for (int i = arr.size() - 1; i >= 0; i--, count *= 3) {
            answer += arr.get(i) * count;
        }

        System.out.println(answer);
    }


}

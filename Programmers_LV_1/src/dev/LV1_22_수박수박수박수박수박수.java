package dev;

public class LV1_22_수박수박수박수박수박수 {
    public static void main(String[] args) {
        int n = 5;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<n;i++){
            if(i%2==0)sb.append("수");
            else sb.append("박");
        }
        System.out.println(sb);

    }
}

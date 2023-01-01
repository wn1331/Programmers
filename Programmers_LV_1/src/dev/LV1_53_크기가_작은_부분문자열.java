package dev;

public class LV1_53_크기가_작은_부분문자열 {
    public static void main(String[] args) {
        String t = "3141592";
        String p = "271";
        //실행횟수
        //t의 길이 - p의 길이 + 1
        //ex 3141592 -> 271
        //t의길이 = 7, p의길이 = 3
        //5번.
        int answer = 0;
        for(int i = 0;i<t.length()-p.length()+1;i++){
            String ex = t.substring(i,i+p.length());
            System.out.print(ex+" ");
            if(Double.parseDouble(p)>=Double.parseDouble(ex))answer++;
        }
        System.out.println("답 : "+answer);

    }
}

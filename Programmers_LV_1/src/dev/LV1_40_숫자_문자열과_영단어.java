package dev;

public class LV1_40_숫자_문자열과_영단어 {
    public static void main(String[] args) {
        String s = "23four5six7";
        String[] numbers = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for(int i = 0; i<numbers.length;i++){
            if(s.contains(numbers[i])) s = s.replaceAll(numbers[i],Integer.toString(i));
        }
        System.out.println(s);
    }
}

package dev;

public class LV1_35_시저_암호 {
    public static void main(String[] args) {
        String s = "a B z Z y";
        int n = 4;
        char[] arr = s.toCharArray();
        for(int i = 0; i<arr.length;i++){
            if(arr[i]!=32) {
                if (arr[i] <= 90 - n) arr[i] += n;
                else if (arr[i] > 90 && arr[i] <= 96 - n) arr[i] += n;
                else if (arr[i] >= 97 && arr[i] < 123 - n) arr[i] += n;
                else arr[i] += n - 26;
            }
        }
        String answer = new String(arr);
        System.out.println(answer);

    }
}

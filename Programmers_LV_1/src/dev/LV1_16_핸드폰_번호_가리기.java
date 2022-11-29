package dev;

public class LV1_16_핸드폰_번호_가리기 {
    public static void main(String[] args) {
        String phone_number = "01033334444";
        String answer = "";
        for(int i = 0;i<phone_number.length()-4;i++) answer+="*";


        System.out.println(answer+phone_number.substring(phone_number.length()-4));
    }
}

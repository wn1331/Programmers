package dev;

public class LV1_27_부족한_금액_계산하기 {
    public static void main(String[] args) {
        int price = 3, count = 4, money = 20;
        long need_money = 0;
        //오버플로우 유의
        for(int i = 1;i<=count; i++){
            need_money+=price*i;
        }
        if(money>=need_money) System.out.println(0);
        System.out.println(need_money-(long)money);



    }
}

package dev;

public class LV1_52_푸드_파이트_대회 {
    public static void main(String[] args) {
        int[] food = {1, 3, 4, 6};
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int i = 1; i<food.length;i++){
            String calory = Integer.toString(i);
            sb1.append(calory.repeat(food[i]/2));
            sb2.append(calory.repeat(food[i]/2));
        }
        sb1.append("0");
        sb1.append(sb2.reverse());
        System.out.println(sb1.toString());

    }
}

package dev;

import java.util.Stack;

public class LV1_56_숫자_짝꿍 {
    public static void main(String[] args) {
        //String1,2를 배열로
        //스트링 1에서 2찾고 contains 쓰고 해당 인덱스 제거, int배열생성후 해당값 추가
        String X = "12321", Y = "11111000";

        String[] x_arr = X.split("");
        String[] y_arr = Y.split("");

        for(int i = 0; i<x_arr.length;i++){
            if(Y.contains(x_arr[i]))Y.replace(x_arr[i],"");
        }
        System.out.println(Y);





    }
}

package dev;

import java.util.ArrayList;
import java.util.Arrays;

public class LV1_15_서울에서_김서방_찾기 {
    public static void main(String[] args) {
        String[] seoul = {"Kim"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(seoul));
        System.out.println("김서방은 "+arrayList.indexOf("Kim")+"에 있다");


    }
}

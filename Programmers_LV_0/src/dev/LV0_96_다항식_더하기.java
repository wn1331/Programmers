package dev;

import java.util.ArrayList;

public class LV0_96_다항식_더하기 {

    public static void main(String[] args) {
        String polynomial = "x";
        int answer = 0;
        int vari_answer = 0;
        String[] arr = polynomial.split(" ");
        ArrayList<String> vari = new ArrayList<>();

        //변수만 ArrayList에 담기. 상수만 answer에 더하기.
        for(String ar : arr){
            if(ar.contains("x"))vari.add(ar);
            else if(!ar.equals("+"))answer+=Integer.parseInt(ar);
        }
        //ArrayList의 변수 더하기.
        //변수가 있을 때 (ArrayList가 비어있지 않을 때)
        if(!vari.isEmpty()) {
            for (int i = 0; i < vari.size(); i++) {
                //ArrayList의 "x"문자 제거.
                vari.set(i, vari.get(i).replace("x", ""));
                //공백이 되면 1로 인식하고 연산
                if (vari.get(i).equals("")) vari_answer++;
                //공백이아니면 숫자만 남음. 그 숫자를 연산
                else vari_answer += Integer.parseInt(vari.get(i));
            }
            //변수가 존재하고 상수가 존재하지 않을 때의 출력문
            if(answer == 0) {
                //상수가 존재하지 않고 변수의 계수가 1일 때의 출력문
                if(vari_answer==1)System.out.println("x");
                //상수가 존재하지 않고 변수의 계수가 1이 아닐 때의 출력문
                else System.out.println(vari_answer+"x");
            }
            //변수가 존재하고 상수가 존재할 때의 출력문
            else {
                //상수가 존재하고 변수의 계수가 1일 때의 출력문
                if(vari_answer == 1)System.out.println("x + "+answer);
                //상수가 존재하고 변수의 계수가 1이 아닐 때의 출력문
                else System.out.println(vari_answer + "x + "+answer);
            }
        }
        //변수가 존재하지 않을 때의 출력문
        else System.out.println(answer);
    }
}

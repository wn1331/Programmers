package dev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LV1_50_다트_게임 {
    public static void main(String[] args) {
        String dartResult = "1D2S3T*";
        //D = 제곱, S = 그대로, T = 세제곱 , * = 해당점수, 전 점수 2배. # = 해당 점수 마이너스
        int answer = 0;
        String[] strArr = dartResult.split("");
        List<String> str = new ArrayList<>();
        for(String s : strArr)str.add(s);

        System.out.println("문자열 배열 : "+str);
        for(int i = 0; i<str.size();i++){
            if(str.get(i).equals("0")&&str.get(i-1).equals("1")){
                str.remove(i);
                str.set(i-1,"10");
            }
        }
        System.out.println("숫자와 문자를 분리한 배열 : "+str);
        ///여기까지 숫자와 문자 분리 완료
        List<String> list = new ArrayList<>();
        for(int i = 0;i<str.size();i++){
            if(str.get(i).equals("D")) {
                str.set(i-1,Integer.toString((int)Math.pow(Integer.parseInt(str.get(i-1)),2)));
                str.set(i,"");
            }
            if(str.get(i).equals("T")) {
                str.set(i-1,Integer.toString((int)Math.pow(Integer.parseInt(str.get(i-1)),3)));
                str.set(i,"");
            }
            if(str.get(i).equals("S"))str.set(i,"");

        }
        System.out.println("알파벳과 숫자를 연산한 배열 : "+str);
        //여기까지 알파벳과 숫자 연산했음
        str.removeAll(Arrays.asList(""));
        System.out.println("공백 제거한 배열 : "+str);
        //공백제거
        for(int i = 0; i<str.size();i++){
            //i의 인덱스가 1일때는 다른 연산을 해야함.(숫자가 1개뿐이기 때문)
            if(i==1){
                if(str.get(i).equals("#")){
                    str.set(i-1,Integer.toString(Integer.parseInt(str.get(i-1))*-1));
                    str.remove(i--);
                }
                if(str.get(i).equals("*")){
                    str.set(i-1,Integer.toString(Integer.parseInt(str.get(i-1))*2));
                    str.remove(i--);
                }
            }
            else {
                if(str.get(i).equals("#")){
                    str.set(i-1,Integer.toString(Integer.parseInt(str.get(i-1))*-1));
                    str.remove(i--);
                }
                if(str.get(i).equals("*")){
                    str.set(i-1,Integer.toString(Integer.parseInt(str.get(i-1))*2));
                    try{str.set(i-2,Integer.toString(Integer.parseInt(str.get(i-2))*2));}catch (Exception e){};
                    str.remove(i--);
                }
            }
        }
        // #,*연산
        System.out.println("특수문자 연산한 배열 : "+str);
        for(String s : str)answer+=Integer.parseInt(s);
        System.out.println("정답 : "+answer);
    }
}

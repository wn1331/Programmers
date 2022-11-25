package dev;

import java.util.ArrayList;

public class LV0_93_컨트롤_제트 {

    public static void main(String[] args) {
        String s = 	"10 Z 20 Z 1";
        int answer = 0;
        ArrayList<Integer> Z = new ArrayList<>();
        int Z_count = 0;

        //String을 String 배열로 변환
        String[] s_arr = s.split(" ");

        for(int i = 0; i<s_arr.length;i++){
            //요소 중 숫자라면
            if(!s_arr[i].equals("Z")){
                //숫자 더함
                answer+=Integer.parseInt(s_arr[i]);
                //더한 숫자 Z배열에 넣음
                Z.add(Integer.parseInt(s_arr[i]));
            }
            else{
                if(i!=0){
                    answer-=Integer.parseInt(Z.get(Z.size()-1).toString());
                    Z.remove(Z.size()-1);
                }
            }
        }
        for(Integer z : Z) System.out.printf(z+" ");
        System.out.println("------");
        System.out.println(Z_count);
        System.out.println(answer);



    }
}

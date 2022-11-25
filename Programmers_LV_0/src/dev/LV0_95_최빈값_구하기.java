package dev;

import java.util.Arrays;

public class LV0_95_최빈값_구하기 {

    public static void main(String[] args) {
        int[] array = {1,2,3};
        int count=0, max = 0;
        Boolean search_max = false;

        Arrays.sort(array);
        //1. 배열 두번 돌려야함
        //2. 첫번째 for문. -> 중복된 값 중 가장 많이 중복된 개수 MAX 찾기.
        //3. 두번째 for문. -> 탐색해서 max값이 중복된 개수라면 변수에 저장. 개수가 같다면 -1 리턴.
        for(int i = 0; i<array.length; i++){
            //가장마지막요소는 다음 요소랑 중복검사안함, 다음요소랑 중복검사
            if(i!=(array.length-1) && array[i] == array[i+1])count++;
            //중복이아니거나 마지막요소일 때,
            else {
                //count가 최대값이면 max에 count값저장.
                if(max<=count)max=count+1;
                //중복이아닐때, 포문 끝에서 count초기화.
                count = 0;
            }
        }
        System.out.println("MAX값 : "+max);
        for(int i = 0;i< array.length;i++){
            //위와같이 중복검사 후 갯수저장.
            if(i!=(array.length-1) && array[i] == array[i+1]){
                count++;
            }
            //중복이아니거나 마지막 요소일 때,
            else {
                if(count==(max-1)) {
                    System.out.println("MAX값과 같은 "+array[i]+"를 찾았습니다!");
                    if(search_max) {
                        System.out.println(-1);
                        break;
                    }
                    else {
                        search_max=true;
                        System.out.println(array[i]);
                        break;

                    }
                }
                count = 0;
            }
        }



    }

}

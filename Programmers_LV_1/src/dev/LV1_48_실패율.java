package dev;

import java.util.*;

public class LV1_48_실패율 {
    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        //정답을 저장할 answer 배열
        int[] answer = new int[N];
        //HashMap key 값은 1부터 N+1까지의 숫자. value는 0으로 초기화
        Map<Integer,Double> map = new HashMap<>(){{
            for(int i = 1;i<=N+1;i++) put(i,0.0);
        }};
        //스테이지 별로 값을 하나씩 추가해 준다. 지나갈수록 1이 증가
        for(int i=0;i< stages.length;i++){
            for(int j = 1;j<=stages[i];j++) {
                map.replace(j,map.get(j),map.get(j)+1);
            }
        }
        System.out.println("단계별 지나간(머무른) 횟수"+map);
        //실패율을 계산하는 코드. value값에 덮어쓰기함
        for(int i = 1; i<=N+1;i++) if(i!=N+1) map.replace(i,map.get(i),map.get(i+1)/map.get(i));
        System.out.println("단계별 실패율"+map);
        //N+1번째 스테이지 제거
        map.remove(N+1);
        System.out.println("마지막+1 스테이지를 제외한 실패율"+map);
        ///////////////////////////////////////
        //value값을 기준으로 정렬하였다. LinkedList로 entryList 구현 후 정렬.
        List<Map.Entry<Integer, Double>> entryList = new LinkedList<>(map.entrySet());
        entryList.sort(Map.Entry.comparingByValue());
        System.out.println("정렬된 map"+entryList);
        //정렬된 key 값을 순차적으로 answer배열에 대입.
        for(int i = 0; i<N;i++) answer[i] = entryList.get(i).getKey();


        System.out.println("정답 : "+Arrays.toString(answer));


    }
}

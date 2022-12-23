package dev;

import java.util.Arrays;

public class LV1_39_K번째_수 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        //1. answer의 길이 정하기
        int[] answer = new int[commands.length];
        //2. commands의 길이만큼 for문 수행. 연산 결과값 answer에 순차적으로 저장.
        for(int i = 0; i<commands.length;i++){
            //3. 연산에 필요한 newArr(잘라놓은 배열 저장할 공간) 초기화
            int[] newArr = new int[commands[i][1]-commands[i][0]+1];
            //4. newArr에는 array의 commands[i][0]번째 인덱스 부터 commands[i][1]번째 인덱스까지 저장해야 함.
            for(int j = commands[i][0]-1, count = 0; j< commands[i][1];j++,count++){
                newArr[count] = array[j];
            }
            //정렬
            Arrays.sort(newArr);
            for(int n : newArr) System.out.print(n+" ");
            //answer의 i번째 값을 하나씩 대입
            answer[i] = newArr[commands[i][2]-1];
            System.out.println();
        }
        for (int a : answer) System.out.println(a);
    }
}

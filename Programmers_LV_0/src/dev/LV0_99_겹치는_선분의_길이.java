package dev;

import java.util.ArrayList;

public class LV0_99_겹치는_선분의_길이 {

    public static void main(String[] args) {
        int [][] lines = {{0, 5}, {3, 9}, {1, 10}};
        int answer = 0;
        int min = lines[0][0], max = lines[0][0];
        //최대, 최소값 찾기
        for(int i = 0; i<lines.length;i++) for (int j = 0; j<2;j++){
                if(min>lines[i][j])min=lines[i][j];
                if(max<lines[i][j])max=lines[i][j];
            }
        ArrayList<Arr> arr = new ArrayList<>();
        //for문으로 값 넣기.
        for(int i = 0;i<max-min+1;i++) arr.add(new Arr(min+i,0));

        //출력
        for(int i = 0;i<max-min+1;i++)arr.get(i).show();

        //
        int count = 0;
        for(int i = 0; i<lines.length;i++){
            for(int j = lines[i][0]; j<lines[i][1];j++){
                if(arr.get(count).number==j)arr.get(count).count+=1;

            }
        }
        System.out.println(min+","+max);

    }
    static class Arr{
        int number;
        int count;
        Arr(int number, int count){
            this.number = number;
            this.count = 0;
        }
        public void show(){
            System.out.println("index : "+this.number+" count : "+this.count);
        }
    }

}

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
        for(int i = 0;i<max-min+1;i++) {
            if(arr.size()!=max-min)arr.add(new Arr(min+i,min+i+1));
        }
        //계산식.
        //lines의 요소만큼 수행.
        for(int i = 0; i<lines.length;i++){
//            //lines의 요소의 길이(0번째 인덱스부터 1번째 인덱스 길이) 만큼 수행.
            for(int j = lines[i][0]; j<lines[i][1];j++){
                System.out.println(j+"에서 "+(j+1)+"연결");
                for(int cnt = 0;cnt<arr.size();cnt++){
                    if(arr.get(cnt).first_number==j){
                        arr.get(cnt).count+=1;
                    }
                }
            }
        }
        //연산 후 출력
        for(int i = 0;i<max-min;i++)arr.get(i).show();
        for(Arr ar : arr)if(ar.count>=2)answer++;
        System.out.println(answer);



    }
    static class Arr{
        int first_number;
        int second_number;
        int count;

        Arr(int first_number,int second_number){
            this.first_number = first_number;
            this.second_number = second_number;
            this.count = 0;
        }
        public void show(){
            System.out.println("numbers : "+this.first_number+", "+this.second_number + " count : "+this.count);
        }
    }

}

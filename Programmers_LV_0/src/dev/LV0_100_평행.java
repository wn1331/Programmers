package dev;

public class LV0_100_평행 {

    public static void main(String[] args) {
        //평행이면 1 아니면 0
        int[][] dots = {{1,4},{9,2},{3, 8},{11, 6}};
        //int[][] dots = {{3,5},{4,1},{2,4},{5,10}};
        //각각의 기울기 구하기.4개의 점 고정. 6개의 기울기가 나타나야 함.
        double[] inclination = new double[6];
        int count = 0;
        for(int i = 0; i<dots.length;i++){

            for(int j = i+1;j<dots.length;j++){
                double inc_x = dots[i][0]-dots[j][0];
                System.out.println("x좌표 차 : "+inc_x);
                double inc_y = dots[i][1]-dots[j][1];
                System.out.println("y좌표 차 : "+inc_y);
                double inc = inc_y/inc_x;
                System.out.println("inc값 : "+inc+"이고, count 값 : "+count);
                inclination[count++] = inc;
            }
        }
        //inc배열 출력해보기
        for(double d : inclination) System.out.print(d+" ");
        System.out.println();

        for(int i = 0; i<inclination.length;i++){
            for(int j = i+1;j<inclination.length;j++){
                if(inclination[i]==inclination[j]){
                    System.out.println("일치하는 두 개의 기울기 "+inclination[i]+"와 "+inclination[j]+"가 있습니다.");
                    System.exit(1);
                }
            }
        }
        System.out.println(0);
    }

}

package dev;

public class LV1_28_행렬의_덧셈 {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2},{2,3}}, arr2 = {{3,4},{5,6}};
        int[][] answer = new int[arr1.length][arr1[0].length];
        for(int i = 0; i< answer.length;i++){
            for(int j = 0; j<answer[0].length;j++)answer[i][j] = arr1[i][j] + arr2[i][j];
        }



    }
}

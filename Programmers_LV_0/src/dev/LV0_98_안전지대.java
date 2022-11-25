package dev;

public class LV0_98_안전지대 {

    public static void main(String[] args) {
        int [][] board = {{1, 1, 1, 1, 1}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
        int answer = 0;
        /*
            0 0 0 0 0
            0 0 0 0 0
            0 x x x 0
            0 x 1 x 0
            0 x x x 0
         */
        for(int i = 0; i< board.length;i++){
            for(int j = 0;j<board[i].length;j++){
                if(board[i][j]==1){
                    //바꾸는 인덱스의 값이 1이 아닐때만 변경.
                    try{if(board[i-1][j-1]!=1)board[i-1][j-1]=-1;}catch (Exception e){};
                    try{if(board[i-1][j]!=1)board[i-1][j]=-1;}catch (Exception e){};
                    try{if(board[i-1][j+1]!=1)board[i-1][j+1]=-1;}catch (Exception e){};
                    try{if(board[i][j-1]!=1)board[i][j-1]=-1;}catch (Exception e){};
                    try{if(board[i][j+1]!=1)board[i][j+1]=-1;}catch (Exception e){};
                    try{if(board[i+1][j-1]!=1)board[i+1][j-1]=-1;}catch (Exception e){};
                    try{if(board[i+1][j]!=1)board[i+1][j]=-1;}catch (Exception e){};
                    try{if(board[i+1][j+1]!=1)board[i+1][j+1]=-1;}catch (Exception e){};
                }


            }
        }

        for(int[] bb : board){
            for(int b : bb){
                System.out.printf(b+" ");
                if(b==0)answer++;
            }
            System.out.println();
        }
        System.out.println(answer);

    }

}

import java.util.*;

public class knightConclave {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        NQueens(new int[n][n], 0, "");
    }

    public static boolean isSafe(int chess[][], int row, int col){
        int n = chess.length ;
        int m = chess[0].length ;
        boolean check = true;
        //Vertically up
        if(row-2 >= 0 && col+1 < m){
            if(chess[row-2][col+1] == 1){
                return false;
            }
        }
        if(row-1 >= 0 && col+2 < m){
        if(chess[row-1][col+2] == 1){
            return false;
        }}
        if(row+1 < n && col+2 < m){
        if(chess[row+1][col+2] == 1){
            return false;
        }}
        if(row+2 < n && col+1 < m){
        if(chess[row+2][col+1] == 1){
            return false;
        }}
        if(row+2 < n && col-1 >= 0){
        if(chess[row+2][col-1] == 1){
            return false;
        }}
        if(row+1 < n && col-2 >= 0){
        if(chess[row+1][col-2] == 1){
            return false;
        }}
        if(row-1 >= 0 && col-2 >= 0){
        if(chess[row-1][col-2] == 1){
            return false;
        }}
        if(row-2 >= 0 && col-1 >= 0){
        if(chess[row-2][col-1] == 1){
            return false;
        }}
        return true;
    }

    public static void NQueens(int board[][], int col, String psf){
        if(col+board.length == board.length){
            System.out.println(psf+".");
            return;
        }
        
        for(int row=0; row<board[0].length; row++){
            if(isSafe(board, row, col)){
                board[row][col] = 1;
                NQueens(board, col+1,psf+row+"-"+col+", ");
                board[row][col] = 0;
            }
        }
    }
}
